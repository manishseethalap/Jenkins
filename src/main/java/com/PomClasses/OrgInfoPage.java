package com.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class OrgInfoPage {
	  WebDriver driver;
public OrgInfoPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createlinkbtn;
	
	public WebElement getcreatelinkbtn() {
		return createlinkbtn;
	}
	
	@FindBy(name = "search_text")
	private WebElement searchorgtxtbox;
	
	public WebElement getsearchorgtxtbox() {
		return searchorgtxtbox;
	}
	
	@FindBy(id = "bas_searchfield")
	private WebElement selectorgtypeDD;
	
	public WebElement getselectorgtypeDD() {
		return selectorgtypeDD;
	}
	
	@FindBy(name = "submit")
	private WebElement searchorgbtn;
	
	public WebElement getsearchorgbtn() {
		return searchorgbtn;
	}
		
	@FindBy(xpath = "//a[@title='Organizations']")
	private WebElement searchedorgname;
	
	public WebElement getsearchedorgname() {
		return searchedorgname;
	}
	
	@FindBy(className = "dvHeaderText")
	private WebElement createdorgname;
	
	public WebElement getcreatedorgname() {
		return createdorgname;
	}
	
	@FindBy(id = "dtlview_Organization Name")
	private WebElement vieworgname;
	
	public WebElement getvieworgname() {
		return vieworgname;
	}
	
	@FindBy(name = "Delete")
	private WebElement deleteorg;
	
	public WebElement getdeleteorg() {
		return deleteorg;
	}
	
	@FindBy(xpath = "//span[@class='genHeaderSmall']")
	private WebElement verifydeletemsg;
	
	public WebElement getverifydeletemsg() {
		return verifydeletemsg;
	}
	
	

}
