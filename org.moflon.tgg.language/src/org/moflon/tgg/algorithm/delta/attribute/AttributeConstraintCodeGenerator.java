package org.moflon.tgg.algorithm.delta.attribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.moflon.tgg.csp.codegenerator.MyBasicFormatRenderer;
import org.moflon.tgg.language.DomainType;
import org.moflon.tgg.language.TGGObjectVariable;
import org.moflon.tgg.language.TGGRule;
import org.moflon.tgg.language.compiler.TGGCompiler;
import org.moflon.tgg.language.compiler.compilerfacade.CompilerfacadeFactory;
import org.moflon.tgg.language.csp.AttributeVariable;
import org.moflon.tgg.language.csp.CspFactory;
import org.moflon.tgg.language.csp.Literal;
import org.moflon.tgg.language.csp.LocalVariable;
import org.moflon.tgg.language.csp.OperationalCSP;
import org.moflon.tgg.language.csp.TGGConstraint;
import org.moflon.tgg.language.csp.Variable;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import SDMLanguage.expressions.ComparingOperator;
import SDMLanguage.expressions.ComparisonExpression;
import SDMLanguage.expressions.Expression;
import SDMLanguage.expressions.LiteralExpression;
import SDMLanguage.patterns.AttributeAssignment;
import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.BindingSemantics;
import SDMLanguage.patterns.Constraint;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.patternExpressions.AttributeValueExpression;

public class AttributeConstraintCodeGenerator {
	private TGGRule rule;

	private String name;

	private String separator;

	private STGroupFile stg;

	ArrayList<String> source;

	ArrayList<String> target;

	private StringBuilder code;

	private ArrayList<AttributConstraintContainer> csp_solver;

	private OperationalCSP ocsp;

	public AttributeConstraintCodeGenerator(final TGGRule rule, final String name, final TGGCompiler compiler) {
		this.separator = "\n\n";
		this.stg = new STGroupFile(this.getClass().getClassLoader().getResource("/templates/Csp.stg"), "UTF-8", '<',
				'>');
		this.stg.registerRenderer(String.class, new MyBasicFormatRenderer());
		this.code = new StringBuilder();

		this.rule = rule;
		this.name = name;

		locateObjectVariables();
		initOCSP();
	}

	public String getInjection() {
		createAttributeConstraintRuleResult();
		handleAttributeAssignmentsAndConstraints();
		handleCSPSolving();
		return this.code.toString();
	}

	private void locateObjectVariables() {
		this.source = new ArrayList<>();
		this.target = new ArrayList<>();

		for (final ObjectVariable ov : this.rule.getObjectVariable()) {
			if (ov instanceof TGGObjectVariable) {
				final var tggOV = (TGGObjectVariable) ov;
				if (tggOV.getDomain().getType() == DomainType.SOURCE) {
					this.source.add(ov.getName());
				}
				if (tggOV.getDomain().getType() == DomainType.TARGET) {
					this.target.add(ov.getName());
				}
			}
		}
	}

	private void initOCSP() {
		final var csp = EcoreUtil.copy(this.rule.getCsp());
		this.ocsp = CspFactory.eINSTANCE.createOperationalCSP();
		this.ocsp.getConstraints().addAll(csp.getConstraints());
		this.ocsp.getVariables().addAll(csp.getVariables());

		// First of all everything bound apart from local variables
		this.ocsp.getVariables().forEach(v -> {
			if (!(v instanceof LocalVariable)) {
				v.setBound(true);
			}
		});

		// If OV is green in the rule then it may be changed to free (for the right
		// domain)
		final var destVarNames = isOutputDomainTarget() ? this.target : this.source;
		final var destVars = getDestVariables(this.ocsp.getVariables(), destVarNames);
		destVars.forEach(v -> {
			if (v instanceof AttributeVariable) {
				final var av = AttributeVariable.class.cast(v);
				this.rule.getObjectVariable().forEach(ov -> {
					if (ov.getName().equals(av.getObjectVariable())
							&& ov.getBindingOperator().equals(BindingOperator.CREATE)) {
						v.setBound(false);
					}
				});
			}
		});

		// Solve the CSP to ensure that this bounding state is possible
		final var plan = CompilerfacadeFactory.eINSTANCE.createCSPSearchPlanAdapter();
		plan.computeConstraintOrder(this.ocsp);
	}

