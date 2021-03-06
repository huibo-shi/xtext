/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.wizard;

public enum BuildSystem {
	ECLIPSE("Eclipse"),
	MAVEN("Maven"),
	GRADLE("Gradle");
	
	private String humanReadableName;
	
	private BuildSystem(String humanReadableName) {
		this.humanReadableName = humanReadableName;
	}
	public String toString() {
		return humanReadableName;
	}
}
