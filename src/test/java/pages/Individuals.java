package pages;

import baseClass.WrapperClass;

public class Individuals extends WrapperClass{

	public Individuals() {
		waitForIt("xpath", "//div[@data-aura-class='forceListViewManagerHeader']//*[text()='Individuals' and @data-aura-class='uiOutputText forceBreadCrumbItem']");
	}
	
	public CreateNewIndividual clickNewIndividual() {
		
		elementClick("xpath", "//div[@title='New']");
		return new CreateNewIndividual();
	}
}
