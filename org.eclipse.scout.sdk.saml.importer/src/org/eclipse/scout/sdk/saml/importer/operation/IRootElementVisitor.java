/*******************************************************************************
 * Copyright (c) 2010 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.operation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;

/**
 * <h3>{@link IRootElementVisitor}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 21.11.2012
 */
public interface IRootElementVisitor {
  void visit(EObject o, SamlContext context) throws CoreException, IllegalArgumentException;
}
