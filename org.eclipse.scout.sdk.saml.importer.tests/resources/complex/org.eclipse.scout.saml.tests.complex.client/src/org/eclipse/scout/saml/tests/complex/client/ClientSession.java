package org.eclipse.scout.saml.tests.complex.client;

import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.rt.client.AbstractClientSession;
import org.eclipse.scout.rt.client.ClientJob;
import org.eclipse.scout.rt.client.servicetunnel.http.HttpServiceTunnel;
import org.eclipse.scout.rt.shared.services.common.code.CODES;
import org.eclipse.scout.saml.tests.complex.client.ui.desktop.Desktop;

public class ClientSession extends AbstractClientSession {

	public ClientSession() {
		super(true);
	}

	/**
	 * @return session in current ThreadContext
	 */
	public static ClientSession get() {
		return ClientJob.getCurrentSession(ClientSession.class);
	}

	@Override
	public void execLoadSession() throws ProcessingException {
		setServiceTunnel(new HttpServiceTunnel(this, getBundle()
				.getBundleContext().getProperty("server.url")));

		// pre-load all known code types
		CODES.getAllCodeTypes(org.eclipse.scout.saml.tests.complex.shared.Activator.PLUGIN_ID);

		setDesktop(new Desktop());

		// turn client notification polling on
		// getServiceTunnel().setClientNotificationPollInterval(2000L);
	}

	@Override
	public void execStoreSession() throws ProcessingException {
	}
}
