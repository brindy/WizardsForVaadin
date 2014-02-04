package org.vaadin.teemu.wizards;

public interface AdvancedWizardStep extends WizardStep {

	boolean canNext();
	
	boolean canBack();
	
	boolean canFinish();
	
}
