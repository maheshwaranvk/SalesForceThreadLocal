package pages;

import baseClass.WrapperClass;

public class EditServiceTerritories extends WrapperClass{

	public EditServiceTerritories() {
		waitForIt("xpath", "//h3[@class='slds-section__title slds-theme--shade primaryPaletteBorder test-id__section-header-container']/*[text()='Information']");
	}
	
	public EditServiceTerritories getOwnerName() {
		ownerName = locateElement("xpath", "//label[@class='label inputLabel uiLabel-left form-element__label uiLabel']/following::input[@aria-required='true' and @class=' input']").getAttribute("value");
		return this;
	}
	
	public EditServiceTerritories getCreateByDate() {
		createDate = locateElement("xpath", "(//span[text()='Created By']/following::span[@class='uiOutputDateTime'])[1]").getText();
		return this;
	}
	
	public EditServiceTerritories getModifiedByDate() {
		modifiedDate = locateElement("xpath", "(//span[text()='Created By']/following::span[@class='uiOutputDateTime'])[2]").getText();
		return this;
	}
	
	public EditServiceTerritories enterCountryName(String CountryName) {
		if(locateElement("xpath", "//input[@class='country compoundBRRadius input']").getAttribute("value")!=null) {
			locateElement("xpath", "//input[@class='country compoundBRRadius input']").clear();
			locateElement("xpath", "//input[@class='country compoundBRRadius input']").sendKeys(CountryName);
		}
		else {
			locateElement("xpath", "//input[@class='country compoundBRRadius input']").sendKeys(CountryName);
		}
		return this;
	}
	
	public ServiceTerritories clickEditServiceTerritoriesSave() {
		elementClick("xpath", "//div[@class='actionsContainer']//span[@class=' label bBody' and text()='Save']");
		return new ServiceTerritories();
	}
}
