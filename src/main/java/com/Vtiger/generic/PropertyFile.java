package com.Vtiger.generic;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {
	public static WebDriver driver;
	public static WebDriver sdriver;
	public String readDatafromPropfile(String key) throws Throwable {
		String path=IAutoConsts.propertyFile;
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value= prop.getProperty(key);
		return value;
	}

	public WebDriver selectBrowser(String key) throws Throwable {
		String path=IAutoConsts.propertyFile;
		FileInputStream fis = new FileInputStream(path);
		Properties pobj = new Properties();
		pobj.load(fis);
		String browser = pobj.getProperty(key);
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else{
			System.out.println("Invalid Browser Name");
		}
		return driver;
	}
}

