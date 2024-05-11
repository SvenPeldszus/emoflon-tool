/*
 * Copyright (c) 2010-2015 Gergely Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.eclipse.workspace.util;

import java.io.File;

import org.apache.tools.ant.types.selectors.SelectorUtils;

public class AntPatternCondition implements VisitorCondition {
	final String[] patterns;
	
	public AntPatternCondition(final String[] patterns) {
		this.patterns = new String[patterns.length];
		for (int i = 0; i < patterns.length; i++) {
			this.patterns[i] = convert(patterns[i]);
		}
	}

	public final boolean isExactMatch(final String path) {
		for (int i = 0; i < patterns.length; i++) {
			if (SelectorUtils.match(patterns[i], convert(path), true)) {
				return true;
			}
		}
		return false;
	}

	public final boolean isPrefixMatch(final String path) {
		for (int i = 0; i < patterns.length; i++) {
			if (SelectorUtils.matchPatternStart(patterns[i], convert(path), true)) {
				return true;
			}
		}
		return false;
	}
	
	public static final String convert(final String string) {
		return string.replace('/', File.separatorChar);
	}
}
