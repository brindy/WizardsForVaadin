package org.vaadin.teemu.wizards;

public interface AdvancedWizardStep extends WizardStep {

	boolean canBack();
	
	boolean canFinish();
	
}
