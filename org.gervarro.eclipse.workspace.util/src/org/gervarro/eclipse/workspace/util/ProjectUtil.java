/*
 * Copyright (c) 2010-2016 Gergely Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.eclipse.workspace.util;

import java.lang.reflect.Array;

import org.apache.tools.ant.types.selectors.SelectorUtils;
import org.apache.tools.ant.types.selectors.TokenizedPattern;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.jobs.ISchedulingRule;

public final class ProjectUtil {

	public static <T> T[] insert(final T[] array, final int index, final T element) {
		if ((index < 0) || (index > array.length)) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		final var result = createArray(array.getClass(), array.length + 1);
		if (index > 0) {
			System.arraycopy(array, 0, result, 0, index);
		}
		result[index] = element;
		if (index < array.length) {
			System.arraycopy(array, index, result, index+1, array.length-index);
		}
		return (T[]) result;
	}

	public static <T> T[] remove(final T[] array, final int index) {
		if ((index < 0) || (index >= array.length)) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		final var result = createArray(array.getClass(), array.length - 1);
		if (index > 0) {
			System.arraycopy(array, 0, result, 0, index);
		}
		if (index < result.length) {
			System.arraycopy(array, index+1, result, index, result.length-index);
		}
		return (T[]) result;
	}

	public static <T> int indexOf(final T[] array, final T element) {
		for (var i = 0; i < array.length; i++) {
			if (array[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	public static int indexOf(final ICommand[] buildSpecs, final String builderName) {
		for (var i = 0; i < buildSpecs.length; i++) {
			if (buildSpecs[i].getBuilderName().equals(builderName)) {
				return i;
			}
		}
		return -1;
	}

	public static ISchedulingRule getRule(final IProject project, final String antPattern) {
		final var pattern = new TokenizedPattern(AntPatternCondition.convert(antPattern));
		final var tokens = new String[pattern.depth()];
		SelectorUtils.tokenizePath(pattern.getPattern()).toArray(tokens);
		IContainer container = project;
		for (var i = 0; (i < tokens.length) && !SelectorUtils.DEEP_TREE_MATCH.equals(tokens[i]); i++) {
			final var resource = container.findMember(tokens[i]);
			if (resource instanceof IContainer) {
				container = (IContainer) resource;
			} else {
				return resource;
			}
		}
		return container;
	}

	@SuppressWarnings("unchecked")
	private static <T> T[] createArray(final Class<?> arrayClass, final int size) {
		return (T[]) Array.newInstance(arrayClass.getComponentType(), size);
	}
}
