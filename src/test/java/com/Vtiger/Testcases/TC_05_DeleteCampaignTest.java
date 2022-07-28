package com.Vtiger.Testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.PomClasses.BaseClass;
import com.PomClasses.CampaignInfoPage;
import com.PomClasses.CreateCampaignPage;
import com.PomClasses.HomePage;
import com.Vtiger.generic.ExcelUtility;
import com.Vtiger.generic.MyRandom;
import com.Vtiger.generic.PropertyFile;
import com.Vtiger.generic.Retryanalyser;
import com.Vtiger.generic.WebDriverUtil;

@Listeners(com.Vtiger.generic.Listeners.class)
public class TC_05_DeleteCampaignTest extends BaseClass {
	@Test(retryAnalyzer = Retryanalyser.class)
	public void deletecamoaigntest() throws Throwable {
	driver = PropertyFile.driver;
	HomePage hp = new HomePage(driver);
	hp.getquickcreate().click();
	WebDriverUtil wb = new WebDriverUtil(driver);
	wb.selectByValue(hp.getquickcreate(), "Campaigns");
	wb.implicit(20);
	CreateCampaignPage createcamp = new CreateCampaignPage(driver);
	ExcelUtility excel = new ExcelUtility();
	//MyRandom random = new MyRandom();
	int r=MyRandom.randomNumber();
	createcamp.getcampaignname().sendKeys(excel.readDatafromExcel("Sheet2", 1, 1)+r);
	createcamp.getcampsavebtn().click();
	CampaignInfoPage campinfo = new CampaignInfoPage(driver);
	String createdcampname = campinfo.getcreatedcampname().getText();
	String headercampname = campinfo.getheadercampname().getText();
	System.out.println("headercampname "+headercampname);
	System.out.println("createdcampname "+createdcampname);
	if(headercampname.contains(createdcampname)) {
		System.out.println("Campaign created successfully");
	}else {
		System.out.println("Campaign created unsuccessfully");
	}
	campinfo.getdeletebtn().click();
	wb.alertAccept();
	wb.switchToDefault();
	campinfo.getcampsearchtxtbox().sendKeys(createdcampname);
	campinfo.getcamptypeDD().click();
	wb.selectByIndex(campinfo.getcamptypeDD(), 2);
	campinfo.getcampsearchbtn().click();
	boolean verifydeletedmsg = campinfo.getverifydeletedmsg().isEnabled();
	if(verifydeletedmsg==true) {
		System.out.println("Campaign deleted successfully!");
	}else {
		System.out.println("Campaign deleted unsuccessfully!");
	}
	Thread.sleep(3000);
	}

}
