package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priceoffristmobile {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://amazon.in/");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles under 20000",Keys.ENTER);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String ele = d.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
		System.out.println(ele);
		String ele2 = d.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/ancestor::div[@class='sg-col-inner']/descendant::span[@class=\"a-price-whole\"]")).getText();		
		System.out.println(ele2);
		String str= ele2.replaceAll(",","");
		int a= Integer.parseInt(str);
		if(a<20000) {
			System.out.println("test case passed!");
		}else {
			System.out.println("test case failed!");
		}
	}
}