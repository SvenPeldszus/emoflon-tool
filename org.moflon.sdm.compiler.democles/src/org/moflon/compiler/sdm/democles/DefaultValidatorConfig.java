package org.moflon.compiler.sdm.democles;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.SimpleCombiner;
import org.gervarro.democles.codegen.emf.BasicEMFOperationBuilder;
import org.gervarro.democles.codegen.emf.EMFOperationBuilder;
import org.gervarro.democles.compiler.CompilerPatternBuilder;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.emf.EMFWeightedOperationBuilder;
import org.gervarro.democles.plan.common.DefaultAlgorithm;
import org.gervarro.democles.relational.RelationalOperationBuilder;
import org.gervarro.democles.specification.emf.EMFPatternBuilder;
import org.gervarro.democles.specification.emf.constraint.EMFTypeModule;
import org.gervarro.democles.specification.emf.constraint.PatternInvocationTypeModule;
import org.gervarro.democles.specification.emf.constraint.RelationalTypeModule;
import org.gervarro.democles.specification.impl.DefaultPattern;
import org.gervarro.democles.specification.impl.DefaultPatternBody;
import org.gervarro.democles.specification.impl.DefaultPatternFactory;
import org.gervarro.democles.specification.impl.PatternInvocationConstraintModule;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.sdm.compiler.democles.pattern.PatternFactory;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeFactory;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;
import org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverFactory;

public class DefaultValidatorConfig implements ScopeValidationConfigurator {
	protected final ResourceSet resourceSet;

	private final EMFWeightedOperationBuilder<GeneratorOperation> builder = new EMFWeightedOperationBuilder<>();
	private final DefaultAlgorithm<SimpleCombiner, GeneratorOperation> algorithm = new DefaultAlgorithm<>(
			this.builder);

	// Constraint modules
	final EMFConstraintModule emfTypeModule;
	final EMFTypeModule internalEMFTypeModule;
	final RelationalTypeModule internalRelationalTypeModule = new RelationalTypeModule(CoreConstraintModule.INSTANCE);
	protected final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> bindingAndBlackPatternBuilder = new EMFPatternBuilder<>(
			new DefaultPatternFactory());
	final PatternInvocationConstraintModule<DefaultPattern, DefaultPatternBody> bindingAndBlackPatternInvocationTypeModule = new PatternInvocationConstraintModule<DefaultPattern, DefaultPatternBody>(
			this.bindingAndBlackPatternBuilder);
	final PatternInvocationTypeModule<DefaultPattern, DefaultPatternBody> internalPatternInvocationTypeModule = new PatternInvocationTypeModule<>(
			this.bindingAndBlackPatternInvocationTypeModule);

	// Operation modules (constraint to operation (constraint + adornment) mappings)
	protected final RelationalOperationBuilder relationalOperationBuilder = new RelationalOperationBuilder();
	private final AssignmentOperationBuilder assignmentOperationBuilder = new AssignmentOperationBuilder();
	private final BindingAssignmentOperationBuilder bindingAssignmentOperationBuilder = new BindingAssignmentOperationBuilder();
	private final BasicEMFOperationBuilder basicOperationBuilder = new BasicEMFOperationBuilder();
	protected final EMFOperationBuilder emfBlackOperationBuilder = new EMFOperationBuilder();
	private final EMFRedOperationBuilder emfRedOperationBuilder = new EMFRedOperationBuilder();
	private final EMFGreenOperationBuilder emfGreenOperationBuilder = new EMFGreenOperationBuilder();

	private PatternMatcher bindingAndBlackPatternMatcher;

	private PatternMatcher bindingPatternMatcher;

	private PatternMatcher blackPatternMatcher;

	private PatternMatcher redPatternMatcher;

	private PatternMatcher greenPatternMatcher;

	private PatternMatcher expressionPatternMatcher;

	private final EMoflonPreferencesStorage preferencesStorage;

