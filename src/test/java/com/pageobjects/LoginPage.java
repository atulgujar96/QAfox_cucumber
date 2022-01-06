package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "input-email")
	WebElement email;
	
	@FindBy(id = "input-password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Login']")
	WebElement loginbtn;
	
	public void setUserName(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLoginbtn()
	{
		loginbtn.click();
	}
}
