package com.PomClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Organizations'][1]")
	private WebElement orglinkbtn;
	
	public WebElement getorglinkbtn() {
		return orglinkbtn;
	}
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutimg;
	
	public WebElement getsignoutimg() {
		return signoutimg;
	}
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutlink;
	
	public WebElement getsignoutlink() {
		return signoutlink;
	}
	@FindBy(xpath = "//a[@href='javascript:;']")
	private WebElement more;
	
	public WebElement getmore() {
		return more;
	}
	
	@FindBy(id = "qccombo")
	private WebElement quickcreate;
	
	public WebElement getquickcreate() {
		return quickcreate;
	}
}
