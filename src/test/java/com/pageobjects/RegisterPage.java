package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	public WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="input-firstname")
	WebElement firstname;
	
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(id="input-confirm")
	WebElement confirm_password;
	
	@FindBy(xpath = "((//label[@class='radio-inline']))[1]")
	WebElement radio_yes;
	
	@FindBy(xpath = "((//label[@class='radio-inline']))[2]")
	WebElement radio_no;
	
	@FindBy(xpath = "//input[@type='checkbox' and @name='agree']")
	WebElement agree_checkbox;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Continue']")
	WebElement continue_btn;
	
	public void setFirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void setLastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void setEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void setTelephone(String tel)
	{
		telephone.sendKeys(tel);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void setConfirmPassword(String pass)
	{
		confirm_password.sendKeys(pass);
	}
	
	public void click_radio_yes()
	{
		radio_yes.click();
	}
	
	public void click_radio_no()
	{
		radio_no.click();
	}
	
	public void click_agree_checkbox()
	{
		agree_checkbox.click();
	}
	
	public void click_continue_btn()
	{
		continue_btn.click();
	}
}
