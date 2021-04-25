package testCase;

import org.testng.annotations.Test;

import baseClass.WrapperClass;
import pages.LoginPage;

public class SAL65 extends WrapperClass{
	
	

	@Test
	public void editServiceTemplates() throws InterruptedException {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickServiceTerritories()
		.clickServiceTerritoriesEdit()
		.getOwnerName()
		.getCreateByDate()
		.getModifiedByDate()
		.enterCountryName("North America")
		.clickEditServiceTerritoriesSave()
		.searchOwnerName(ownerName)
		.getLatestModifiedDate()
		.clickOwnerName()
		.verifyServiceTerritoryCountryName("North America")
		.verifyServiceTerritoryCreatedDate(createDate)
		.verifyServiceTerritoryModifiedDate(modifiedDate);
		
		getAs().assertAll();
	}
}
