package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazondropdown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.get("https://amazon.in");
	d.manage().window().maximize();
	d.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement ele = d.findElement(By.xpath("//option[@value='search-alias=stripbooks']"));
	ele.click();
	String s=ele.getText();
	System.out.println(s);
}
}
