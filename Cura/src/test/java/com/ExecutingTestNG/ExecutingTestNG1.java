package com.ExecutingTestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.BaseClassPackage.BaseClass;

public class ExecutingTestNG1 extends BaseClass {
	@Test
	public void testMethod1() {
		Reporter.log("This is the test method 1",true);
	}
	
	@Test
	public void testMethod2()
	{
		Reporter.log("This is the test method 2",true);
	}
}