	public DefaultValidatorConfig(final ResourceSet resourceSet, final EMoflonPreferencesStorage preferencesStorage) {
		this.resourceSet = resourceSet;
		this.preferencesStorage = preferencesStorage;

		this.emfTypeModule = new EMFConstraintModule(this.resourceSet);
		this.internalEMFTypeModule = new EMFTypeModule(this.emfTypeModule);
		this.bindingAndBlackPatternBuilder
		.addConstraintTypeSwitch(this.internalPatternInvocationTypeModule.getConstraintTypeSwitch());
		this.bindingAndBlackPatternBuilder
		.addConstraintTypeSwitch(this.internalRelationalTypeModule.getConstraintTypeSwitch());
		this.bindingAndBlackPatternBuilder.addConstraintTypeSwitch(this.internalEMFTypeModule.getConstraintTypeSwitch());
		this.bindingAndBlackPatternBuilder.addVariableTypeSwitch(this.internalEMFTypeModule.getVariableTypeSwitch());
	}

	@Override
	public Map<String, PatternMatcher> getSearchPlanGenerators() {
		final Map<String, PatternMatcher> searchPlanGenerators = new HashMap<>();
		searchPlanGenerators.put(DemoclesMethodBodyHandler.GREEN_FILE_EXTENSION, getGreenPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.RED_FILE_EXTENSION, getRedPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.BLACK_FILE_EXTENSION, getBlackPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.BINDING_FILE_EXTENSION,
				getBindingPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.BINDING_AND_BLACK_FILE_EXTENSION,
				getBindingAndBlackPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.EXPRESSION_FILE_EXTENSION,
				getExpressionPatternSearchPlanGenerator());
		return searchPlanGenerators;
	}

