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
		
		filepath="C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject1\\src\\test\\resources\\data\\SignUpData.properties";
		readFromPropFile(filepath);
	}
	@Test  // Mandatory for the test to execute 
	public void loginTest() throws IOException {
		
		filepath="C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject1\\src\\test\\resources\\data\\DemoWebShopTestData.xlsx";
		String email = getCellData(filepath, "LoginData", 1, 0); // 1st row 1st column
		String pass = getCellData(filepath, "LoginData", 1, 1); // 1st row 2nd column
		HomePage obj = new HomePage(driver);
		obj.clickLogin()
		.enterEmail(email)
		.enterpass(pass)
		.clickLoginButton();
	}

}
