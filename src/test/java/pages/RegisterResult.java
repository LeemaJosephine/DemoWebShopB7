package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class RegisterResult extends ProjectSpecificationMethods{

	public RegisterResult(WebDriver driver) {
		this.driver=driver;
	}
	
	public RegisterResult validateRegister() {
		
		String actualText = driver.findElement(By.className("result")).getText();
		String expectedText="Your registration completed";
		
		if(actualText.contains(expectedText)) {
			
			System.out.println("Registeration Sucessful");
		} else {
			
			System.out.println("Unsucessful");
		}
		 return this;		
	}
	
	public HomePage clickContinue() {
		
		driver.findElement(By.xpath("//input[contains(@class,'register-continue-button')]")).click();
		return new HomePage(driver);
	}
}
