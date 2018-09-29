package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils{


	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterFirstName(String testData) {
		new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("customer_firstname")));
		enterText(By.id("customer_firstname"), testData);
	}

	public void enteLastName(String testData) {

		enterText(By.id("customer_lastname"), testData);
	}

	public void enterPassword(String testData) {

		enterText(By.id("passwd"), testData);
	}
}
