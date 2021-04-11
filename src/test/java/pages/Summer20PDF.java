package pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

import baseClass.WrapperClass;

public class Summer20PDF extends WrapperClass{
	
public Summer20PDF() {
		/*
		 * this.driver=driver; this.js=js; this.as=as;
		 */
	getwindows(2);
	}
	
	public Summer20PDF verifySummer20PDF() throws IOException {
		getAs().assertTrue(readPDF(getDriver().getCurrentUrl(),"Salesforce Spring ’21 Release"));
		return this;
}
	}
