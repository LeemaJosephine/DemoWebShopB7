package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {

	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement pass;
	
	@FindBy(xpath = "//input[contains(@class,'login-button')]")
	WebElement loginButon;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public LoginPage enterEmail(String emailid) {
		
		email.sendKeys(emailid);
		return this;
	}
	
	public LoginPage enterpass(String password) {
		
		pass.sendKeys(password);
		return this;
	}

	public LoginPage clickLoginButton() {
	
		loginButon.click();
		return this;
}	
	
}
