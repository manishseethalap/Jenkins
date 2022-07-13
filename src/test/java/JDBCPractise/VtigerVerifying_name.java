package JDBCPractise;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerVerifying_name {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	Random random = new Random();
	int r = random.nextInt(10000);
	d.get("http://localhost:8888/");
	d.manage().window().maximize();
	d.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	d.findElement(By.xpath("//a[text()='Organizations']")).click();
	d.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	d.findElement(By.name("accountname")).sendKeys("Google"+r);
	WebElement industry = d.findElement(By.name("industry"));
	Select select = new Select(industry);
	select.selectByValue("Technology");
	d.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	String header =  d.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	String orgname = d.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
	
	if(header.contains(orgname)) {
		System.out.println("Orgnaization Name Verified");
	}else {
		System.out.println("Orgnaization not Verified");
	}
}
}
