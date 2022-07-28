package generic;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reports {
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	@Test
	public void reportCreation() throws Throwable{
		reporter = new ExtentSparkReporter("../SDET7_MAN/zreport/report.html");
		reporter.config().setDocumentTitle("Facebook");
		reporter.config().setTheme(Theme.STANDARD);
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Application version", "5.0.9");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Environment", "QA");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		test=reports.createTest("Facebook");
		
		String path ="../SDET7_MAN/screenshots/abc1.png"; 
		TakesScreenshot t = (TakesScreenshot)driver;
		File screenshot = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(screenshot, dest);
		test.addScreenCaptureFromPath(path);
		reports.flush();
	}
}
