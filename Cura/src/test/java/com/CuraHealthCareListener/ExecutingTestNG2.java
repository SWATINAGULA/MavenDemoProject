package com.CuraHealthCareListener;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.BaseClassPackage.BaseClass;
//@Listeners(com.CuraHealthCareListener.Listeners_implementation.class)
public class ExecutingTestNG2 extends BaseClass {
	@Test(groups ={"smoke","system"})
	public void testMethod1() {
		Reporter.log("This is the test method 1",true);
	}
	
	@Test
	public void testMethod2()
	{
		Reporter.log("This is the test method 2",true);
	}
	
}
