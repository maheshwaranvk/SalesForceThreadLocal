package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;

public class CreateNewDashboard extends WrapperClass{

	public CreateNewDashboard() {
		/*
		 * this.driver=driver; this.js=js; this.as=as;
		 */
		
		waitForIt("xpath","//iframe[@title='dashboard']");
		getDriver().switchTo().frame(getDriver().findElementByXPath("//iframe[@title='dashboard']"));
	}
	
	public CreateNewDashboard enterDashboardName(String name) {
		getDriver().findElementById("dashboardNameInput").sendKeys(name);
		return this;
	}
	
	public CreateDashboard2 clickDashboardCreate() throws InterruptedException {
		getDriver().findElementByXPath("//button[text()='Create']").click();
		
		Thread.sleep(3000);
		getDriver().switchTo().frame(getDriver().findElementByXPath("//iframe[@title='dashboard']"));
		return new CreateDashboard2();
	}
	
}
