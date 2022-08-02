package com.PomClasses;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.Vtiger.generic.PropertyFile;
import com.Vtiger.generic.WebDriverUtil;


public class BaseClass {
	public static WebDriver driver;
	PropertyFile pf = new PropertyFile();
	
	@BeforeSuite(groups = {"Smoke","Regression"})
	public void connectToDB() {
		System.out.println("Connected to DB");
	}
	@BeforeClass(groups = {"Smoke","Regression"})
	public void launchBrowser() throws Throwable {
		driver=pf.selectBrowser("browser");
		WebDriverUtil wb = new WebDriverUtil(driver);
		wb.url(pf.readDatafromPropfile("URL"));
		wb.maximize();
	}
	@BeforeMethod(groups = {"Smoke","Regression"})
	public void logIn() throws Throwable {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.getusernametxtbox().sendKeys(pf.readDatafromPropfile("username"));
		loginpage.getpasswordtextbox().sendKeys(pf.readDatafromPropfile("password"));
		loginpage.getloginbutton().click();
	}
	@AfterMethod(groups = {"Smoke","Regression"})
	public void logOut() {
		HomePage homepage = new HomePage(driver);
		homepage.getsignoutimg().click();
		homepage.getsignoutlink().click();
	}
	@AfterClass(groups = {"Smoke","Regression"})
	public void closeBrowser() {
		WebDriverUtil wb = new WebDriverUtil(driver);
		wb.closeBrowser();
	}
	@AfterSuite(groups = {"Smoke","Regression"})
	public void disconnectFromDB() {
		System.out.println("Disconnected from DB");
	}
}
