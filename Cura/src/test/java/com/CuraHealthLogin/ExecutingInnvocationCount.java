package com.CuraHealthLogin;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ExecutingInnvocationCount {
	@Test(invocationCount=10,priority=-1)
	public void login()
	{
		Reporter.log("login successfully",true);
	}
	
	@Test
	public void friendRequest()
	{
		Reporter.log("This is the friend request ",true);
	}
	
	@Test
	public void notification()
	{
		Reporter.log("This is the notification",true);
	}
	@Test
	public void settings()
	{
		Reporter.log("change the settings",true);
	}
}
