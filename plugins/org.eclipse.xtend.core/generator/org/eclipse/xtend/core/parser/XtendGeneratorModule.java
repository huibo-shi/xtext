/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.core.parser;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.xtext.generator.DefaultGeneratorModule;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;

public class XtendGeneratorModule extends DefaultGeneratorModule {
	
	public Class<? extends XtextGeneratorNaming> bindNaming() {
		return XtendGeneratorNaming.class;
	}
	
	public static class XtendGeneratorNaming extends XtextGeneratorNaming {
		@Override
		public String getRuntimeBasePackage(Grammar grammar) {
			if (isXtend(grammar)) {
				return "org.eclipse.xtend.core";
			} else {
				return super.getRuntimeBasePackage(grammar);
			}
		}
		
		@Override
		public String getEclipsePluginBasePackage(Grammar grammar) {
			if (isXtend(grammar)) {
				return "org.eclipse.xtend.ide";
			} else {
				return super.getEclipsePluginBasePackage(grammar);
			}
		}
		
		@Override
		public String getGenericIdeBasePackage(Grammar grammar) {
			if (isXtend(grammar)) {
				return "org.eclipse.xtend.ide.common";
			} else {
				return super.getGenericIdeBasePackage(grammar);
			}
		}
		
		private boolean isXtend(Grammar grammar) {
			return grammar.getName().equals("org.eclipse.xtend.core.Xtend");
		}
	}
}
