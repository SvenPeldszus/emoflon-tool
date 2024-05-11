/*
 * Copyright (c) 2010-2014 Gergely Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.eclipse.task;

abstract public class DelegationChain<E extends DelegationChain<E>> {
	E previous;
	E next;
	
	@SuppressWarnings("unchecked")
	public DelegationChain() {
		this.previous = (E) this;
		this.next = (E) this;
	}
	
	@SuppressWarnings("unchecked")
	protected DelegationChain(final E delegate) {
		this.next = delegate;
		this.next.previous = (E) this;
		E current = delegate;
		while (delegate != current.getNext()) {
			current = current.getNext();
		}
		current.next = (E) this;
		this.previous = current;
	}
	
	protected final E getNext() {
		return next;
	}
	
	protected final E getPrevious() {
		return previous;
	}
}
