package base;

import org.openqa.selenium.WebDriver;

import utils.Utility;

public class ProjectSpecificationMethods extends Utility{

	
	public void launchingBrowserandLoadingURL(String url) {
		
		 browser(url);

	}
	
	public void closeBrowser() {
		
		browserclose();
	}
}
