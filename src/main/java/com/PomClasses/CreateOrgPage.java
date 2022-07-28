package com.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPage {
	WebDriver driver;
	public CreateOrgPage(WebDriver driver){
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "accountname")
	private WebElement orgnametxtbox;
	
	public WebElement getorgnametxtbox() {
		return orgnametxtbox;
	}
	
	@FindBy(name = "industry")
	private WebElement orgindustryDD;
	
	public WebElement getorgindustryDD() {
		return orgindustryDD;
	}
	@FindBy(xpath = "//input[@title='Save [Alt+S]'][1]")
	 private WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}
}
