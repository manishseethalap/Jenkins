package com.Vtiger.Testcases;


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
public class TC_01_CreateOrganizationTest extends BaseClass{
	@Test(groups = "Smoke",retryAnalyzer = Retryanalyser.class)
	public void createorgtest() throws Throwable {
		driver = PropertyFile.driver;
		HomePage hp = new HomePage(driver);
		hp.getorglinkbtn().click();
		OrgInfoPage orginfopage = new OrgInfoPage(driver);
		orginfopage.getcreatelinkbtn().click();
		CreateOrgPage createorgpage = new CreateOrgPage(driver);
		ExcelUtility excel = new ExcelUtility();
		int r = MyRandom.randomNumber();
		createorgpage.getorgnametxtbox().sendKeys(excel.readDatafromExcel("Sheet2", 1, 0)+r);
		createorgpage.getorgindustryDD().click();
		WebDriverUtil wb = new WebDriverUtil(driver);
		wb.selectByIndex(createorgpage.getorgindustryDD(), 1);
		createorgpage.getSaveButton().click();
		Thread.sleep(3000);
	}
}
