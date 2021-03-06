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
package org.eclipse.scout.sdk.saml.importer.internal.jdt.imports;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.scout.sdk.operation.util.IOrganizeImportService;

/**
 * <h3>{@link SamlOrganizeImportService}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 23.05.2013
 */
public class SamlOrganizeImportService implements IOrganizeImportService {

  @Override
  public void organize(ICompilationUnit cu, IProgressMonitor monitor) throws CoreException {
    @SuppressWarnings("deprecation")
    final ASTParser parser = ASTParser.newParser(AST.JLS3);
    parser.setResolveBindings(false);
    parser.setStatementsRecovery(false);
    parser.setBindingsRecovery(false);
    parser.setSource(cu);
    CompilationUnit astRoot = (CompilationUnit) parser.createAST(null);

    JdtOrganizeImportsOperation organizeImps = new JdtOrganizeImportsOperation(cu, astRoot, false, !cu.isWorkingCopy(), true, null);
    organizeImps.run(monitor);
  }

}
