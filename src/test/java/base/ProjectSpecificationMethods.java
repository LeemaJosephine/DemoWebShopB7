package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Utility;

public class ProjectSpecificationMethods extends Utility{

	@BeforeMethod
	public void launchingBrowserandLoadingURL() {
		
		 browser(prop.getProperty("url"));

	}
	
	//@AfterMethod
	public void closeBrowser() {
		
		browserclose();
	}
}