	@Override
	public ScopeValidator createScopeValidator() {
		final Resource resource = new ResourceImpl(URI.createURI("ScopeValidator"));
		this.resourceSet.getResources().add(resource);
		final var scopeValidator = ScopeFactory.eINSTANCE.createScopeValidator();
		resource.getContents().add(scopeValidator);

		try {
			final Resource expressionTransformerResource = new ResourceImpl(URI.createURI("ExpressionHandler"));
			this.resourceSet.getResources().add(expressionTransformerResource);
			final var constantTransformer = LiteralexpressionsolverFactory.eINSTANCE
					.createConstantTransformer();
			expressionTransformerResource.getContents().add(constantTransformer);
			final var literalExpressionTransformer = PatternFactory.eINSTANCE
					.createLiteralExpressionTransformer();
			expressionTransformerResource.getContents().add(literalExpressionTransformer);
			literalExpressionTransformer.setConstantTransformer(constantTransformer);
			final var expressionTransformer = PatternFactory.eINSTANCE
					.createDefaultExpressionTransformer();
			expressionTransformerResource.getContents().add(expressionTransformer);
			expressionTransformer.setDelegate(literalExpressionTransformer);
			final var expressionExplorer = ScopeFactory.eINSTANCE.createExpressionExplorer();
			expressionTransformerResource.getContents().add(expressionExplorer);
			expressionExplorer.setExpressionTransformer(expressionTransformer);

			setBindingAndBlackPatternMatcher(configureBindingAndBlackPatternMatcher(resource));
			setBindingPatternMatcher(configureBindingPatternMatcher(resource));
			setBlackPatternMatcher(configureBlackPatternMatcher(resource));
			setRedPatternMatcher(configureRedPatternMatcher(resource));
			setGreenPatternMatcher(configureGreenPatternMatcher(resource));
			setExpressionPatternMatcher(configureExpressionPatternMatcher(resource));

			// (1) Handler for regular story nodes
			final var regularStoryNodeActionBuilder = ScopeFactory.eINSTANCE
					.createStoryNodeActionBuilder();
			scopeValidator.getActionBuilders().add(regularStoryNodeActionBuilder);
			regularStoryNodeActionBuilder.setRequiresForEach(false);

			final var regularBindingAndBlackInvocationBuilder = ScopeFactory.eINSTANCE
					.createBindingAndBlackPatternBuilder();
			regularStoryNodeActionBuilder.getChildren().add(regularBindingAndBlackInvocationBuilder);
			regularBindingAndBlackInvocationBuilder
			.setSuffix(DemoclesMethodBodyHandler.BINDING_AND_BLACK_FILE_EXTENSION);
			regularBindingAndBlackInvocationBuilder.setMainActionBuilder(true);
			regularBindingAndBlackInvocationBuilder.setPatternMatcher(getBindingAndBlackPatternSearchPlanGenerator());

			final var regularBindingExpressionBuilder = ScopeFactory.eINSTANCE
					.createBindingExpressionBuilder();
			regularBindingAndBlackInvocationBuilder.getChildBuilders().add(regularBindingExpressionBuilder);
			final var regularBindingPatternTransformer = PatternFactory.eINSTANCE
					.createBindingPatternTransformer();
			regularBindingExpressionBuilder.setPatternTransformer(regularBindingPatternTransformer);
			regularBindingExpressionBuilder.setExpressionExplorer(expressionExplorer);
			regularBindingExpressionBuilder.setSuffix(DemoclesMethodBodyHandler.BINDING_FILE_EXTENSION);
			regularBindingExpressionBuilder.setMainActionBuilder(false);
			regularBindingExpressionBuilder.setPatternMatcher(getBindingPatternSearchPlanGenerator());
			regularBindingPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var regularBlackInvocationBuilder = ScopeFactory.eINSTANCE
					.createBlackPatternBuilder();
			regularBindingAndBlackInvocationBuilder.getChildBuilders().add(regularBlackInvocationBuilder);
			regularBindingAndBlackInvocationBuilder.setBlackPatternBuilder(regularBlackInvocationBuilder);
			final var regularBlackPatternTransformer = PatternFactory.eINSTANCE
					.createBlackAndNacPatternTransformer();
			regularBlackInvocationBuilder.setPatternTransformer(regularBlackPatternTransformer);
			regularBlackInvocationBuilder.setExpressionExplorer(expressionExplorer);
			regularBlackInvocationBuilder.setSuffix(DemoclesMethodBodyHandler.BLACK_FILE_EXTENSION);
			regularBlackInvocationBuilder.setMainActionBuilder(true);
			regularBlackInvocationBuilder.setPatternMatcher(getBlackPatternSearchPlanGenerator());
			regularBlackPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var regularNacPatternBuilder = ScopeFactory.eINSTANCE.createNacPatternBuilder();
			regularBlackInvocationBuilder.getChildBuilders().add(regularNacPatternBuilder);
			final var regularNacPatternTransformer = PatternFactory.eINSTANCE
					.createNacPatternTransformer();
			regularNacPatternBuilder.setPatternTransformer(regularNacPatternTransformer);
			regularNacPatternBuilder.setExpressionExplorer(expressionExplorer);
			regularNacPatternBuilder.setMainActionBuilder(false);
			regularNacPatternBuilder.setPatternMatcher(getBlackPatternSearchPlanGenerator());
			regularNacPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var regularRedInvocationBuilder = ScopeFactory.eINSTANCE.createRedPatternBuilder();
			regularStoryNodeActionBuilder.getChildren().add(regularRedInvocationBuilder);
			final var regularRedPatternTransformer = PatternFactory.eINSTANCE
					.createRedPatternTransformer();
			regularRedInvocationBuilder.setPatternTransformer(regularRedPatternTransformer);
			regularRedInvocationBuilder.setExpressionExplorer(expressionExplorer);
			regularRedInvocationBuilder.setSuffix(DemoclesMethodBodyHandler.RED_FILE_EXTENSION);
			regularRedInvocationBuilder.setMainActionBuilder(false);
			regularRedInvocationBuilder.setPatternMatcher(getRedPatternSearchPlanGenerator());
			regularRedPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var regularGreenInvocationBuilder = ScopeFactory.eINSTANCE
					.createGreenPatternBuilder();
			regularStoryNodeActionBuilder.getChildren().add(regularGreenInvocationBuilder);
			final var regularGreenPatternTransformer = PatternFactory.eINSTANCE
					.createGreenPatternTransformer();
			regularGreenInvocationBuilder.setPatternTransformer(regularGreenPatternTransformer);
			regularGreenInvocationBuilder.setExpressionExplorer(expressionExplorer);
			regularGreenInvocationBuilder.setSuffix(DemoclesMethodBodyHandler.GREEN_FILE_EXTENSION);
			regularGreenInvocationBuilder.setMainActionBuilder(true);
			regularGreenInvocationBuilder.setPatternMatcher(getGreenPatternSearchPlanGenerator());
			regularGreenPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var regularRedNodeDeletionBuilder = ScopeFactory.eINSTANCE
					.createRedNodeDeletionBuilder();
			regularStoryNodeActionBuilder.getChildren().add(regularRedNodeDeletionBuilder);

			// (2) Handler for ForEach story nodes
			final var forEachStoryNodeActionBuilder = ScopeFactory.eINSTANCE
					.createStoryNodeActionBuilder();
			scopeValidator.getActionBuilders().add(forEachStoryNodeActionBuilder);
			forEachStoryNodeActionBuilder.setRequiresForEach(true);

			final var forEachBindingExpressionBuilder = ScopeFactory.eINSTANCE
					.createBindingExpressionBuilder();
			forEachStoryNodeActionBuilder.getChildren().add(forEachBindingExpressionBuilder);
			final var forEachBindingPatternTransformer = PatternFactory.eINSTANCE
					.createBindingPatternTransformer();
			forEachBindingExpressionBuilder.setPatternTransformer(forEachBindingPatternTransformer);
			forEachBindingExpressionBuilder.setExpressionExplorer(expressionExplorer);
			forEachBindingExpressionBuilder.setSuffix(DemoclesMethodBodyHandler.BINDING_FILE_EXTENSION);
			forEachBindingExpressionBuilder.setMainActionBuilder(false);
			forEachBindingExpressionBuilder.setPatternMatcher(getBindingPatternSearchPlanGenerator());
			forEachBindingPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var forEachBlackInvocationBuilder = ScopeFactory.eINSTANCE
					.createBlackPatternBuilder();
			forEachStoryNodeActionBuilder.getChildren().add(forEachBlackInvocationBuilder);
			final var forEachBlackPatternTransformer = PatternFactory.eINSTANCE
					.createBlackAndNacPatternTransformer();
			forEachBlackInvocationBuilder.setPatternTransformer(forEachBlackPatternTransformer);
			forEachBlackInvocationBuilder.setExpressionExplorer(expressionExplorer);
			forEachBlackInvocationBuilder.setSuffix(DemoclesMethodBodyHandler.BLACK_FILE_EXTENSION);
			forEachBlackInvocationBuilder.setMainActionBuilder(true);
			forEachBlackInvocationBuilder.setPatternMatcher(getBlackPatternSearchPlanGenerator());
			forEachBlackPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var forEachNacPatternBuilder = ScopeFactory.eINSTANCE.createNacPatternBuilder();
			forEachBlackInvocationBuilder.getChildBuilders().add(forEachNacPatternBuilder);
			final var forEachNacPatternTransformer = PatternFactory.eINSTANCE
					.createNacPatternTransformer();
			forEachNacPatternBuilder.setPatternTransformer(forEachNacPatternTransformer);
			forEachNacPatternBuilder.setExpressionExplorer(expressionExplorer);
			forEachNacPatternBuilder.setMainActionBuilder(false);
			forEachNacPatternBuilder.setPatternMatcher(getBlackPatternSearchPlanGenerator());
			forEachNacPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var forEachRedInvocationBuilder = ScopeFactory.eINSTANCE.createRedPatternBuilder();
			forEachStoryNodeActionBuilder.getChildren().add(forEachRedInvocationBuilder);
			final var forEachRedPatternTransformer = PatternFactory.eINSTANCE
					.createRedPatternTransformer();
			forEachRedInvocationBuilder.setPatternTransformer(forEachRedPatternTransformer);
			forEachRedInvocationBuilder.setExpressionExplorer(expressionExplorer);
			forEachRedInvocationBuilder.setSuffix(DemoclesMethodBodyHandler.RED_FILE_EXTENSION);
			forEachRedInvocationBuilder.setMainActionBuilder(false);
			forEachRedInvocationBuilder.setPatternMatcher(getRedPatternSearchPlanGenerator());
			forEachRedPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var forEachGreenInvocationBuilder = ScopeFactory.eINSTANCE
					.createGreenPatternBuilder();
			forEachStoryNodeActionBuilder.getChildren().add(forEachGreenInvocationBuilder);
			final var forEachGreenPatternTransformer = PatternFactory.eINSTANCE
					.createGreenPatternTransformer();
			forEachGreenInvocationBuilder.setPatternTransformer(forEachGreenPatternTransformer);
			forEachGreenInvocationBuilder.setExpressionExplorer(expressionExplorer);
			forEachGreenInvocationBuilder.setSuffix(DemoclesMethodBodyHandler.GREEN_FILE_EXTENSION);
			forEachGreenInvocationBuilder.setMainActionBuilder(true);
			forEachGreenInvocationBuilder.setPatternMatcher(getGreenPatternSearchPlanGenerator());
			forEachGreenPatternTransformer.setExpressionTransformer(expressionTransformer);

			final var forEachRedNodeDeletionBuilder = ScopeFactory.eINSTANCE
					.createRedNodeDeletionBuilder();
			forEachStoryNodeActionBuilder.getChildren().add(forEachRedNodeDeletionBuilder);

			// (3) Handler for statement and stop nodes
			final var expressionActionBuilder = ScopeFactory.eINSTANCE
					.createSingleResultPatternInvocationBuilder();
			scopeValidator.getActionBuilders().add(expressionActionBuilder);
			final var expressionPatternTransformer = PatternFactory.eINSTANCE.createPatternTransformer();
			expressionActionBuilder.setPatternVariableHandler(expressionPatternTransformer);
			expressionActionBuilder.setExpressionExplorer(expressionExplorer);
			expressionActionBuilder.setSuffix(DemoclesMethodBodyHandler.EXPRESSION_FILE_EXTENSION);
			expressionActionBuilder.setPatternMatcher(this.expressionPatternMatcher);
			expressionPatternTransformer.setExpressionTransformer(expressionTransformer);
		} catch (final IOException e) {
			// Do nothing
		}
		return scopeValidator;
	}

