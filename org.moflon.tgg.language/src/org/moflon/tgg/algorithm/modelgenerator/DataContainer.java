package org.moflon.tgg.algorithm.modelgenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.language.DomainType;
import org.moflon.tgg.language.TGGLinkVariable;
import org.moflon.tgg.language.TGGObjectVariable;
import org.moflon.tgg.language.TGGRule;
import org.moflon.tgg.language.algorithm.AlgorithmFactory;
import org.moflon.tgg.language.algorithm.TempOutputContainer;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;

import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;

public class DataContainer {

	private final ModelgenStats modelgenStats;

	private final Map<EClass, List<EObject>> eclassToObjects = new HashMap<>();

	private final ResourceSet resourceSet;

	private final TempOutputContainer srcTempOutputContainer, trgTempOutputContainer;

	private final CorrespondenceModel correspondenceModel;

	private final Map<String, RuleAnalysis> ruleNameToAnalaysis = new HashMap<>();

	public DataContainer() {

		this.resourceSet = eMoflonEMFUtil.createDefaultResourceSet();

		this.srcTempOutputContainer = AlgorithmFactory.eINSTANCE.createTempOutputContainer();
		this.resourceSet.createResource(eMoflonEMFUtil.createFileURI("srcTempOutputContainer", false)).getContents()
		.add(this.srcTempOutputContainer);

		this.trgTempOutputContainer = AlgorithmFactory.eINSTANCE.createTempOutputContainer();
		this.resourceSet.createResource(eMoflonEMFUtil.createFileURI("trgTempOutputContainer", false)).getContents()
		.add(this.trgTempOutputContainer);

		this.correspondenceModel = RuntimeFactory.eINSTANCE.createCorrespondenceModel();
		this.resourceSet.createResource(eMoflonEMFUtil.createFileURI("correspondenceModel", false)).getContents()
		.add(this.correspondenceModel);

		this.modelgenStats = new ModelgenStats();

	}

	public ResourceSet getResourceSet() {
		return this.resourceSet;
	}

	public void extractGeneratedObjects(final ModelgeneratorRuleResult result, final long duration) {

		final ModelgeneratorRuleResult ruleResult = result;

		final List<EObject> tempList = new ArrayList<>(ruleResult.getSourceObjects());

		tempList.addAll(ruleResult.getTargetObjects());

		for (final EObject eobject : tempList) {
			final EClass eobjectEClass = eobject.eClass();
			addNewObjectToMap(eobject, eobjectEClass);
		}
		for (final EObject eobject : ruleResult.getCorrObjects()) {
			final EClass eobjectEClass = eobject.eClass();
			addNewObjectToMap(eobject, eobjectEClass);
			for (final EClass superClass : eobjectEClass.getESuperTypes()) {
				if (!superClass.getName().equals("AbstractCorrespondence")) {
					addNewObjectToMap(eobject, superClass);
				}
			}
		}

		addToContainerIfNecessary(ruleResult.getSourceObjects(), this.srcTempOutputContainer.getPotentialRoots());
		addToContainerIfNecessary(ruleResult.getTargetObjects(), this.trgTempOutputContainer.getPotentialRoots());
		addToContainerIfNecessary(ruleResult.getCorrObjects(), this.correspondenceModel.getCorrespondences());

		this.modelgenStats.updateRulePerformCount(ruleResult.getRule(), ruleResult.getPerformCount());
		this.modelgenStats.updateRuleDuration(ruleResult.getRule(), duration);

		if (this.ruleNameToAnalaysis.containsKey(ruleResult.getRule())) {
			this.modelgenStats.updateNodeEdgeCount(this.ruleNameToAnalaysis.get(ruleResult.getRule()),
					ruleResult.getPerformCount());
		}
	}

	private void addNewObjectToMap(final EObject eobject, final EClass eobjectEClass) {
		if (this.eclassToObjects.containsKey(eobjectEClass)) {
			this.eclassToObjects.get(eobjectEClass).add(eobject);
		} else {
			final List<EObject> newEntryList = new ArrayList<>();
			newEntryList.add(eobject);
			this.eclassToObjects.put(eobjectEClass, newEntryList);
		}
	}

	private <T extends EObject> void addToContainerIfNecessary(final List<T> from, final EList<T> to) {
		for (final T eObject : from) {
			if (eObject.eContainer() == null) {
				to.add(eObject);
			}
		}
	}

	public List<EObject> getTypedEObjects(final EClassifier eType) {
		return this.eclassToObjects.get(eType);
	}

	public TempOutputContainer getSrcTempOutputContainer() {
		return this.srcTempOutputContainer;
	}

	public TempOutputContainer getTrgTempOutputContainer() {
		return this.trgTempOutputContainer;
	}

	public CorrespondenceModel getCorrespondenceModel() {
		return this.correspondenceModel;
	}

	public ModelgenStats getModelgenStats() {
		return this.modelgenStats;
	}

	public Map<String, RuleAnalysis> getRuleNameToAnalaysis() {
		return this.ruleNameToAnalaysis;
	}

	public void createRuleAnalysis(final TGGRule rule) {
		final RuleAnalysis newAnalysis = new RuleAnalysis(rule.getName());
		for (final ObjectVariable ov2 : rule.getObjectVariable()) {
			if ((ov2 instanceof TGGObjectVariable) && (ov2.getBindingOperator() == BindingOperator.CREATE)) {
				final TGGObjectVariable ov = (TGGObjectVariable) ov2;
				if (ov.getDomain().getType() == DomainType.SOURCE) {
					newAnalysis.setGreenSrcNodes(newAnalysis.getGreenSrcNodes() + 1);
				} else if (ov.getDomain().getType() == DomainType.TARGET) {
					newAnalysis.setGreenTrgNodes(newAnalysis.getGreenTrgNodes() + 1);
				} else if (ov.getDomain().getType() == DomainType.CORRESPONDENCE) {
					newAnalysis.setGreenCorrNodes(newAnalysis.getGreenCorrNodes() + 1);
				}
			}
		}
		for (final LinkVariable lv2 : rule.getLinkVariable()) {
			if ((lv2 instanceof TGGLinkVariable) && (lv2.getBindingOperator() == BindingOperator.CREATE)) {
				final TGGLinkVariable lv = (TGGLinkVariable) lv2;
				if (lv.getDomain().getType() == DomainType.SOURCE) {
					newAnalysis.setGreenSrcEdges(newAnalysis.getGreenSrcEdges() + 1);
				} else if (lv.getDomain().getType() == DomainType.TARGET) {
					newAnalysis.setGreenTrgEdges(newAnalysis.getGreenTrgEdges() + 1);
				} else if (lv.getDomain().getType() == DomainType.CORRESPONDENCE) {
					newAnalysis.setGreenCorrEdges(newAnalysis.getGreenCorrEdges() + 1);
				}
			}
		}
		this.ruleNameToAnalaysis.put(rule.getName(), newAnalysis);
	}
}
