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
package org.eclipse.scout.sdk.saml.importer.operation.logic.fragments;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.sdk.saml.importer.extension.configurator.SourceProviderInput;

/**
 * <h3>{@link ClientCallLogicFragment}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 28.11.2012
 */
public class ClientCallLogicFragment implements ISourceFragment {

  @Override
  public void createSource(SourceProviderInput input, StringBuilder src) throws CoreException {
    if (input.isSourceMethodReturningValue()) {
      src.append("return ");
    }
    src.append("SERVICES.getService(");
    src.append(input.getTargetInterface().getElementName());
    src.append(".class).");
    src.append(input.getTargetMethodName());
    src.append("(");
    src.append(input.getForm().getElementName());
    src.append(".this);");
  }

}
