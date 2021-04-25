package pages;

import baseClass.WrapperClass;

public class CreateNewServiceTerritory extends WrapperClass{

	public CreateNewServiceTerritory() {
		waitForIt("xpath", "//h2[text()='New Service Territory']");
	}
	
	public CreateNewServiceTerritory enterNewServiceTerritoryName() {
		locateElement("xpath", "(//div[@data-aura-class='forceDetailPanelDesktop']//span[text()='Name']/following::input[@aria-required='true'])[1]").sendKeys("Mukesh Ambani");
		return this;
	}
	
	public CreateNewServiceTerritory clickOperationHours() throws InterruptedException {
		elementClick("xpath", "(//div[@data-aura-class='forceDetailPanelDesktop']//span[text()='Name']/following::input[@class=' default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup'])[2]");
		Thread.sleep(2000);
		return this;
	}
	
	public CreateNewOperatingHours clickNewOperationHours() {
		elementClick("xpath", "//span[@title='New Operating Hours']");
		return new CreateNewOperatingHours();
	}
	
	public ServiceTerritories clickNewServiceTerritorySave() {
		elementClick("xpath", "(//div[@class='forceModalActionContainer--footerAction forceModalActionContainer'])//*[text()='Save']");
		return new ServiceTerritories();
	}
	
}
