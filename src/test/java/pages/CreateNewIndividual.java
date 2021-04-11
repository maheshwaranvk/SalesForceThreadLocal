package pages;

import baseClass.WrapperClass;

public class CreateNewIndividual extends WrapperClass{
	
	public CreateNewIndividual() {
		waitForIt("xpath", "//h2[text()='New Individual']");
	}

	public CreateNewIndividual clickSalustation(String sol) {
		elementClick("xpath", "(//span[text()='Salutation']/following::a[@class='select'])[1]");
		elementClick("xpath", "//a[@title='"+sol+".']");
		return this;
	}
	
	public CreateNewIndividual enterFirstName(String fName) {
		sendText("Xpath", "//input[@placeholder='First Name']", fName);
		return this;
	}
	
	public CreateNewIndividual enterLastName(String lName) {
		sendText("Xpath", "//input[@placeholder='Last Name']", lName);
		return this;
	}
	
	public OpenIndividual clickIndividualSave() {
		elementClick("Xpath", "//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']");
		return new OpenIndividual();
	}
	
}
