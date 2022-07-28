package com.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement usernametxtbox;
	
	public WebElement getusernametxtbox() {
		return usernametxtbox;
	}
	@FindBy(name="user_password")
	private WebElement passwordtextbox;
	
	public WebElement getpasswordtextbox() {
		return passwordtextbox;
	}
	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	public WebElement getloginbutton() {
		return loginbutton;
	}
}
