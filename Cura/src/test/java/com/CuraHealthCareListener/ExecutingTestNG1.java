package com.CuraHealthCareListener;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.BaseClassPackage.BaseClass;
//@Listeners(com.CuraHealthCareListener.Listeners_implementation.class)
public class ExecutingTestNG1 extends BaseClass {
	@Test
	public void testMethod3() {
		Reporter.log("This is the test method 3",true);
	}
	
	@Test(groups ={"smoke","system"})
	public void testMethod4()
	{
		Reporter.log("This is the test method 4",true);
	}
}
