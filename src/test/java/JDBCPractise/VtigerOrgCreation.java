//package JDBCPractise;
//import java.time.Duration;
//import java.util.Random;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import com.Vtiger.generic.PropertyFile;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class VtigerOrgCreation {
//	static WebDriver driver;
//
//	public static void main(String[] args) throws Throwable {
//
// 		PropertyFile file = PropertyFile.getobject();
//	//	String URL=file.readDatafromPropfile("url");
////
//	//	String password=file.readDatafromPropfile("password");
//		String BROWSER=file.readDatafromPropfile("browser");
//
//
//		if(BROWSER.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
//		else if(BROWSER.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver= new ChromeDriver();
//		}
//		else {
//			System.out.println("Invalid Input");
//		}
//
//
//
//
//		driver.get("URL");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.findElement(By.name("user_name")).sendKeys(username,Keys.TAB);
//		driver.findElement(By.name("user_password")).sendKeys(password,Keys.ENTER);
//		driver.findElement(By.className("tabUnSelected")).click();
//		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//		Random random = new Random();
//		int rand= random.nextInt(10000);
//		driver.findElement(By.name("accountname")).sendKeys("Google"+rand);
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//	}
//}
