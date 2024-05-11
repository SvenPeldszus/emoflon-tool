package org.moflon.tgg.csp.codegenerator;

import java.util.Locale;

import org.stringtemplate.v4.AttributeRenderer;

public class MyBasicFormatRenderer implements AttributeRenderer {
	@Override
	public String toString(final Object o, final String formatName, final Locale l) {
		if (formatName == null) {
			return o.toString();
		}
		if (formatName.equals("firstToUpper")) {
			return firstToUpper(o.toString());
		} else if (formatName.equals("firstToLower")) {
			return firstToLower(o.toString());
		} else if (formatName.equals("toLower")) {
			return o.toString().toLowerCase();
		} else {
			throw new IllegalArgumentException("Unsupported format name");
		}
	}

	public static String firstToUpper(final String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	public static String firstToLower(final String s) {
		return s.substring(0, 1).toLowerCase() + s.substring(1);
	}

}