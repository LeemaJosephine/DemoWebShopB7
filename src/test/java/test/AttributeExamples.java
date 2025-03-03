package test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AttributeExamples {

	@Ignore
	@Test(priority = 0, invocationCount = 5, invocationTimeOut = 10, threadPoolSize = 2)
	public void signUpTest() {
		
		System.out.println("Iam sign up test method");
	}
	
	@Test(dependsOnMethods = "signUpTest", alwaysRun = true)
	public void loginTest() {
		
		System.out.println("Iam Login test method");
	}
}
