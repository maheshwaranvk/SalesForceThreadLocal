package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.*;

public class AppLauncher extends WrapperClass{

	
	public AppLauncher() {
		/*
		 * this.driver=driver; this.js=js; this.as=as;
		 */
		waitForIt("xpath","//h2[text()='App Launcher']");
	}
	
	public Opportunities clickOppurtunities() {
		javaScriptClick(getDriver().findElementByXPath("//p[text()='Opportunities']"));
		return new Opportunities();
	}
	
	public Dashboards clickDashboard() {
		javaScriptClick(getDriver().findElementByXPath("//p[text()='Dashboards']"));
		return new Dashboards();
	}
	
	public Sales clickSales() {
		elementClick("xpath", "//p[text()='Sales']");
		return new Sales();
	}
	
	public Individuals clickIndividuals() {
		javaScriptClick(getDriver().findElementByXPath("//p[text()='Individuals']"));
		return new Individuals();
	}
	
	public ServiceTerritories clickServiceTerritories() {
		javaScriptClick(locateElement("Xpath", "//p[text()='Service Territories']"));
		return new ServiceTerritories();
	}

	}
