package com.CuraHealthLogin;

import org.testng.Reporter;
import org.testng.annotations.Test;

//priority
public class TestNGExecutionOrderUsingPriority {
@Test(priority=1)
public void login()
{
	Reporter.log("This is the login",true);
}
@Test(priority=1)
public void friendRequest()
{
	Reporter.log("This is the friendrequest ",true);
}
@Test(priority=2)
public void notification()
{
	Reporter.log("This is the notification",true);
}
}
