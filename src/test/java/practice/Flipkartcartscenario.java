package practice;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartcartscenario {
public static void main(String[] args) throws Throwable{
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.flipkart.com/");
	d.findElement(By.xpath("//button[text()='✕']")).click();
	d.findElement(By.name("q")).sendKeys("iphone 13 pro max", Keys.ENTER);
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	d.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	String win1 = d.getWindowHandle();
	Set<String> all = d.getWindowHandles();
	for(String i:all) {
		if(!win1.equals(all)) {
			d.switchTo().window(i);
		}
	}
	d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(3000);
	WebElement plusbutton = d.findElement(By.xpath("//button[text()='+']"));
	Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor)d;
	jse.executeScript("arguments[0].scrollIntoView();", plusbutton);
	plusbutton.click();
	Thread.sleep(3000);
	String totalamt=d.findElement(By.xpath("//div[@class='Ob17DV _3X7Jj1']")).getText();	
	String a= totalamt.replaceAll("₹","");
	String b= a.replaceAll(",", "");
	int totalamount=Integer.parseInt(b);
	System.out.println(totalamount);
	d.get("https://amazon.in/");
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro max",Keys.ENTER);
	d.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	Thread.sleep(2000);
	String ele4 = d.getWindowHandle();
	Set <String> 	ele5 = d.getWindowHandles();
	for(String i:ele5) {
		if(!ele4.equals(ele5)) {
			d.switchTo().window(i);
		}
	}
	JavascriptExecutor js = (JavascriptExecutor)d;
	WebElement ele2 = d.findElement(By.id("add-to-cart-button"));
	js.executeScript("arguments[0].scrollIntoView();", ele2);
	ele2.click();
	Thread.sleep(2000);
	d.findElement(By.id("attach-sidesheet-view-cart-button-announce")).click();
}
}
