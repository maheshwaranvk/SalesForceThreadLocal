package testCase;

import org.testng.annotations.Test;

import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL66 extends WrapperClass{

	

	@Test
	public void createParentTerritory() throws InterruptedException {
		
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickServiceTerritories()
		.sortModifiedDate()
		.clickParentTerritory()
		.clickNewServiceTerritory()
		.enterNewServiceTerritoryName()
		.clickOperationHours()
		.clickNewOperationHours()
		.enterOperationHoursName()
		.clickTimeZone()
		.clickOperatingHoursSave()
		.clickNewServiceTerritorySave()
		.clickServiceTerritorySave();

		getAs().assertAll();
	}
}
