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
package org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields;

import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlFieldImporterTest;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link TabboxElementImportTest}</h3> ...
 * 
 * @author mvi
 * @since 3.9.0 05.02.2013
 */
public class TabboxElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION = new String[]{"GroupTest", "TestTabBox"};

  @Test
  public void testNumAttributes() throws Exception {
    IType field = getField(FORM_NAME, LOCATION);
    Assert.assertEquals(4, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testEnabledAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredEnabled", false);
  }

  @Test
  public void testVisibleAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredVisible", false);
  }

  @Test
  public void testWidthAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredGridW", 3);
  }

  @Test
  public void testWidthPixelsAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredWidthInPixel", 650);
  }
}
