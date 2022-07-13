package Dump;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Vtiger.generic.WebDriverUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dump {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	WebDriverUtil wdu = new WebDriverUtil(driver);
	wdu.url("http://www.amazon.in");
	wdu.maximize();
}
}
