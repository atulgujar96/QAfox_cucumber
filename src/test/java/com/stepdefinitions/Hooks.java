package com.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
	@Before
	public void beforeHook()
	{
		System.out.println("This will be executed before every scenario");
	}
	
	@After
	public void afterHook()
	{
		System.out.println("This will be executed after every scenario");
	}
	
	@Before("@First")
	public void beforeFirst()
	{
		System.out.println("This will be executed before first scenario only");
	}
	
	@After("@First")
	public void afterFirst()
	{
		System.out.println("This will be executed after first scenario only");
	}
	
	@Before("@Second")
	public void beforeSecond()
	{
		System.out.println("This will be executed before second scenario only");
	}
	
	@After("@Second")
	public void afterSecond()
	{
		System.out.println("This will be executed after second scenario only");
	}
	
	@Before("@Third")
	public void beforeThird()
	{
		System.out.println("This will be executed before third scenario only");
	}
	
	@After("@Third")
	public void afterThird()
	{
		System.out.println("This will be executed after third scenario only");
	}
}
