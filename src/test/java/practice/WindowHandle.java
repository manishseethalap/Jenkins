package practice;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WindowHandle {
	public static WebDriver driver;
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
	driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)']")).click();
	String main = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	for(String i:all) {
		if(!i.equals(main)) {
			driver.switchTo().window(i);
		}
	}
	System.out.println(driver.getTitle());
}
}
