package com.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInfoPage {
	WebDriver driver;
	public CampaignInfoPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@id='dtlview_Campaign Name']")
	private WebElement createdcampname;
	
	public WebElement getcreatedcampname() {
		return createdcampname;
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headercampname;
	public WebElement getheadercampname() {
		return headercampname;
	}
	@FindBy(name = "Delete")
	private WebElement deletebtn;
	
	public WebElement getdeletebtn() {
		return deletebtn;
	}
	
	@FindBy(className = "txtBox")
	private WebElement campsearchtxtbox;
	
	public WebElement getcampsearchtxtbox() {
		return campsearchtxtbox;
	}
	@FindBy(id = "bas_searchfield")
	private WebElement camptypeDD;
	
	public WebElement getcamptypeDD() {
		return camptypeDD;
	}
	
	@FindBy(name = "submit")
	private WebElement campsearchbtn;
	
	public WebElement getcampsearchbtn() {
		return campsearchbtn;
	}
	
	@FindBy(xpath = "//span[normalize-space()='No Campaign Found !']")
	private WebElement verifydeletedmsg;
	
	public WebElement getverifydeletedmsg() {
		return verifydeletedmsg;
	}
}
