/*
 * generated by Xtext
 */
package org.eclipse.scout.saml.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.validation.SamlJavaValidatorHelper;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import com.google.inject.Inject;

/**
 * This class contains custom scoping description.
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("restriction")
public class SamlScopeProvider extends XbaseScopeProvider {

  @Inject
  SamlJavaValidatorHelper helper;

  @Override
  public IScope getScope(EObject context, EReference reference) {
    if (context instanceof FormFieldElement) {
      FormFieldElement formField = (FormFieldElement) context;
      if (reference == SamlPackage.Literals.FORM_FIELD_ELEMENT__MASTER) {
        return Scopes.scopeFor(helper.leafNodes(formField));
      }
    }

    return super.getScope(context, reference);
  }
}
