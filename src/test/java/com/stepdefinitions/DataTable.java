package com.stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;

import com.pageobjects.GoogleSearchPage;

import io.cucumber.java.en.*;

public class DataTable extends Base
{
	GoogleSearchPage gp;
	
	@Given("User is on Google search page")
	public void user_is_on_google_search_page() throws IOException 
	{
	  setUp();
	  driver.get("https://www.google.com/");
	  gp = new GoogleSearchPage(driver);
	}

	@When("user searches for data using data in data table appropriate results are displayed")
	public void user_searches_for_data_using_data_in_data_table_appropriate_results_are_displayed(io.cucumber.datatable.DataTable dataTable) 
	{
	    for(Map<String,String> data : dataTable.asMaps(String.class,String.class))
	    {
	    	gp.search(data.get("word"));
	    	System.out.println(driver.findElement(By.xpath("//div[@id='result-stats']")).getText());
	    	driver.navigate().back();
	    }
	    tearDown();
	}
}
