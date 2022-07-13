package practice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IccCriket {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.icc-cricket.com/");
	d.findElement(By.xpath("//ul[@class='global-navigation__list']/descendant::div[@class='global-navigation__link'][5]")).click();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	d.findElement(By.xpath("//a[@class=' global-navigation__drop-down-link js-global-navigation-drop-down-link']")).click();
	d.findElement(By.xpath("//div[@class='u-negative-wrapper-tab uniform-grid touch-scroll-list--tablet']/descendant::a[@class='btn']")).click();
	List <WebElement> ele = d.findElements(By.xpath("//table[@class='table']"));
	Thread.sleep(2000);
	for(WebElement i:ele) {
		String str=i.getText();
		System.out.println(str);
	}
	Thread.sleep(2000);
	d.close();
}
}
