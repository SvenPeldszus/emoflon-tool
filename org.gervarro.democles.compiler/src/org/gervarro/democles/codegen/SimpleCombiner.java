/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010  Gergely Varro
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.democles.codegen;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.OperationCombiner;

public class SimpleCombiner implements OperationCombiner<SimpleCombiner, GeneratorOperation> {
	private final Adornment adornment;
	private final Chain<GeneratorOperation> last;
	
	public SimpleCombiner(final Adornment adornment) {
		this.adornment = adornment;
		this.last = null;
	}
	
	private SimpleCombiner(final SimpleCombiner src,
			final Adornment adornment,
			final GeneratorOperation second) {
		this.adornment = adornment;
		this.last = new Chain<GeneratorOperation>(second, src.last);
	}
	
	public final SimpleCombiner combine(final GeneratorOperation second) {
		return new SimpleCombiner(this, adornment.applyOperationMask(second), second);
	}

	public final Chain<GeneratorOperation> getRoot() {
		return last;
	}

	public final GeneratorOperation getLast() {
		return last != null ? last.getValue() : null;
	}
}