	public EMoflonPreferencesStorage getPreferencesStorage() {
		return this.preferencesStorage;
	}

	protected PatternMatcher getBindingAndBlackPatternSearchPlanGenerator() {
		return this.bindingAndBlackPatternMatcher;
	}

	protected PatternMatcher getBindingPatternSearchPlanGenerator() {
		return this.bindingPatternMatcher;
	}

	protected PatternMatcher getBlackPatternSearchPlanGenerator() {
		return this.blackPatternMatcher;
	}

	protected PatternMatcher getRedPatternSearchPlanGenerator() {
		return this.redPatternMatcher;
	}

	protected PatternMatcher getGreenPatternSearchPlanGenerator() {
		return this.greenPatternMatcher;
	}

	protected PatternMatcher getExpressionPatternSearchPlanGenerator() {
		return this.expressionPatternMatcher;
	}

	protected void setBindingAndBlackPatternMatcher(final PatternMatcher bindingAndBlackPatternMatcher) {
		this.bindingAndBlackPatternMatcher = bindingAndBlackPatternMatcher;
	}

	protected void setBindingPatternMatcher(final PatternMatcher bindingPatternMatcher) {
		this.bindingPatternMatcher = bindingPatternMatcher;
	}

	protected void setBlackPatternMatcher(final PatternMatcher blackPatternMatcher) {
		this.blackPatternMatcher = blackPatternMatcher;
	}

