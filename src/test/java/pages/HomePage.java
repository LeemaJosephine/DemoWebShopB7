package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods{
	
	@FindBy(className = "ico-login")
	WebElement login;
	
	@FindBy(className = "ico-register")
	WebElement register;
	
	public HomePage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}

	public RegisterPage clickRegister() {
		
		//driver.findElement(By.className("ico-register")).click();
		register.click();
		return new RegisterPage(driver);   // Constructor chaining
	}
	
	public LoginPage clickLogin() {
		
		login.click();
		return new LoginPage(driver);
	}
}
