package week7.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Phones");
		ele.sendKeys(Keys.ENTER);
		
		List<WebElement> name = driver.findElements(By.xpath("//span[@class='a-price']//span[@class='a-price-whole']"));
		System.out.println(name.size());
		
		for (int i = 0; i < name.size(); i++) {
			 String value=name.get(i).getText();
			 System.out.println(value);
			
		}
		
		
		
		
		
		
		
	}

}