	protected void setRedPatternMatcher(final PatternMatcher redPatternMatcher) {
		this.redPatternMatcher = redPatternMatcher;
	}

	protected void setGreenPatternMatcher(final PatternMatcher greenPatternMatcher) {
		this.greenPatternMatcher = greenPatternMatcher;
	}

	protected void setExpressionPatternMatcher(final PatternMatcher expressionPatternMatcher) {
		this.expressionPatternMatcher = expressionPatternMatcher;
	}

	protected PatternMatcher configureBindingAndBlackPatternMatcher(final Resource resource) throws IOException {
		return configureBindingAndBlackPatternMatcherCompiler(resource);
	}

	protected PatternMatcherCompiler configureBindingAndBlackPatternMatcherCompiler(final Resource resource) {
		// Configuring binding & black pattern matcher
		final var bindingAndBlackCompilerPatternBuilder = new CompilerPatternBuilder();
		bindingAndBlackCompilerPatternBuilder.addOperationBuilder(this.basicOperationBuilder);
		bindingAndBlackCompilerPatternBuilder.setAlgorithm(this.algorithm);

		final PatternMatcherCompiler bindingAndBlackPatternMatcherCompiler = new BindingAndBlackPatternMatcherCompiler(
				this.bindingAndBlackPatternBuilder, bindingAndBlackCompilerPatternBuilder);
		resource.getContents().add(bindingAndBlackPatternMatcherCompiler);
		return bindingAndBlackPatternMatcherCompiler;
	}

