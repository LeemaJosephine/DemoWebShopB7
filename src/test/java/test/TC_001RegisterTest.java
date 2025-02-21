package test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_001RegisterTest extends ProjectSpecificationMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HomePage obj = new HomePage(driver);
		obj.launchingBrowserandLoadingURL();
		
		obj.clickRegister()
		.clickGender()
		.enterFirstName("Leema")
		.enterLastName("Jose")
		.enterEmail("Leema12345@gmail.com")
		.enterPass("Leema.12345")
		.enterConPass("Leema.12345")
		.clickRegisterButton()
		.validateRegister()
		.clickContinue()
		.closeBrowser();
	
		
	}

}
