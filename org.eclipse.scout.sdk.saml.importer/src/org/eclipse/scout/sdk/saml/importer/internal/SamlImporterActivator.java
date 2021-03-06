package org.eclipse.scout.sdk.saml.importer.internal;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.scout.sdk.util.log.SdkLogManager;
import org.osgi.framework.BundleContext;

public class SamlImporterActivator extends Plugin {

  private static BundleContext context;
  private static SdkLogManager logManager;

  public final static String PLUGIN_ID = "org.eclipse.scout.sdk.saml.importer";

  public static BundleContext getContext() {
    return context;
  }

  @Override
  public void start(BundleContext bundleContext) throws Exception {
    context = bundleContext;
    logManager = new SdkLogManager(this);
  }

  @Override
  public void stop(BundleContext bundleContext) throws Exception {
    context = null;
    logManager = null;
  }

  public static void logInfo(Throwable t) {
    logManager.logInfo(t);
  }

  public static void logInfo(String message) {
    logManager.logInfo(message);
  }

  public static void logInfo(String message, Throwable t) {
    logManager.logInfo(message, t);
  }

  public static void logWarning(String message) {
    logManager.logWarning(message);
  }

  public static void logWarning(Throwable t) {
    logManager.logWarning(t);
  }

  public static void logWarning(String message, Throwable t) {
    logManager.logWarning(message, t);
  }

  public static void logError(Throwable t) {
    logManager.logError(t);
  }

  public static void logError(String message) {
    logManager.logError(message);
  }

  public static void logError(String message, Throwable t) {
    logManager.logError(message, t);
  }
}
