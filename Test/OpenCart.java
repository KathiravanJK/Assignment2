package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Stanley1999");
		driver.findElement(By.name("firstname")).sendKeys("Stanley");
		driver.findElement(By.name("lastname")).sendKeys("Kubrick");
		driver.findElement(By.name("email")).sendKeys("tsk24am@gmail.com");
		
		WebElement ele = driver.findElement(By.name("country_id"));
		Select dD1= new Select(ele);
		dD1.selectByValue("99");
		
		driver.findElement(By.name("password")).sendKeys("StanleyKubrick");
	}

}
