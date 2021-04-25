package pages;

import baseClass.WrapperClass;

public class CreateNewOperatingHours extends WrapperClass{

	
	public CreateNewOperatingHours() {
		waitForIt("xpath", "//h2[text()='New Operating Hours']");
	}
	
	public CreateNewOperatingHours clickTimeZone() {
		elementClick("xpath", "//a[@class='select']");
		elementClick("xpath", "//li/a[@title='(GMT+05:30) India Standard Time (Asia/Kolkata)']");
		return this;
		}
	
	public CreateNewOperatingHours enterOperationHoursName() {
		locateElement("xpath", "(//div[@class='test-id__section-content slds-section__content section__content']//input[@aria-required='true'])[3]").sendKeys("Indian Time Zone");
		return this;
	}
	
	public CreateNewServiceTerritory clickOperatingHoursSave() {
	elementClick("xpath", "(//div[@class='forceModalActionContainer--footerAction forceModalActionContainer'])[2]//*[text()='Save']");
	return new CreateNewServiceTerritory();

	}
	
	
}
