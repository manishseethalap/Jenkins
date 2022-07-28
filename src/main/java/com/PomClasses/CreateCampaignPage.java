package com.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	WebDriver driver;
	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "campaignname")
	private WebElement campaignname;

	public WebElement getcampaignname() {
	return campaignname;
	}
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement campsavebtn;
	
	public WebElement getcampsavebtn() {
		return campsavebtn;
	}
}