	private void createAttributeConstraintRuleResult() {
		final ST rR = this.stg.getInstanceOf("createRuleResult");
		rR.add("ruleName", this.rule.getName());
		this.code.append(rR.render() + this.separator);
	}

	private String getOperand(final Expression expression) {
		if (expression instanceof LiteralExpression) {
			return ((LiteralExpression) expression).getValue();
		}

		AttributeValueExpression attrValueExp;
		if (expression instanceof AttributeValueExpression) {
			attrValueExp = (AttributeValueExpression) expression;
			return attrValueExp.getAttribute().getName();
		}

		return "null";
	}

	private Collection<Variable> getDestVariables(final Collection<Variable> variables,
			final Collection<String> relevantOVs) {
		return variables.stream().filter(v -> {
			if (v instanceof AttributeVariable) {
				final var av = (AttributeVariable) v;
				if (relevantOVs.contains(av.getObjectVariable())) {
					return true;
				}
			}

			return false;
		}).collect(Collectors.toList());
	}

	private void handleAttributeAssignmentsAndConstraints() {
		final var locateObjects = new StringBuilder();
		final var attrConsResult = new StringBuilder();

		final var ovs = this.rule.getObjectVariable();

		// create Mapping for AttributeConstraints
		for (final ObjectVariable ov : ovs) {
			if (ov.getBindingSemantics().equals(BindingSemantics.NEGATIVE)) {
				continue;
			}

			// handle AttributeAssignments
			for (final AttributeAssignment a : ov.getAttributeAssignment()) {
				final var ovName = a.getObjectVariable().getName();
				final var attrName = a.getAttribute().getName();
				final var expectedValue = getOperand(a.getValueExpression());
				attrConsResult.append(
						buildAssignmentsAndConstraints(ovName, attrName, expectedValue, ComparingOperator.EQUAL));
				attrConsResult.append(this.separator);
			}

			// handle Constraints
			for (final Constraint c : ov.getConstraint()) {
				final var exp = c.getConstraintExpression();
				if (exp instanceof ComparisonExpression) {
					final var attrName = getOperand(((ComparisonExpression) exp).getLeftExpression());
					final var expectedValue = getOperand(((ComparisonExpression) exp).getRightExpression());
					final var comp = ((ComparisonExpression) exp).getOperator();
					attrConsResult.append(buildAssignmentsAndConstraints(ov.getName(), attrName, expectedValue, comp));
					attrConsResult.append(this.separator);
				}
			}
		}

		this.code.append(locateObjects.toString() + attrConsResult + this.separator);
	}

	private String buildAssignmentsAndConstraints(final String ovName, final String attrName,
			final String expectedValue, final ComparingOperator comp) {
		final ST assignmentsAndConstraints = this.stg.getInstanceOf("check_constraints");
		assignmentsAndConstraints.add("ovName", ovName);
		assignmentsAndConstraints.add("attrName", attrName);
		assignmentsAndConstraints.add("expectedValue", expectedValue);
		assignmentsAndConstraints.add("comp", comp);

		return assignmentsAndConstraints.render();
	}

