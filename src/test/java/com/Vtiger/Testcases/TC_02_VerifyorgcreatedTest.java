package com.Vtiger.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.PomClasses.BaseClass;
import com.PomClasses.CreateOrgPage;
import com.PomClasses.HomePage;
import com.PomClasses.OrgInfoPage;
import com.Vtiger.generic.ExcelUtility;
import com.Vtiger.generic.MyRandom;
import com.Vtiger.generic.PropertyFile;
import com.Vtiger.generic.Retryanalyser;
import com.Vtiger.generic.WebDriverUtil;

@Listeners(com.Vtiger.generic.Listeners.class)
public class TC_02_VerifyorgcreatedTest extends BaseClass{
	public static WebDriver driver;
@Test(retryAnalyzer = Retryanalyser.class)
public void verifyorgcreated() throws Throwable {
	driver= PropertyFile.driver;
	HomePage hp = new HomePage(driver);
	hp.getorglinkbtn().click();
	OrgInfoPage orginfopage= new OrgInfoPage(driver);
	orginfopage.getcreatelinkbtn().click();
	CreateOrgPage createorgpage = new CreateOrgPage(driver);
	ExcelUtility excel = new ExcelUtility();
	//MyRandom random = new MyRandom();
	int r = MyRandom.randomNumber();
	createorgpage.getorgnametxtbox().sendKeys(excel.readDatafromExcel("Sheet2", 1, 0)+r);
	WebDriverUtil wb = new WebDriverUtil(driver);
	createorgpage.getorgindustryDD().click();
	wb.selectByIndex(createorgpage.getorgindustryDD(), 1);
	createorgpage.getSaveButton().click();
	wb.implicit(20);
	String orgname= orginfopage.getcreatedorgname().getText();
	String createdorgname = orginfopage.getvieworgname().getText();
	if(orgname.contains(createdorgname)) {
		System.out.println("Organization name verified successfully!");
	}else {
		System.out.println("Organization name verified unsuccessfully!");
	}
	Thread.sleep(3000);
}
}
