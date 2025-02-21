package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class RegisterPage extends ProjectSpecificationMethods{

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}

	public RegisterPage clickGender() {
		
		driver.findElement(By.id("gender-male")).click();
		return this;
	}
	
	public RegisterPage enterFirstName(String fname) {
		
		driver.findElement(By.id("FirstName")).sendKeys(fname);
		return this;
	}
	
	public RegisterPage enterLastName(String lname) {
		driver.findElement(By.id("LastName")).sendKeys(lname);
		return this;
	}
	
	public RegisterPage enterEmail(String email) {
		driver.findElement(By.id("Email")).sendKeys(email);
		return this;
	}
	
	public RegisterPage enterPass(String pass) {
		driver.findElement(By.id("Password")).sendKeys(pass);
		return this;
	}
	
	public RegisterPage enterConPass(String conPass) {
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conPass);
		return this;
	}
	
	public RegisterResult clickRegisterButton() {
		
		driver.findElement(By.id("register-button")).click();
		return new RegisterResult(driver);
	}
	
	
	
	
}
