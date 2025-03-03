package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_003InvalidRegisterTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void setuo() throws IOException {
		filepath="C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject1\\src\\test\\resources\\data\\SignUpData.properties";
		readFromPropFile(filepath);
	}
	
	@Test
	public void invalidRegister() {
		// TODO Auto-generated method stub
		
		HomePage obj1 = new HomePage(driver);
		obj1.clickRegister()
		.clickGender()
		.enterFirstName(prop.getProperty("Infirstname"))
		.enterLastName(prop.getProperty("Inlastname"))
		.enterEmail(prop.getProperty("Inemail"))
		.enterPass(prop.getProperty("Inpass"))
		.enterConPass(prop.getProperty("Inconpass"))
		.clickRegisterButton()
		.validateRegister()
		.clickContinue();
		
	}

}
