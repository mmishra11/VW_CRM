package com.listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.vwcrm.qa.base.TestBase;

public class MyListener extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(" test start");
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName() + "test execution has started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(" test success");
		test.log(LogStatus.PASS, result.getMethod().getMethodName() + "This test has passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(" test failure");
		test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "This test has failed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\images\\" + result.getMethod().getMethodName() + ".png"));
			String file = test.addScreenCapture("C:\\images\\" + result.getMethod().getMethodName() + ".png");
			test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed", file);
			test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed",
					result.getThrowable().getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(" test skipped");
		test.log(LogStatus.SKIP, result.getMethod().getMethodName() + "test is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(" test sucess within percentage");
	}

	public void onStart(ITestContext context) {
		System.out.println(" start");

		reports = new ExtentReports(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + "reports.html");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Execution finished");
		reports.endTest(test);
		reports.flush();
	}
}