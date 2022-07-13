package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lenskart {
public static void main(String[] args) {
	WebDriver driver = null;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lenskart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//button[text()='No thanks']")).click();
	driver.findElement(By.name("q")).click();
	List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']"));
	for(WebElement i:ele) {
		String s=i.getText();
		System.out.println(s);
	}
}
}
