package org.moflon.gt.mosl.codeadapter.statementrules;

import org.moflon.gt.mosl.codeadapter.StatementBuilder;
import org.moflon.gt.mosl.moslgt.LoopStatement;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CompoundNode;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.Scope;

public abstract class AbstractLoopStatementRule<S extends LoopStatement> extends AbstractConditionStatementRule<S>
{
   @Override
   protected ValidationReport transformStatement(S stmnt, Scope scope, CFNode previosCFNode)
   {
      Scope innerScope = DemoclesFactory.eINSTANCE.createScope();
      CompoundNode parent = this.updateCurrentNode(createCurrentCompoundNode());
      handlePattern(parent);
      innerScope.setParent(parent);
      parent.setScope(scope);
      StatementBuilder.getInstance().transformStatement(stmnt.getLoopStartStatement(), innerScope, null);
      return ResultFactory.eINSTANCE.createValidationReport();
   }

   protected abstract CompoundNode createCurrentCompoundNode();
}