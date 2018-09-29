package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.WebDriverUtils;

public class LandingPage extends WebDriverUtils{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public SignInPage clickSignIn() {
		click(By.xpath("//*[@class='login']"));
		return new SignInPage(driver);
	}
	
	public boolean verifySigninDisplayed() {
		return isElementPresent(By.xpath("//*[@class='login']"));
	}
	

}
