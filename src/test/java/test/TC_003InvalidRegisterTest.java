package test;

import java.io.IOException;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_003InvalidRegisterTest extends ProjectSpecificationMethods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		filepath="C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject1\\src\\test\\resources\\data\\SignUpData.properties";
		readFromPropFile(filepath);
		
		HomePage obj1 = new HomePage(driver);
		obj1.launchingBrowserandLoadingURL(prop.getProperty("url"));
		
		obj1.clickRegister()
		.clickGender()
		.enterFirstName(prop.getProperty("Infirstname"))
		.enterLastName(prop.getProperty("Inlastname"))
		.enterEmail(prop.getProperty("Inemail"))
		.enterPass(prop.getProperty("Inpass"))
		.enterConPass(prop.getProperty("Inconpass"))
		.clickRegisterButton()
		.validateRegister()
		.clickContinue()
		.closeBrowser();
	
	}

}
