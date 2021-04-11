package pages;

import baseClass.WrapperClass;

public class OpenIndividual extends WrapperClass{

	public OpenIndividual() {
		waitForIt("xpath", "(//div[@class='slds-media__body']//*[@class='entityNameTitle slds-line-height_reset' and text()='Individual'])[1]");
	}
	
	public OpenIndividual verifyIndividualName(String sol, String fName, String lName) {
		String text = locateElement("xpath", "(//div[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']/*[@class='uiOutputText'])").getText();
		getAs().assertTrue(text.contains(sol));
		getAs().assertTrue(text.contains(fName));
		getAs().assertTrue(text.contains(lName));
		return this;
	}
}
