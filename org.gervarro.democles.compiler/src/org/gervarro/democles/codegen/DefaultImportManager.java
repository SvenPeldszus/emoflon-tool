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
package org.gervarro.democles.codegen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefaultImportManager implements MultiPhaseImportManager {
	// TODO handling of inner classes, and classes in the java.lang package; (String -> local, java.lang, etc.)
	private static final Pattern CLASS_NAME_PATTERN = 
		Pattern.compile("^(([a-z0-9]+[\\.])*)(([A-Z][a-z0-9]*)+([\\.]([A-Z][a-z0-9]*)+)*)$");
	private boolean inUploadPhase = false;
	private final String packageName;
	private final String className;
	private final String fullyQualifiedName;
	private final Comparator<String> comparator = new Comparator<String>() {
		private final int evaluate(String className) {
			String derivedPackageName = getPackageName(className);
			if (packageName.compareTo(derivedPackageName) == 0) {
				return 0;
			} else if ("java.lang".compareTo(derivedPackageName) == 0) {
				return 1;
			} else {
				return 2;
			}
		}
		
		public final int compare(String left, String right) {
			return evaluate(left) - evaluate(right);
		}
	};
	private final Map<String, String> map =
		new HashMap<String, String>();
	private List<String> cachedImportList;

	public DefaultImportManager(DefaultImportManager importManager) {
		this(importManager.packageName, importManager.className);
	}

	public DefaultImportManager(String packageName, String className) {
		this.packageName = packageName;
		this.className = className;
		this.fullyQualifiedName = this.packageName + "." + this.className;
		this.map.put(this.className, fullyQualifiedName);
	}
	
	public DefaultImportManager(String fullyQualifiedName) {
		fullyQualifiedName = fullyQualifiedName.replace('$', '.');
		Matcher matcher = CLASS_NAME_PATTERN.matcher(fullyQualifiedName);
		if (matcher.matches()) {
			this.packageName = getPackageName(matcher);
			this.className = getClassName(matcher);
			this.fullyQualifiedName = this.packageName + "." + this.className;
			this.map.put(this.className, this.fullyQualifiedName);
		} else {
			throw new RuntimeException();
		}
	}
	
	public final void upload(String newValue) {
		if (newValue == null)
			return;
		
		newValue = newValue.replace('$', '.');
		Matcher matcher = CLASS_NAME_PATTERN.matcher(newValue);
		if (matcher.matches()) {
			String className = getClassName(matcher);
			String oldValue = map.remove(className);
			String smaller = oldValue != null && comparator.compare(oldValue, newValue) <= 0 ? oldValue : newValue;
			// TODO Issue a warning if className.equals(smaller)
			map.put(className, smaller);
			cachedImportList = null;
		}
	}
	
	public final List<String> getImportList() {
		if (cachedImportList == null) {
			cachedImportList =
				new ArrayList<String>(map.size());
			for (String importedForm : map.values()) {
				String packageName = getPackageName(importedForm);
				if (!this.packageName.equals(packageName) 
						&& !"java.lang".equals(packageName)) {
					cachedImportList.add(importedForm);
				}
			}
			Collections.sort(cachedImportList);
		}
		return cachedImportList;
	}
	
	public final String getImportedName(String fullyQualifiedName) {
		String result = lookup(fullyQualifiedName);
		if (inUploadPhase) {
			upload(fullyQualifiedName);
		}
		return result;
	}
	
	public final String lookup(String fullyQualifiedName) {
		assert fullyQualifiedName != null;
		fullyQualifiedName = fullyQualifiedName.replace('$', '.');
		String className = getClassName(fullyQualifiedName);
		String fqnInMap = map.get(className);
		return fqnInMap != null && fqnInMap.equals(fullyQualifiedName) ? className : fullyQualifiedName;
	}
	
	private static final String getPackageName(Matcher matcher) {
		String packageName = matcher.group(1);
		return packageName.substring(0, packageName.length() - 1);
	}
	
	public static final String getPackageName(String fullyQualifiedName) {
		Matcher matcher = CLASS_NAME_PATTERN.matcher(fullyQualifiedName);
		return matcher.matches() ? getPackageName(matcher) : null;
	}

	private static final String getClassName(Matcher matcher) {
		return matcher.group(3).replace('$', '.');
	}
	
	public static final String getClassName(String fullyQualifiedName) {
		Matcher matcher = CLASS_NAME_PATTERN.matcher(fullyQualifiedName);
		return matcher.matches() ? getClassName(matcher) : null;
	}
	
	public static final String[] getClassNameSegments(String fullyQualifiedName) {
		return getClassName(fullyQualifiedName).split("[\\.]");
	}
	
	public String toString() {
		return map.toString();
	}

	public final void setUploadPhase(final boolean upload) {
		this.inUploadPhase = upload;
	}
}
