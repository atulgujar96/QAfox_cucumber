package com.stepdefinitions;

import io.cucumber.java.en.*;

public class TagsInCucumber
{
	@Given("User navigates to Facebook webpage1")
	public void user_navigates_to_facebook_webpage1() {
	    System.out.println("Scenario 1");
	}

	@When("User enter username1")
	public void user_enter_username1() {
		 System.out.println("Scenario 1");
	}

	@When("User enter password1")
	public void user_enter_password1() {
		 System.out.println("Scenario 1");
	}

	@When("User click on login button1")
	public void user_click_on_login_button1() {
		 System.out.println("Scenario 1");
	}

	@Then("Login should fail1")
	public void login_should_fail1() {
		 System.out.println("Scenario 1");
	}

	@Given("I am on google page1")
	public void i_am_on_google_page1() {
		 System.out.println("Scenario 2");
	}

	@When("I enter search word in searchBox1")
	public void i_enter_search_word_in_search_box1() {
		System.out.println("Scenario 2");
	}

	@When("press search Button1")
	public void press_search_button1() {
		System.out.println("Scenario 2");
	}

	@Then("I navigate to result page1")
	public void i_navigate_to_result_page1() {
		System.out.println("Scenario 2");
	}

	@Given("User is on Google Home Page1")
	public void user_is_on_google_home_page1() {
		System.out.println("Scenario 3");
	}

	@When("User searches appropriate result get displayed1")
	public void user_searches_appropriate_result_get_displayed1(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("Scenario 3");
	}

}
