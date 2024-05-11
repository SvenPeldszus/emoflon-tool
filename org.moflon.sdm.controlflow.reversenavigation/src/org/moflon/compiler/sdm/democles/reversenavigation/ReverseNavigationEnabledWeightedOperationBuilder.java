package org.moflon.compiler.sdm.democles.reversenavigation;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.OperationRuntime;
import org.gervarro.democles.constraint.emf.Reference;
import org.gervarro.democles.emf.EMFWeightedOperationBuilder;
import org.gervarro.democles.specification.impl.Constraint;

public class ReverseNavigationEnabledWeightedOperationBuilder<T extends OperationRuntime>
extends EMFWeightedOperationBuilder<T> {

	@Override
	public int getWeight(final T operation) {
		final var adornment = operation.getPrecondition();
		final var object = operation.getOrigin();
		if (object instanceof Constraint) {
			final var constraint = (Constraint) object;
			final var cType = constraint.getType();

			if (((cType instanceof Reference) && !((Reference) cType).isBidirectional()) && ((adornment.get(0) == Adornment.FREE) && (adornment.get(1) == Adornment.BOUND))) {
				return 100;
			}
		}

		return super.getWeight(operation);
	}
}
