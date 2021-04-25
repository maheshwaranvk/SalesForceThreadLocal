package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import baseClass.WrapperClass;

public class ServiceTerritories extends WrapperClass {

	public ServiceTerritories() {
		waitForIt("xpath", "//span[@data-aura-class='uiOutputText forceBreadCrumbItem']");
	}

	public EditServiceTerritories clickServiceTerritoriesEdit() {
		elementClick("xpath", "(//div[@data-aura-class='forceVirtualAction']//lightning-primitive-icon)[1]");
		elementClick("xpath", "//a[@title='Edit']");
		return new EditServiceTerritories();
	}

	public ServiceTerritories searchOwnerName(String ownerName) throws InterruptedException {
		getJs().executeScript("arguments[0].value='" + ownerName + "'",
				locateElement("xpath", "//input[@type='search' and @class='slds-input']"));
		locateElement("xpath", "//input[@type='search' and @class='slds-input']").sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		return this;
	}

	public OpenServiceTerritory clickOwnerName() {
		elementClick("xpath", "(//table[@data-aura-class='uiVirtualDataTable']//th//a[@data-refid='recordId'])[1]");
		return new OpenServiceTerritory();
	}

	public ServiceTerritories getLatestModifiedDate() {
		modifiedDate = locateElement("xpath",
				"(//table[@role='grid']//td//*[@class='slds-truncate uiOutputDateTime'])[1]").getText();
		return this;
	}

	public ServiceTerritories sortModifiedDate() throws InterruptedException {
		elementClick("xpath",
				"//span[@title='Last Modified Date']/parent::a[@class='toggle slds-th__action slds-text-link--reset ']");
		Thread.sleep(1000);
		return this;
	}

	public ServiceTerritories clickParentTerritory() {
		javaScriptClick(locateElement("xpath", "(//table[@role='grid']//td)[5]"));
		javaScriptClick(locateElement("xpath", "(//table[@role='grid']//td)[5]//span/button"));
		return this;
	}

	public CreateNewServiceTerritory clickNewServiceTerritory() {
		elementClick("xpath", "//span[@title='New Service Territory']");
		return new CreateNewServiceTerritory();
	}

	public ServiceTerritories clickServiceTerritorySave() throws InterruptedException {
		elementClick("xpath", "//div[@class='slds-grid slds-grid--align-center']//*[text()='Save']");
		Thread.sleep(2000);
		return this;
	}

	public ServiceTerritories verifyParentTerritory() {

		getAs().assertTrue(locateElement("xpath",
				"(//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']//a[@data-refid='recordId'])[3]")
						.getAttribute("title").equalsIgnoreCase("Mukesh Ambani"));
		return this;
	}

}
