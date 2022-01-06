package com.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.pageobjects.FacebookHomePage;

import io.cucumber.java.en.*;

public class FacebookLogo extends Base
{
	FacebookHomePage fbhomepage;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() throws IOException 
	{
		setUp();
	   
	}
	
	

	@When("User open Facebook home page")
	public void user_open_facebook_home_page() {
	    driver.get("https://www.facebook.com/");
	    fbhomepage = new FacebookHomePage(driver);
	}

	@Then("User verify that Facebook logo is present or not")
	public void user_verify_that_facebook_logo_is_present_or_not() {
		boolean status=false;
		try {
	    status = fbhomepage.is_logo_displayed();
		}
		catch(Exception e)
		{
			status=false;
		}
	    if(status==true)
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	tearDown();
	    	Assert.assertTrue(false);
	    }
	}


	@Then("User close browser")
	public void user_close_browser() {
	   tearDown();
	}

}
