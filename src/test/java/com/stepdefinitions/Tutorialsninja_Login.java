package com.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.pageobjects.HomePage;
import com.pageobjects.LaunchPage;
import com.pageobjects.LoginPage;

import io.cucumber.java.en.*;

public class Tutorialsninja_Login extends Base
{
	LaunchPage lp;
	LoginPage lg;
	HomePage hp;
	
	@Given("I open the tutorialsninja application")
	public void i_open_the_tutorialsninja_application() throws IOException {
	   setUp();
	   driver.get(baseurl);
	   lp = new LaunchPage(driver);
	   lg = new LoginPage(driver);
	   hp = new HomePage(driver);
	}

	@When("I click on My Account drop menu and click on login option")
	public void i_click_on_my_account_drop_menu_and_click_on_login_option() {
	    lp.clickMyAccount();
	    lp.clickLogin();
	}

	@When("I enter valid email address and valid password in the text fields on login page")
	public void i_enter_valid_email_address_and_valid_password_in_the_text_fields_on_login_page() {
	    lg.setUserName(username);
	    lg.setPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
	   lg.clickLoginbtn();
	}

	@Then("user gets logged in and user is taken to my accounts page.")
	public void user_gets_logged_in_and_user_is_taken_to_my_accounts_page() throws IOException {
		boolean status=false;
		try {
	    status = hp.ismyaccount_label_displayed();
		}
		catch(Exception e)
		{
		status=false;
		getScrenshot();
		tearDown();
		Assert.assertTrue(false);
		}
		if(status==true)
		{
			Assert.assertTrue(true);	
		tearDown();
		}
	}


}
