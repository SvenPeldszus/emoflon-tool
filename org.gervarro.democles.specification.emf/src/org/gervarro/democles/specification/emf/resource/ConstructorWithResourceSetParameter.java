/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010-2012  Gergely Varro
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
package org.gervarro.democles.specification.emf.resource;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.extension.ExtensionLoader;

public class ConstructorWithResourceSetParameter implements ExtensionLoader {
	private final ResourceSet resourceSet;
	
	public ConstructorWithResourceSetParameter(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public final Object create(Class<?> clazz) throws InstantiationException,
			IllegalAccessException {
		try {
			Constructor<?> constructor = clazz.getConstructor(ResourceSet.class);
			Object result = constructor.newInstance(resourceSet);
			if (result instanceof Adapter) {
				resourceSet.eAdapters().add((Adapter) result);
			}
			return result;
		} catch (SecurityException e) {
			throw new InstantiationException();
		} catch (NoSuchMethodException e) {
			throw new InstantiationException();
		} catch (IllegalArgumentException e) {
			throw new InstantiationException();
		} catch (InvocationTargetException e) {
			throw new InstantiationException();
		}
	}

}
