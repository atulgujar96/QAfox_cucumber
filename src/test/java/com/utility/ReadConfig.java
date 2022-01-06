package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{

	Properties prop = null;
	
	public ReadConfig() throws IOException
	{
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\config.properties");
		prop = new Properties();
		prop.load(file);
	}
	
	public String getBrowser()
	{
		return prop.getProperty("browser");
	}
	
	public String getChromepath()
	{
		return prop.getProperty("chromepath");
	}
	
	public String getFirefoxpath()
	{
		return prop.getProperty("firefoxpath");
	}
	
	public String getEdgepath()
	{
		return prop.getProperty("edgepath");
	}
	
	public String getIepath()
	{
		return prop.getProperty("iepath");
	}
}
