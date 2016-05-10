package org.moflon.tgg.mosl.ui.highlighting.rules;

import org.eclipse.swt.SWT;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.moflon.tgg.mosl.tgg.Operator;
import org.moflon.tgg.mosl.ui.highlighting.utils.MOSLColor;

public class NegationVariablePatternHighlightRule extends AbstractVariablePatternWithOperatorHighlightRule {

	public NegationVariablePatternHighlightRule() {
		super("Negation", "Negation-Operator");
	}

	@Override
	protected boolean getOperatorCondition(Operator op) {
		return op.getValue().contains("!");
	}

	@Override
	protected TextStyle getTextStyle() {
	      TextStyle ts = new TextStyle();
	      ts.setColor(MOSLColor.BLACK.getColor());
	      ts.setStyle(SWT.BOLD);
	      return ts;
	}

}