package com.Vtiger.generic;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtil {
	  WebDriver driver;
	public WebDriverUtil(WebDriver driver) {
		this.driver=driver;
	}
	public void url(String url) {
		driver.get(url);
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void minimize() {
		driver.manage().window().minimize();
	}
	public void implicit(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	public void selectByIndex(WebElement element, int num) {
		Select select = new Select(element);
		select.selectByIndex(num);
	}
	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void selectByVisibleText(WebElement element, String visibletext) {
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}
	public void dragAndDrop(WebElement src, WebElement dest) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(src, dest).perform();
	}
	public void leftClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).contextClick().build().perform();
	}
	public void forward() {
		driver.navigate().forward();
	}
	public void back() {
		driver.navigate().back();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void  alertSendKeys(String alertsendkeys) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(alertsendkeys);
	}
	public void alertGetText() {
		Alert alert = driver.switchTo().alert();
		alert.getText();
	}
	public void switchToDefault() {
		driver.switchTo().defaultContent();
	}
	public void screenshot(String path) throws Throwable {
		driver=PropertyFile.driver;
		TakesScreenshot ts = (TakesScreenshot)driver;
		//String screenshot=path;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		Files.copy(src, dest);
		// return screenshot;
	}
	public void closeBrowser() {
		driver.close();
	}
}
