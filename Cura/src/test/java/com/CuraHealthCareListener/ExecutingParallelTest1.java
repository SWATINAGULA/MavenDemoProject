package com.CuraHealthCareListener;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ExecutingParallelTest1 {
	WebDriver driver ;
	@Test
	@Parameters("browser")
	
	public void checkURL(String browser)
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
		
		try
		{
			String url = "https://www.instagram.com/";
			driver.get(url);
			
			Assert.assertEquals(driver.getCurrentUrl(),url,"the urls are different");
			Reporter.log("both url are same");
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
