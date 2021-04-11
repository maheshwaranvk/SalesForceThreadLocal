package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL25 extends WrapperClass{
	
	@BeforeTest
	public void setExcelFileName() {
		excelFileName = "CreateIndi";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void createIndividuals(String sol, String fName, String lName) {
		
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickIndividuals()
		.clickNewIndividual()
		.clickSalustation(sol)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickIndividualSave()
		.verifyIndividualName(sol, fName,lName);
		
		getAs().assertAll();		
	}

}
