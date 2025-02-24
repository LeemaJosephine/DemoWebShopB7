package test;

import java.io.IOException;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import utils.Utility;

public class TC_002LoginTest extends ProjectSpecificationMethods{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		filepath="C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject1\\src\\test\\resources\\data\\DemoWebShopTestData.xlsx";
		String email = getCellData(filepath, "LoginData", 1, 0); // 1st row 1st column
		String pass = getCellData(filepath, "LoginData", 1, 1); // 1st row 2nd column
		
		filepath="C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject1\\src\\test\\resources\\data\\SignUpData.properties";
		readFromPropFile(filepath);
		
		HomePage obj = new HomePage(driver);
		obj.launchingBrowserandLoadingURL(prop.getProperty("url"));
		
		obj.clickLogin()
		.enterEmail(email)
		.enterpass(pass)
		.clickLoginButton();
	}

}
