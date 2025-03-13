package com.ExecutingTestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.BaseClassPackage.BaseClass;

public class ExecutingTestNG2 extends BaseClass {
	@Test
	public void testMethod3() {
		Reporter.log("This is the test method 3",true);
	}
	
	@Test
	public void testMethod4()
	{
		Reporter.log("This is the test method 4",true);
	}
	
}
