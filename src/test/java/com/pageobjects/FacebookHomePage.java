package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage 
{
	public WebDriver ldriver;
	
	public FacebookHomePage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@id='content']/div/div/div/div/div/img")
	WebElement facebooklogo;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement login;
	
	public void setEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public boolean is_logo_displayed()
	{
		return facebooklogo.isDisplayed();
	}
	
	public boolean is_login_enabled()
	{
		return login.isEnabled();
	}
	
	public boolean is_error_meassage_displayed()
	{
		boolean status=false;
		try {
		status = ldriver.findElement(By.xpath("((//input[@id='email']/following-sibling::*))[2]")).isDisplayed();
		}
		catch(Exception e) {
			try {
			status=ldriver.findElement(By.xpath("((//input[@id='pass']/following::div))[4]")).isDisplayed();
			}
			catch(Exception e1)
			{
			    status=false;
			}
		}
			return status;
	}
	
}
