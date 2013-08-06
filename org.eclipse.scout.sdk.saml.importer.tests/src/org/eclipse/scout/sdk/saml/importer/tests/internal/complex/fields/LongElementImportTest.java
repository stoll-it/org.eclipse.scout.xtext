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
 * <h3>{@link LongElementImportTest}</h3>
 * 
 * @author mvi
 * @since 3.9.0 05.02.2013
 */
public class LongElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION = new String[]{"GroupTest", "LongTest"};
  private final static String[] LOCATION_2 = new String[]{"GroupTest", "Long2Test"};
  private final static String[] LOCATION_3 = new String[]{"GroupTest", "Long3Test"};
  private final static String[] LOCATION_4 = new String[]{"GroupTest", "Long4Test"};

  @Test
  public void testNumAttributes() throws Exception {
    IType field = getField(FORM_NAME, LOCATION);
    Assert.assertEquals(11, TypeUtility.getMethods(field).length);
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
  public void testLabelVisibleAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredLabelVisible", false);
  }

  @Test
  public void testMandatoryAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredMandatory", true);
  }

  @Test
  public void testWidthAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredGridW", 2);
  }

  @Test
  public void testWidthPixelsAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredWidthInPixel", 76);
  }

  @Test
  public void testHorizontalAlignAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredHorizontalAlignment", -1);
  }

  @Test
  public void testMinAttribute() throws Exception {
    testLongConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredMinimumValue", 2L);
  }

  @Test
  public void testMaxAttribute() throws Exception {
    testLongConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredMaximumValue", 4L);
  }

  @Test
  public void testFormatAttribute() throws Exception {
    testStringConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredFormat", "0000");
  }

  @Test
  public void testNumAttributes2() throws Exception {
    IType field = getField(FORM_NAME, LOCATION_2);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testMinAttribute2() throws Exception {
    testLongConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredMinimumValue", -1000L);
  }

  @Test
  public void testMaxAttribute2() throws Exception {
    testLongConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredMaximumValue", 3000L);
  }

  @Test
  public void testNumAttributes3() throws Exception {
    IType field = getField(FORM_NAME, LOCATION_3);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testMinAttribute3() throws Exception {
    testLongConfigMethod(getField(FORM_NAME, LOCATION_3), "getConfiguredMinimumValue", -9000L);
  }

  @Test
  public void testMaxAttribute3() throws Exception {
    testLongConfigMethod(getField(FORM_NAME, LOCATION_3), "getConfiguredMaximumValue", -1000L);
  }

  @Test
  public void testNumAttributes4() throws Exception {
    IType field = getField(FORM_NAME, LOCATION_4);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testMinAttribute4() throws Exception {
    testLongConfigMethod(getField(FORM_NAME, LOCATION_4), "getConfiguredMinimumValue", 10000L);
  }

  @Test
  public void testMaxAttribute4() throws Exception {
    testLongConfigMethod(getField(FORM_NAME, LOCATION_4), "getConfiguredMaximumValue", 100000L);
  }
}
