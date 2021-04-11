package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class CreateNewOpportunity extends WrapperClass{

	
	public CreateNewOpportunity() {
		/*
		 * this.driver=driver; this.js=js; this.as=as;
		 */
		
		waitForIt("xpath","//div[@class='slds-modal__header']/*[text()='New Opportunity']");
	}
	
	public CreateNewOpportunity enterOpportunityName(String name) {
		getDriver().findElementByXPath("//input[@name='Name']").sendKeys(name);
		return this;
	}
	
	public CreateNewOpportunity enterCloseDate() {
		getDriver().findElementByXPath("//label[text()='Close Date']/following::input[@type='text' and @name='CloseDate']").click();
		javaScriptClick(getDriver().findElementByXPath("//button[text()='Today']"));
		return this;
	}
	
	public CreateNewOpportunity enterStage() {
		javaScriptClick(getDriver().findElementByXPath("//label[text()='Stage']/following::input[@role='combobox' and @required='']"));
		getDriver().findElementByXPath("//span[@title='Needs Analysis']").click();
		return this;
	}
	
	public OpenOpportunity clickSave() {
		getDriver().findElementByXPath("//button[text()='Save']").click();
		return new OpenOpportunity();
	}
}
