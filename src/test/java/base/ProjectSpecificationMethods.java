package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.Utility;

public class ProjectSpecificationMethods extends Utility{

	@Parameters({"url","browser"})
	@BeforeMethod
	public void launchingBrowserandLoadingURL(String url,String browser) {
		
		 browser(url,browser);

	}
	
	@AfterMethod
	public void closeBrowser() {
		
		browserclose();
	}
	
	@DataProvider(name = "readData")
	public String[][] readData() throws Exception {
		
		String[][] data = readExcel(sheetname);
		return data;
	}
}
