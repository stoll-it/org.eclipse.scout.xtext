/*
 * generated by Xtext
 */
package org.eclipse.scout.saml;

import org.eclipse.scout.saml.generator.SamlGenerator;
import org.eclipse.xtext.generator.IGenerator;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SamlRuntimeModule extends org.eclipse.scout.saml.AbstractSamlRuntimeModule {
  @Override
  public Class<? extends IGenerator> bindIGenerator() {
    return SamlGenerator.class;
  }
}
