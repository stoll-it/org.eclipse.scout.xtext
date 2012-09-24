/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zreg Box Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.ZregBoxElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ZregBoxElement#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getZregBoxElement()
 * @model
 * @generated
 */
public interface ZregBoxElement extends AbstractValueFieldElement
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.AbstractFieldProperties}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getZregBoxElement_Properties()
   * @model containment="true"
   * @generated
   */
  EList<AbstractFieldProperties> getProperties();

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.LogicElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getZregBoxElement_Children()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getChildren();

} // ZregBoxElement
