package generic;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Vtiger.generic.IAutoConsts;

import io.github.bonigarcia.wdm.WebDriverManager;
public class PropertiesFile {
	/**
	 * @author manish
	 * @description This class is used to fetch the property file data
	 */

	public static WebDriver driver = null;
	
	
	/**
	 * @param key
	 * @return This method is used to fetch the property file data
	 * @throws Throwable
	 */
public void propertyFileData(String key) throws Throwable {
	FileInputStream fis = new FileInputStream(IAutoConsts.propertyFile);
	Properties prop = new Properties();
	prop.load(fis);
	String pobj =prop.getProperty(key);
	if(pobj.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	 if(pobj.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}else {
		System.out.println("Inavlid Entry of Browser");
	}
}
}
