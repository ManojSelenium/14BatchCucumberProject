package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.WebDriverUtils;

public class SignInPage extends WebDriverUtils{

	
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterEmailAddess(String testData) {
		
		enterText(By.id("email_create"), testData);
		
	}
	
	public CreateAccountPage clickCreateAnAccountButton() {
		click(By.id("SubmitCreate"));
		return new CreateAccountPage(driver);
	}
}