	protected PatternMatcher configureBindingPatternMatcher(final Resource resource) throws IOException {
		return configureBindingPatternMatcherCompiler(resource);
	}

	protected PatternMatcherCompiler configureBindingPatternMatcherCompiler(final Resource resource) {
		// Configuring binding pattern matcher
		// final EMFPatternBuilder<DefaultPattern, DefaultPatternBody>
		// bindingPatternBuilder =
		// new EMFPatternBuilder<DefaultPattern, DefaultPatternBody>(new
		// DefaultPatternFactory());
		// bindingPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		// bindingPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		// bindingPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

		final var bindingCompilerPatternBuilder = new CompilerPatternBuilder();
		bindingCompilerPatternBuilder.addOperationBuilder(this.basicOperationBuilder);
		bindingCompilerPatternBuilder.addOperationBuilder(this.bindingAssignmentOperationBuilder);
		bindingCompilerPatternBuilder.setAlgorithm(this.algorithm);

		final var bindingPatternMatcherCompiler = new PatternMatcherCompiler(
				this.bindingAndBlackPatternBuilder, bindingCompilerPatternBuilder);
		resource.getContents().add(bindingPatternMatcherCompiler);
		return bindingPatternMatcherCompiler;
	}

	protected PatternMatcher configureBlackPatternMatcher(final Resource resource) throws IOException {
		return configureBlackPatternMatcherCompiler(resource);
	}

	protected PatternMatcherCompiler configureBlackPatternMatcherCompiler(final Resource resource) {
		// Configuring black pattern matcher
		// final EMFPatternBuilder<DefaultPattern, DefaultPatternBody>
		// blackPatternBuilder =
		// new EMFPatternBuilder<DefaultPattern, DefaultPatternBody>(new
		// DefaultPatternFactory());
		// final PatternInvocationConstraintModule<DefaultPattern, DefaultPatternBody>
		// patternInvocationTypeModule =
		// new PatternInvocationConstraintModule<DefaultPattern,
		// DefaultPatternBody>(blackPatternBuilder);
		// final PatternInvocationTypeModule<DefaultPattern, DefaultPatternBody>
		// internalPatternInvocationTypeModule =
		// new PatternInvocationTypeModule<DefaultPattern,
		// DefaultPatternBody>(patternInvocationTypeModule);
		// blackPatternBuilder.addConstraintTypeSwitch(internalPatternInvocationTypeModule.getConstraintTypeSwitch());
		// blackPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		// blackPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		// blackPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

		final var blackCompilerPatternBuilder = new CompilerPatternBuilder();
		blackCompilerPatternBuilder.addOperationBuilder(this.emfBlackOperationBuilder);
		blackCompilerPatternBuilder.addOperationBuilder(this.relationalOperationBuilder);
		blackCompilerPatternBuilder.setAlgorithm(this.algorithm);

		final var blackPatternMatcherCompiler = new PatternMatcherCompiler(
				this.bindingAndBlackPatternBuilder, blackCompilerPatternBuilder);
		resource.getContents().add(blackPatternMatcherCompiler);
		return blackPatternMatcherCompiler;
	}

