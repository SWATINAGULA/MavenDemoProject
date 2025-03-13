package com.CuraHealthCareListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_implementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("The test execution is started",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("The test is successful",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("The test is failure",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("The test method is skipped",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("The test suit is started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("The test suit is finished",true);
	}

}
