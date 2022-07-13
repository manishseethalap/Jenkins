package practice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	class Vtiger {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.get("http://localhost:8888/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB);
		d.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);
		d.findElement(By.className("tabUnSelected")).click();
		d.findElement(By.xpath("//a[text()='Organizations']")).click();
		d.manage().window().maximize();
		List<WebElement> eles = d.findElements(By.xpath("//table[@class='lvt small']//tr"));
		Thread.sleep(3000);
		for(int i = 3; i<=eles.size(); i++) {
			WebElement ele = d.findElement(By.xpath("//table[@class='lvt small']//tr["+i+"]/td[1]"));
			ele.click();
			WebElement str = d.findElement(By.xpath("//table[@class='lvt small']//tr["+i+"]/td[3]"));
			String a = str.getText();
			System.out.println(a);
		}
		for(int i = 3; i<=eles.size(); i++) {
			WebElement str = d.findElement(By.xpath("//table[@class='lvt small']//tr["+i+"]/td[3]"));
			String a = str.getText();
			if(a.equalsIgnoreCase("microsoft")) {
				WebElement ele = d.findElement(By.xpath("//table[@class='lvt small']//tr["+i+"]/td[1]"));
				ele.click();
			}
		}
	}
	}
