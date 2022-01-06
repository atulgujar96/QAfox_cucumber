package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class GoogleSearchPage 
{
	
	public WebDriver ldriver;
	
	public GoogleSearchPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "q")
	WebElement searchbox;
	
	public void search(String data)
	{
		searchbox.clear();
		searchbox.sendKeys(data);
		searchbox.sendKeys(Keys.ENTER);
		//searchbox.submit();
	}
	
}
