package test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import utils.Utility;

public class TC_002LoginTest extends ProjectSpecificationMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HomePage obj = new HomePage(driver);
		
		obj.launchingBrowserandLoadingURL();
		
		obj.clickLogin()
		.enterEmail("Leema12345@gmail.com")
		.enterpass("Leema.12345")
		.clickLoginButton();
	}

}
