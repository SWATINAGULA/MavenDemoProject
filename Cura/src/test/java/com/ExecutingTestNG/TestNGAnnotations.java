package com.ExecutingTestNG;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGAnnotations {

	@BeforeSuite
	public void methodBeforeSuit()
	{
		Reporter.log("this is the  before suite",true);
	}
	@BeforeTest
	public void  methodBeforeTest()
	{
		Reporter.log("this is the Before test ",true);
	}
	@BeforeClass
	public void methodBeforeClass()
	{
		Reporter.log("this is the Before class ",true);
	}

	@BeforeMethod
	public void BeforeMethod()
	{
		Reporter.log("This is the Before method",true);
	}
	@Test
	public void testMethod1()
	{
		Reporter.log("This is the first test method",true);	
	}
	@AfterClass
	public void methodAfterClass()
	{
		Reporter.log("this is the after class",true);
	}
	@AfterMethod
	public void methodAfterTest()
	{
		Reporter.log("This is the after test",true);
	}
	
	
	@AfterSuite
	public void methodAfterSuit()
	{
		Reporter.log("this is the after suite",true);
	}
}