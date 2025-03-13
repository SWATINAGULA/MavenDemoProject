package com.CuraHealthCareListener;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
public class BaseClass 
{
	WebDriver driver = null;
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("this is before suite",true);
	}
	
	@Parameters("browser")
	@BeforeTest
	public WebDriver beforeTest(String browser)
	{
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 driver = new ChromeDriver();
		 }
		
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 else if(browser.equalsIgnoreCase("edge"))
		 {
			 driver = new EdgeDriver();
		 }
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;
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
