package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver ldriver;

	public HomePage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//div[@id='content']/h2[text()='My Account']")
	WebElement lable_myaccount;
	
	public boolean ismyaccount_label_displayed()
	{
		return(lable_myaccount.isDisplayed());
	}
}
