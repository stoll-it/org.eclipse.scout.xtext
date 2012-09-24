/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smartfield Element Value Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getSmartfieldElementValueTypeAttribute()
 * @model
 * @generated
 */
public interface SmartfieldElementValueTypeAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(JvmType)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getSmartfieldElementValueTypeAttribute_Value()
   * @model
   * @generated
   */
  JvmType getValue();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(JvmType value);

} // SmartfieldElementValueTypeAttribute
