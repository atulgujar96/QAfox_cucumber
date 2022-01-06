package com.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pageobjects.HomePage;
import com.pageobjects.LaunchPage;
import com.pageobjects.LoginPage;

import io.cucumber.java.en.*;

public class BasicDataTable extends Base
{
	HomePage hm;
	LoginPage lp;
	LaunchPage ln;
	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() throws IOException {
	  setUp();
	  driver.get(baseurl);
	  hm = new HomePage(driver);
	  lp = new LoginPage(driver);
	  ln = new LaunchPage(driver);
	}

	@When("User navigates to login page")
	public void user_navigates_to_login_page() {
	  ln.clickMyAccount();
	  ln.clickLogin();
	}

	@When("enters credentials to login")
	public void enters_credentials_to_login(io.cucumber.datatable.DataTable dataTable) {
	   List<List<String>> list= dataTable.asLists();
	   lp.setUserName(list.get(0).get(0));
	   lp.setPassword(list.get(0).get(1));
	   lp.clickLoginbtn();
	}

	@Then("User is taken to My account page.")
	public void user_is_taken_to_my_account_page() {
		boolean status=false;
		try {
	    status = hm.ismyaccount_label_displayed();
		}
		catch(Exception e)
		{
			status=false;
			tearDown();
			Assert.assertTrue(false);
		}
		if(status==true)
		{
			Assert.assertTrue(true);
		}
		tearDown();
	}
}