	protected PatternMatcher configureRedPatternMatcher(final Resource resource) throws IOException {
		return configureRedPatternMatcherCompiler(resource);
	}

	protected PatternMatcherCompiler configureRedPatternMatcherCompiler(final Resource resource) {
		// Configuring red pattern matcher
		final var redPatternBuilder = new EMFPatternBuilder<>(
				new DefaultPatternFactory());
		redPatternBuilder.addConstraintTypeSwitch(this.internalEMFTypeModule.getConstraintTypeSwitch());
		redPatternBuilder.addVariableTypeSwitch(this.internalEMFTypeModule.getVariableTypeSwitch());

		final var redCompilerPatternBuilder = new CompilerPatternBuilder();
		redCompilerPatternBuilder.addOperationBuilder(this.emfRedOperationBuilder);
		redCompilerPatternBuilder.setAlgorithm(this.algorithm);

		final var redPatternMatcherCompiler = new PatternMatcherCompiler(redPatternBuilder,
				redCompilerPatternBuilder);
		resource.getContents().add(redPatternMatcherCompiler);
		return redPatternMatcherCompiler;
	}

	protected PatternMatcher configureGreenPatternMatcher(final Resource resource) throws IOException {
		return configureGreenPatternMatcherCompiler(resource);
	}

	protected PatternMatcherCompiler configureGreenPatternMatcherCompiler(final Resource resource) {
		// Configuring green pattern matcher
		final var greenPatternBuilder = new EMFPatternBuilder<>(
				new DefaultPatternFactory());
		greenPatternBuilder.addConstraintTypeSwitch(this.internalRelationalTypeModule.getConstraintTypeSwitch());
		greenPatternBuilder.addConstraintTypeSwitch(this.internalEMFTypeModule.getConstraintTypeSwitch());
		greenPatternBuilder.addVariableTypeSwitch(this.internalEMFTypeModule.getVariableTypeSwitch());

		final var greenCompilerPatternBuilder = new CompilerPatternBuilder();
		greenCompilerPatternBuilder.addOperationBuilder(this.assignmentOperationBuilder);
		greenCompilerPatternBuilder.addOperationBuilder(this.emfGreenOperationBuilder);
		greenCompilerPatternBuilder.setAlgorithm(this.algorithm);

		final var greenPatternMatcherCompiler = new PatternMatcherCompiler(greenPatternBuilder,
				greenCompilerPatternBuilder);
		resource.getContents().add(greenPatternMatcherCompiler);
		return greenPatternMatcherCompiler;
	}

	protected PatternMatcher configureExpressionPatternMatcher(final Resource resource) throws IOException {
		return configureExpressionPatternMatcherCompiler(resource);
	}

	protected PatternMatcherCompiler configureExpressionPatternMatcherCompiler(final Resource resource) {
		// Configuring expression pattern matcher
		final var expressionPatternBuilder = new EMFPatternBuilder<>(
				new DefaultPatternFactory());
		expressionPatternBuilder.addConstraintTypeSwitch(this.internalRelationalTypeModule.getConstraintTypeSwitch());
		expressionPatternBuilder.addVariableTypeSwitch(this.internalEMFTypeModule.getVariableTypeSwitch());
		expressionPatternBuilder.addConstraintTypeSwitch(this.internalEMFTypeModule.getConstraintTypeSwitch());

		final var expressionCompilerPatternBuilder = new CompilerPatternBuilder();
		expressionCompilerPatternBuilder.addOperationBuilder(this.assignmentOperationBuilder);
		expressionCompilerPatternBuilder.addOperationBuilder(this.basicOperationBuilder);
		expressionCompilerPatternBuilder.setAlgorithm(this.algorithm);

		final var expressionPatternMatcherCompiler = new PatternMatcherCompiler(
				expressionPatternBuilder, expressionCompilerPatternBuilder);
		resource.getContents().add(expressionPatternMatcherCompiler);
		return expressionPatternMatcherCompiler;
	}

	@Override
	public TemplateConfigurationProvider createTemplateConfiguration(final GenModel genModel) {
		return new DefaultTemplateConfiguration(genModel);
	}
}
