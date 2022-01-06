package com.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.pageobjects.LaunchPage;
import com.pageobjects.RegisterPage;

import io.cucumber.java.en.*;

public class HooksInCucumber extends Base
{
	LaunchPage lp;
	RegisterPage rp;
	
	@Given("I open tutorialsninja application")
	public void i_open_tutorialsninja_application() throws IOException {
	  setUp();
	  driver.get("http://www.tutorialsninja.com/demo/");
	  lp = new LaunchPage(driver);
	  rp = new RegisterPage(driver);
	}

	@When("I click on my account dropdown menu")
	public void i_click_on_my_account_dropdown_menu() {
	  lp.clickMyAccount();
	}

	@When("click on register option")
	public void click_on_register_option() {
	   lp.clickRegister();
	}

	@Then("I should be taken to register account page")
	public void i_should_be_taken_to_register_account_page() {
	  String text=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
	  if(text.contains("Register"))
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Assert.assertTrue(false);
	  }
	}

	@When("I enter the details required for user registration on register account page")
	public void i_enter_the_details_required_for_user_registration_on_register_account_page() 
	{
	  rp.setFirstname("Atul");
	  rp.setLastname("Gujar");
	  rp.setEmail("abcdeflllllg@gmail.com");
	  rp.setTelephone("1234567890");
	  rp.setPassword("abc@123");
	  rp.setConfirmPassword("abc@123");
	  rp.click_radio_yes();
	  rp.click_agree_checkbox();
	  rp.click_continue_btn();
	}

	@Then("user account should be created and user should get logged in")
	public void user_account_should_be_created_and_user_should_get_logged_in() {
	   try
	   {
		   String text1=driver.findElement(By.xpath("((//div[@id='content']/p))[1]")).getText();
		  // System.out.println("--------------"+text1);
		   if(text1.equalsIgnoreCase("Congratulations! Your new account has been successfully created!"))
		   {
			   tearDown();
			   Assert.assertTrue("Account has been successfully created", true);   
		   }
		   else
		   {
			   tearDown();
			   Assert.assertTrue("Account registration failed", false); 
		   }
	   }
	   catch(Exception e)
	   {
		   tearDown();
		   Assert.assertTrue("Account registration failed", false);
	   }
	}

}
