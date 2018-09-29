package com.stepdef;

import com.pages.CreateAccountPage;

import cucumber.api.java.en.And;

public class CreateAccountStep {
Steps steps;
	public CreateAccountStep(Steps steps) {
		this.steps=steps;
	}
	
	@And("^user enter first name \"([^\"]*)\"$")
	public void enterFirstName(String firstName) {
	System.out.println("First commit");
	System.out.println("Second commit");
		steps.accountPage.enterFirstName(firstName);
	}
	
	
	@And("^user enter last name \"([^\"]*)\"$")
	public void enterLastName(String lastName) {
		steps.accountPage.enteLastName(lastName);
	}
	
	@And("^user enter password \"([^\"]*)\"$")
	public void enterPassword(String password) {
		steps.accountPage.enterPassword(password);
	}
}
