package pages;

import baseClass.WrapperClass;

public class OpenServiceTerritory extends WrapperClass{

	
	public OpenServiceTerritory() {
		waitForIt("xpath", "//h1//*[text()='Service Territory']");
	}
	
	public OpenServiceTerritory verifyServiceTerritoryCountryName(String cName) {
		getAs().assertTrue(locateElement("xpath", "(//a[@class='forceOutputAddress']/div[text()='"+cName+"'])[1]").isDisplayed());
		return this;
	}
	
	public OpenServiceTerritory verifyServiceTerritoryCreatedDate(String createDate) {
		getAs().assertTrue((locateElement("xpath", "(//span[@class='uiOutputDateTime forceOutputModStampWithPreview'])[1]").getText()).equalsIgnoreCase(createDate));
		return this;
	}
	
	public OpenServiceTerritory verifyServiceTerritoryModifiedDate(String modifiedDate) {
		getAs().assertTrue((locateElement("xpath", "(//span[@class='uiOutputDateTime forceOutputModStampWithPreview'])[2]").getText()).equalsIgnoreCase(modifiedDate));
		return this;
	}
}
