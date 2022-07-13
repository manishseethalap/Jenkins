package practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtigersorting {
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
		Thread.sleep(3000);
		d.findElement(By.xpath("//table[@class='lvt small']//tr/td[3]//a")).click();
		Thread.sleep(5000);
		List<WebElement> ele = d.findElements(By.xpath("//table[@class='lvt small']//tr[*]/td[3]"));
		System.out.println("After sort in Webpage");
		System.out.println(ele.size());
		for(int i=3;i<ele.size();i++) {
			
			String element = d.findElement(By.xpath("//table[@class='lvt small']//tr["+i+"]/td[3]")).getText();
			System.out.println((i-2)+")"+element);
		}
		System.out.println();
		Thread.sleep(6000);
		d.findElement(By.xpath("//table[@class='lvt small']/descendant::a[@href='javascript:;'][2]")).click();
		Thread.sleep(5000);
		List<WebElement> ele2 = d.findElements(By.xpath("//table[@class='lvt small']//tr[*]/td[3]"));
		String[] bs = new String[ele2.size()];
		System.out.println("before sort in java");
		for(int i=3;i<ele2.size();i++) {
			String element = d.findElement(By.xpath("//table[@class='lvt small']//tr["+i+"]/td[3]")).getText();
			System.out.println((i-2)+")"+element);
		}
		System.out.println("input all data for sorting");
		for(int i=0;i<ele2.size();i++) {
			bs[i]=ele2.get(i).getText();
			System.out.println(bs[i]);
		}
		System.out.println();
		Arrays.sort(bs);
		System.out.println("After sort in java");
		for(int i=3; i<ele2.size();i++) {
			System.out.println((i-2)+")"+bs[i]);
		}
		System.out.println();
		System.out.println("final data of sort done in java");

		for(int i=3;i<ele.size();i++) {
			System.out.println((i-2)+")"+bs[i]);
		}
		System.out.println();
		d.navigate().refresh();
		System.out.println("final data of sort done in Webpage");
		for(int i=0;i<ele.size();i++) {
			String m=ele.get(i).getText();
			System.out.println(i+")"+m);
		}
		
}
}

