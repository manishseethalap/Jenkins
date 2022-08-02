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
public class TC_03_CreateOrg_DeleteTest extends BaseClass {
	public static WebDriver driver;
	
	@Test(groups="Regression",retryAnalyzer = Retryanalyser.class)
	public void createOrgdeletetest() throws Throwable {
		driver = PropertyFile.driver;
		HomePage hp=new HomePage(driver);
		hp.getorglinkbtn().click();
		OrgInfoPage orginfopage = new OrgInfoPage(driver);
		orginfopage.getcreatelinkbtn().click();
		CreateOrgPage createorgpage = new CreateOrgPage(driver);
		ExcelUtility excel = new ExcelUtility();
		//MyRandom random = new MyRandom();
		int r= MyRandom.randomNumber();
		createorgpage.getorgnametxtbox().sendKeys(excel.readDatafromExcel("Sheet2", 1, 0)+r);
		createorgpage.getorgindustryDD().click();
		WebDriverUtil wb = new WebDriverUtil(driver);
		wb.selectByIndex(createorgpage.getorgindustryDD(), 1);
		createorgpage.getSaveButton().click();
		wb.implicit(20);
		String createdorg = orginfopage.getcreatedorgname().getText();
		orginfopage.getdeleteorg().click();
		wb.alertAccept();
		wb.switchToDefault();
		orginfopage.getsearchorgtxtbox().sendKeys(createdorg);
		orginfopage.getselectorgtypeDD().click();
		wb.selectByIndex(orginfopage.getselectorgtypeDD(), 1);
		orginfopage.getsearchorgbtn().click();
		boolean verifydeletesmg = orginfopage.getverifydeletemsg().isDisplayed();
		if(verifydeletesmg==true) {
			System.out.println("Organization Deleted successfully!");
		}else {
			System.out.println("Organization Deleted unsuccessfully!");
		}
		Thread.sleep(3000);
	}
}