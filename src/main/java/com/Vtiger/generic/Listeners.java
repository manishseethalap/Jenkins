package com.Vtiger.generic;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.PomClasses.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners extends BaseClass implements ITestListener  {
	public static WebDriver driver;
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+" passed");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+" failed");
		test.log(Status.FAIL, result.getThrowable());
		String methodname = result.getMethod().getMethodName();
		WebDriverUtil wb = new WebDriverUtil(driver);
		int r = MyRandom.randomNumber();
		String path=IAutoConsts.screenshotfile+methodname+r+".png";
		try {
			wb.screenshot(path);
			test.addScreenCaptureFromPath(path);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		driver =PropertyFile.driver;

		reporter= new ExtentSparkReporter(IAutoConsts.reportfile);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("VtigerApp");
		reporter.config().setReportName("CRM Report");

		reports= new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Browser","chrome");
		reports.setSystemInfo("build", "1103.0.5060.134423");
		reports.setSystemInfo("Created by", "Test Team");
	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
