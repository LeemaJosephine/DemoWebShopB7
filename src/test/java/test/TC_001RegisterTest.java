package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_001RegisterTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setuo() throws IOException {
		filepath="C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject1\\src\\test\\resources\\data\\SignUpData.properties";
		readFromPropFile(filepath);
	}
	@Test
	public void registerTest() {
		// TODO Auto-generated method stub
		
		HomePage obj = new HomePage(driver);
		obj.clickRegister()
		.clickGender()
		.enterFirstName(prop.getProperty("firstname"))
		.enterLastName(prop.getProperty("lastname"))
		.enterEmail(prop.getProperty("email"))
		.enterPass(prop.getProperty("pass"))
		.enterConPass(prop.getProperty("conpass"))
		.clickRegisterButton();
//		.validateRegister()
//		.clickContinue()
		
		
		
	}

}
