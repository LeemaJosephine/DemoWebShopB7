package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import utils.Utility;

public class TC_002LoginTest extends ProjectSpecificationMethods{
  
	@BeforeTest
	public void setup() throws IOException {
		
		sheetname="LoginData";
	}
	@Test(dataProvider = "readData")  // Mandatory for the test to execute 
	public void loginTest(String email, String pass, String testType, String expectedText) throws IOException {
		
		HomePage obj = new HomePage(driver);
		obj.clickLogin()
		.enterEmail(email)
		.enterpass(pass)
		.clickLoginButton()
		.validateLogin(testType,expectedText);
	}

}
