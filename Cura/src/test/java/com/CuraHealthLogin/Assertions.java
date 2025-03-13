package com.CuraHealthLogin;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Assertions {
	@Test
	public void testMethod1()
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String givenUrl ="https://www.google.co.in/";

		driver.get(givenUrl);

		//Assert.assertEquals(givenUrl,driver.getCurrentUrl()+"Demo","This urls are not same \n");
		//
		//		Assert.fail();
		//		Assert.assertTrue((givenUrl.equals(driver.getCurrentUrl())),"This urls are not same \n");

		SoftAssert softAssert = new SoftAssert();

		//softAssert.assertEquals(givenUrl,driver.getCurrentUrl()+"Demo","This urls are not same \n");
		softAssert.assertTrue((givenUrl.equals(driver.getCurrentUrl())),"This urls are not same \n");
		softAssert.assertAll();
		Reporter.log("both urls are correct \n",true);	
	}

	@Test(dependsOnMethods = "testMethod1")
	public void testMethod2()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String givenUrl ="https://www.amazon.in/";

		driver.get(givenUrl);

	}

}
