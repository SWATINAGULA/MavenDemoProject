package com.CuraHealthLogin;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethod {
	@Test
	public void login()
	{
		Reporter.log("This is the login",true);
	}
	
	@Test(dependsOnMethods="login")
	public void friendRequest()
	{
		Reporter.log("This is the friend request ",true);
	}
	
	@Test(dependsOnMethods="login")
	public void notification()
	{
		Reporter.log("This is the notification",true);
	}
}
