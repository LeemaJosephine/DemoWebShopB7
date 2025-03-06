package test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AttributeExamples {

	
	@Test(priority = 0)
	public void signUpTest() {
		
		System.out.println("Iam sign up test method");
	}
	
	@Test(priority = -1)
	public void loginTest() {
		
		System.out.println("Iam Login test method");
	}
}
