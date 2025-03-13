package com.BaseClassPackage;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class BaseClass {

	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("this is before suite",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("this is before test",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("this is before class",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("this is before method",true);
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("this is after method",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("this is after class",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("this is after test",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("this is after suite",true);
	}
}
