package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL2 extends WrapperClass{


	
	@BeforeTest
	public void setExcelFileName() {
		excelFileName = "CreateOpp";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void createOpportunity(String name) {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickOppurtunities()
		.clickNewOpportunities()
		.enterOpportunityName(name)
		.enterCloseDate()
		.enterStage()
		.clickSave()
		.verifyOpportunity(name);
	}
}
