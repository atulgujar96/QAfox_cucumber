package com.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utility.ReadConfig;

public class Base 
{
	public static WebDriver driver = null;
	public String baseurl = "http://tutorialsninja.com/demo/";
	public String username = "atul.mae@gmail.com";
	public String password = "abc@1234";
	ReadConfig config = null;
	
	public void setUp() throws IOException
	{
		config = new ReadConfig();
		String browser=config.getBrowser();
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", config.getChromepath());
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", config.getFirefoxpath());
			driver = new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.gecko.driver", config.getEdgepath());
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", config.getIepath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static String getScrenshot() throws IOException
	{
		String datename = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot scr = (TakesScreenshot) driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\screenshots\\"+datename+".jpeg";
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
}
