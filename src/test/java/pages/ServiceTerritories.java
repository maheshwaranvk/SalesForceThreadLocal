package pages;

import org.openqa.selenium.Keys;

import baseClass.WrapperClass;

public class ServiceTerritories extends WrapperClass{
	
	public ServiceTerritories() {
		waitForIt("xpath", "//span[@data-aura-class='uiOutputText forceBreadCrumbItem']");
	}
	
	public EditServiceTerritories clickServiceTerritoriesEdit() {
		elementClick("xpath", "(//div[@data-aura-class='forceVirtualAction']//lightning-primitive-icon)[1]");
		elementClick("xpath", "//a[@title='Edit']");
		return new EditServiceTerritories();
	}
	
	public ServiceTerritories searchOwnerName(String ownerName) throws InterruptedException {
		getJs().executeScript("arguments[0].value='"+ownerName+"'",locateElement("xpath", "//input[@type='search' and @class='slds-input']"));
		locateElement("xpath", "//input[@type='search' and @class='slds-input']").sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		return this;				
	}
	
	public OpenServiceTerritory clickOwnerName() {
		elementClick("xpath", "(//table[@data-aura-class='uiVirtualDataTable']//th//a[@data-refid='recordId'])[1]");
		return new OpenServiceTerritory();
	}
	
	public ServiceTerritories getLatestModifiedDate() {
		modifiedDate = locateElement("xpath", "(//table[@role='grid']//td//*[@class='slds-truncate uiOutputDateTime'])[1]").getText();
		return this;
	}
}
