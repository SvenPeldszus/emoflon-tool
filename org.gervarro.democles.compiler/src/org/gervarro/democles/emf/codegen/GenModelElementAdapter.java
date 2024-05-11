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
package org.gervarro.democles.emf.codegen;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EModelElement;

@Deprecated
public abstract class GenModelElementAdapter<E extends EModelElement, Gen extends GenBase> implements Adapter {
	protected AdapterFactory factory;
	protected Gen genElement;

	protected E eModelElement;

	protected GenModelElementAdapter() {
		super();
	}

	public Gen getGenElement() {
		return genElement;
	}

	public void setGenElement(Gen newGenElement) {
		genElement = newGenElement;
	}

	public E getEModelElement() {
		return eModelElement;
	}

	public void setEModelElement(E newEModelElement) {
		eModelElement = newEModelElement;
	}
	
	public Notifier getTarget() {
		return getEModelElement();
	}

	public boolean isAdapterForType(Object type) {
		return type instanceof Class<?> && GenModelElementAdapter.class.isAssignableFrom((Class<?>) type);
	}

	public void notifyChanged(Notification notification) {
		// Do nothing
	}

	@SuppressWarnings("unchecked")
	public void setTarget(Notifier newTarget) {
		setEModelElement((E) newTarget);
	}
}