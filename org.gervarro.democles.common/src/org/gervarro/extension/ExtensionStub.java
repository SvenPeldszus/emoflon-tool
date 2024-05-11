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
package org.gervarro.extension;

public class ExtensionStub<T> {
	private ExtensionClassLoader extensionClassLoader;
	private String className;
	private ExtensionLoader extensionLoader;
	private T realObject;
	private boolean forceCreate = true;
	
	public ExtensionStub(ExtensionClassLoader extensionClassLoader, String className, ExtensionLoader extensionLoader) {
		this.extensionClassLoader = extensionClassLoader;
		this.className = className;
		this.extensionLoader = extensionLoader;
	}
	
	public ExtensionStub(ExtensionStub<T> origin) {
		this(origin.extensionClassLoader, origin.className, origin.extensionLoader);
	}
	
	@SuppressWarnings("unchecked")
	protected synchronized final T getDelegate() {
		if (realObject == null && forceCreate) {
			try {
				final Class<?> clazz = (Class<?>) extensionClassLoader.loadClass(className);
				realObject = (T) extensionLoader.create(clazz);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return realObject;
	}
	
	public synchronized final boolean isProxy() {
		return realObject == null;
	}
	
	public synchronized final boolean isValid() {
		return forceCreate;
	}

	public synchronized final void invalidate() {
		realObject = null;
		forceCreate = false;
	}
}
