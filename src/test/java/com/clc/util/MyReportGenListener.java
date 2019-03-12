package com.clc.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyReportGenListener implements ITestListener {

	static int testPassCount =0;
	static int testFailCount =0;
	static int testSkipCount =0;
	
	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
		testPassCount++;
	}

	public void onTestFailure(ITestResult result) {
		testFailCount++;
	}

	public void onTestSkipped(ITestResult result) {
		testSkipCount++;
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
		System.out.println("Total Test Passed : " +testPassCount);
		System.out.println("Total Test Failed : " +testFailCount);
		System.out.println("Total Test Skipped : " +testSkipCount);
		try {
			ReportGenerationLogic.generateTestReport(testPassCount, testFailCount, testSkipCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
