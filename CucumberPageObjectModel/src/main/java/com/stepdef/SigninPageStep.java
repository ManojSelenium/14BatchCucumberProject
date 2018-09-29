package com.stepdef;

import com.pages.SignInPage;

import cucumber.api.java.en.And;

public class SigninPageStep {

	
	Steps steps;
	
	public SigninPageStep(Steps steps) {
		this.steps=steps;
	}
	
	@And("^user enter email address \"([^\"]*)\"$")
	public void enterEmailAddress(String emailAdress) {
		
		steps.signInPage.enterEmailAddess(emailAdress);
	}
	
	@And("^user click on create an account button$")
	public void clickOnSignin() {
		steps.accountPage=steps.signInPage.clickCreateAnAccountButton();
	}
}
