package com.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.pageobjects.FacebookHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterWithExample extends Base
{
	FacebookHomePage fp;
	
	@Given("user opens facebook login page")
	public void user_opens_facebook_login_page() throws IOException {
	    setUp();
	    driver.get("https://www.facebook.com/");
	    fp = new FacebookHomePage(driver);
	}

	@When("user enters {string} and {string} fields")
	public void user_enters_and_fields(String username, String password) {
	    fp.setEmail(username);
	    fp.setPassword(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	   fp.clickLogin();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		if(!fp.is_error_meassage_displayed())
		{
			 tearDown();
			Assert.assertTrue("user successfully logged in and taken to home page", true);
		}else
		{
			 tearDown();
			Assert.assertTrue("user login failed due to incorrect credentials",false);
		}
	  
	}

}
