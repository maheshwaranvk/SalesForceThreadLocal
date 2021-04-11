package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class OpenDashboard extends WrapperClass{

	public OpenDashboard() {
		/*
		 * this.driver=driver; this.js=js; this.as=as;
		 */
		waitForIt("xpath","//h1//*[text()='Dashboard']");
	}
	
	public OpenDashboard verifyDashboard(String name) {
		getAs().assertTrue(getDriver().findElementByXPath("//h1//*[text()='"+name+"']").isDisplayed());
		return this;
	}
}