	private Map<Variable, String> handleVariableValueExtraction(final OperationalCSP ocsp) {
		final Map<Variable, String> varToLabel = new HashMap<>();

		var j = 0;
		var k = 0;
		for (final Variable v : ocsp.getVariables()) {
			if (v instanceof AttributeVariable) {
				final var aV = (AttributeVariable) v;
				final var label = "var_" + aV.getObjectVariable() + "_" + aV.getAttribute();

				final ST bV = this.stg.getInstanceOf("BoundAttributeVariableGeneric");
				bV.add("var_name", label);
				bV.add("name", aV.getObjectVariable());
				bV.add("value", aV.getAttribute());
				bV.add("type", aV.getType());
				this.code.append(bV.render() + this.separator);

				varToLabel.put(v, label);
			} else if (v instanceof Literal) {
				final var label = "var_literal" + j;

				final ST bV = this.stg.getInstanceOf("BoundLiteralGeneric");
				bV.add("var_name", label);
				bV.add("name", "literal");
				bV.add("value", v.getValue());
				bV.add("type", v.getType());
				this.code.append(bV.render() + this.separator);
				j++;

				varToLabel.put(v, label);
			} else if (v instanceof LocalVariable) {
				final var label = "var_local" + k;

				final ST fV = this.stg.getInstanceOf("UnboundVariable");
				fV.add("var_name", label);
				fV.add("name", "local");
				fV.add("type", v.getType());
				this.code.append(fV.render() + this.separator);
				k++;

				varToLabel.put(v, label);
			}

		}

		return varToLabel;
	}

	private void handleCSPSolving() {
		final Collection<Variable> allFreeVars = this.ocsp.getVariables().stream().filter(v -> !v.isBound())
				.collect(Collectors.toList());
		final var varToLabel = handleVariableValueExtraction(this.ocsp);
		this.csp_solver = new ArrayList<>();
		var i = 0;
		for (final TGGConstraint c : this.ocsp.getConstraints()) {
			final var container = new AttributConstraintContainer(this.rule.getName());
			container.setInstanceName(c.getName() + i);

			if (c.getName().equals("eq")) {
				container.setEq(true);
			} else {
				container.setConstraint(c.getName());
			}

			final Collection<String> solveVars = c.getVariables().stream().map(v -> varToLabel.get(v))
					.collect(Collectors.toList());
			container.setSolveVars(solveVars);

			final Collection<Variable> freeVars = allFreeVars.stream()
					.filter(v -> c.getVariables().contains(v) && (v instanceof AttributeVariable))
					.collect(Collectors.toList());
			container.setDestinationVars(freeVars);

			this.csp_solver.add(container);
			i++;
		}

		createAttributeConstraints();
		createSolveConstraints();
		createCheckCSP();
	}

	private boolean isOutputDomainTarget() {
		return this.name.endsWith("FWD");
	}

	private void createAttributeConstraints() {
		for (final AttributConstraintContainer con : this.csp_solver) {
			ST template;
			if (con.isEq()) {
				template = this.stg.getInstanceOf("Eq");
			} else {
				template = this.stg.getInstanceOf("Constraint");
				template.add("constraint", con.getConstraint());
			}

			template.add("instanceName", con.getInstanceName());
			this.code.append(template.render());

			final ST templateAdd = this.stg.getInstanceOf("AddConstraints");
			templateAdd.add("constraints", con.getInstanceName());
			this.code.append(templateAdd.render() + this.separator);
		}
	}

	private void createSolveConstraints() {
		for (final AttributConstraintContainer con : this.csp_solver) {
			final ST template = this.stg.getInstanceOf("Solve");
			template.add("constraint", con.getInstanceName());
			template.add("variables", con.getSolveVars());
			template.add("ruleName", con.getRuleName());
			this.code.append(template.render() + this.separator);
		}
	}

	private void createCheckCSP() {
		final var destination = new ArrayList<>();
		for (final AttributConstraintContainer con : this.csp_solver) {
			destination.addAll(con.getDestinationVars());
		}

		final ST template = this.stg.getInstanceOf("check_csp");
		template.add("target", destination);
		template.add("constraints", this.csp_solver);
		this.code.append(template.render() + this.separator + "return ruleResult;");
	}
}