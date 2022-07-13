package com.Vtiger.generic;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {
	public static WebDriver driver;
	public void propFile(String key) throws Throwable {
	String path="../SDET7_MAN/Files/browser.PROPERTIES";
		FileInputStream fis = new FileInputStream(path);
		Properties pf = new Properties();
		pf.load(fis);
		pf.getProperty(key);
	}
	
	public void propdriver(String key) throws Throwable {
		String path="../SDET7_MAN/Files/browser.PROPERTIES";
		FileInputStream fis = new FileInputStream(path);
		Properties pf = new Properties();
		pf.load(fis);
		String pobj = pf.getProperty(key);
		if(pobj.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(pobj.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
//		else if() {
//			
//		}
	}
}

