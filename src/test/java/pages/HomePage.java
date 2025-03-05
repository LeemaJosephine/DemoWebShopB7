package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods{
	
	@FindBy(className = "ico-login")
	WebElement login;
	
	@FindBy(className = "ico-register")
	WebElement register;
	
	@FindBy(xpath ="(//a[@class='account'])[1]")
	WebElement validLoginText;
	
	@FindBy(xpath="//span[@for='Email']")
	WebElement invalidLoginText;
	
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
	
	public HomePage validateLogin(String testType, String expectedText) {
		
		if(testType.equalsIgnoreCase("ValidEmailValidPassword")){
			
			String actualText=validLoginText.getText();
			//Hard Assertion
			Assert.assertEquals(actualText, expectedText);
		} else if(testType.equalsIgnoreCase("InValidEmailValidPassword")){
			
			String actualText=invalidLoginText.getText();
			// Soft Assertion
			SoftAssert asserObj = new SoftAssert();
			asserObj.assertEquals(actualText, expectedText);
			asserObj.assertAll();
		}
		return this;
	}
}
