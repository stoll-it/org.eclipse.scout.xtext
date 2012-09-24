package org.eclipse.scout.sdk.saml.importer.ui.wizard;

import java.io.File;

import org.eclipse.scout.sdk.jobs.OperationJob;
import org.eclipse.scout.sdk.saml.importer.SamlImportOperation;
import org.eclipse.scout.sdk.ui.wizard.AbstractWizard;
import org.eclipse.scout.sdk.workspace.IScoutProject;

public class SamlImportWizard extends AbstractWizard {

	private SamlImportWizardPage m_page1;
	private IScoutProject m_project;

	public SamlImportWizard() {
		setWindowTitle("Act4 Importer");
		m_page1 = new SamlImportWizardPage();
		addPage(m_page1);
	}

	@Override
	public boolean performFinish() {
		SamlImportOperation op = new SamlImportOperation();
		File f = new File(m_page1.getSamlFile());
		op.setSamlFile(f);
		OperationJob j = new OperationJob(op);
		j.schedule();
		return true;
	}

	public void setProject(IScoutProject project) {
		m_project = project;
	}

	public IScoutProject getProject() {
		return m_project;
	}
}
