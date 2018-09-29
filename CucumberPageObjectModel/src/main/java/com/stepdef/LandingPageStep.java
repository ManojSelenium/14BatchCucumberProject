package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.pages.LandingPage;
import com.pages.SignInPage;
import com.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingPageStep {

	
	WebDriver driver;
	
	
	Steps steps;
	
	
	public LandingPageStep(Steps steps) {
		this.steps=steps;
	}
	@Given("^user launch browser$")
	public void userLaunchBrowser() {

		steps.testBase=new TestBase();
		driver=steps.testBase.launchBrowser();

	}

	@When("^user enter URL$")
	public void enterURL() {
		steps.testBase.enterURL();
	}

	@Then("^user should see signin option$")
	public void signinOptionDisplayed() {
		steps.landingPage=new LandingPage(driver); 
		Assert.assertTrue(steps.landingPage.verifySigninDisplayed());
	}

	@When("^user click on signin option$")
	public void clickSignin() {

		steps.signInPage=steps.landingPage.clickSignIn();
	}

}
