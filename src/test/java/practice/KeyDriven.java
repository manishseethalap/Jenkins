package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyDriven {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("../SDET7_MAN/Files/Resource.PROPERTIES");
		Properties pobj = new Properties();
		pobj.load(fis);
		String prop=pobj.getProperty("browser");
		if(prop.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(prop.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		else if(prop.equalsIgnoreCase("Firefox")) {
			driver= WebDriverManager.firefoxdriver().create();
		}
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		
	}
}
