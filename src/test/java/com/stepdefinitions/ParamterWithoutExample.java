package com.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.pageobjects.FacebookHomePage;

import io.cucumber.java.en.*;

public class ParamterWithoutExample extends Base
{
	FacebookHomePage fp;
	
	@Given("I am on facebook login page.")
	public void i_am_on_facebook_login_page() throws IOException {
	  setUp();
	  driver.get("https://www.facebook.com/");
	  fp= new FacebookHomePage(driver);
	}

	@When("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String username, String password) {
	  fp.setEmail(username);
	  fp.setPassword(password);
	}

	@When("Click on login button")
	public void click_on_login_button() {
	  fp.clickLogin();
	}

	@Then("Login should fail for incorrect credentials")
	public void login_should_fail_for_incorrect_credentials() {
	   if(fp.is_error_meassage_displayed())
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   tearDown();
		   Assert.assertTrue(false);
	   }
	}

	@Then("Relogin option should be available")
	public void relogin_option_should_be_available() {
	    if(fp.is_login_enabled())
	    {
	    	Assert.assertTrue(true);
	    	tearDown();
	    }
	    else
	    {
	    	tearDown();
	    	Assert.assertTrue(false);
	    }
	}

}
