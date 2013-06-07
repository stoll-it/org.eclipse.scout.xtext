/*******************************************************************************
 * Copyright (c) 2012, 2013 BSI Business Systems Integration AG.
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
 * <h3>{@link RadioGroupElementImportTest}</h3>
 * 
 * @author mvi
 * @since 3.9.0 13.02.2013
 */
public class RadioGroupElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION = new String[]{"GroupTest", "TestTabBox", "TestTab2", "TestRadioButtons"};

  @Test
  public void testNumAttributes() throws Exception {
    IType field = getField(FORM_NAME, LOCATION);
    Assert.assertEquals(7, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredLabel", "trans.text1");
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
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredGridW", 5);
  }

  @Test
  public void testWidthPixelsAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredWidthInPixel", 105);
  }

  @Test
  public void testLabelVisibleAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredLabelVisible", false);
  }

  @Test
  public void testMandatoryAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredMandatory", true);
  }

  @Test
  public void testGenericType() throws Exception {
    testHasGenericArgument(getField(FORM_NAME, LOCATION), Integer.class.getSimpleName());
  }
}
