package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage
{
	public WebDriver ldriver;
	
	public LaunchPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	WebElement myaccount;
	
	@FindBy(xpath ="((//a[text()='Login']))[1]")
	WebElement login;
	
	@FindBy(xpath = "((//a[text()='Register']))[1]")
	WebElement register;
	
	public void clickMyAccount()
	{
		myaccount.click();
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public void clickRegister()
	{
		register.click();
	}

}
