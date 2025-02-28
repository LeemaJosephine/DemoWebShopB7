package test;

import java.io.IOException;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_001RegisterTest extends ProjectSpecificationMethods{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		filepath="C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject1\\src\\test\\resources\\data\\SignUpData.properties";
		readFromPropFile(filepath);
		
		HomePage obj = new HomePage(driver);
		obj.launchingBrowserandLoadingURL(prop.getProperty("url"));
		
		obj.clickRegister()
		.clickGender()
		.enterFirstName(prop.getProperty("firstname"))
		.enterLastName(prop.getProperty("lastname"))
		.enterEmail(prop.getProperty("email"))
		.enterPass(prop.getProperty("pass"))
		.enterConPass(prop.getProperty("conpass"))
		.clickRegisterButton()
		.validateRegister()
		.clickContinue()
		.closeBrowser();
		
		
	}

}
