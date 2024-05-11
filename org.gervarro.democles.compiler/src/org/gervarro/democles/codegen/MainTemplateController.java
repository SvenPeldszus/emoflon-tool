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

import java.io.IOException;
import java.io.Writer;

class MainTemplateController implements Generator {
	private TemplateEngine engine;
	private ImportManager importManager;
	private TemplateInvocation template;
	private final String packageName;
	private final String className;

	MainTemplateController(TemplateEngine engine,
			ImportManager importManager,
			TemplateInvocation template,
			String packageName,
			String className) {
		this.engine = engine;
		this.importManager = importManager;
		this.template = template;
		this.packageName = packageName;
		this.className = className;
	}

    public final void generateCode(WriterProvider trgDir) throws IOException {
    	if (importManager instanceof MultiPhaseImportManager) {
        	// Collect imports from the templates
    		((MultiPhaseImportManager) importManager).setUploadPhase(true);
    		engine.apply(template);
    		((MultiPhaseImportManager) importManager).setUploadPhase(false);
    	}

		// Generate code
    	Writer writer = trgDir.getWriterForJavaFile(packageName, className);
		engine.apply(writer, template);
    	writer.flush();
    	writer.close();
    }
}
