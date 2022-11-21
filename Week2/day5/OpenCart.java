package week2.day5;

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
		driver.findElement(By.id("input-username")).sendKeys("LeoTolstoy");
		driver.findElement(By.id("input-firstname")).sendKeys("Kathiravan");
		driver.findElement(By.id("input-lastname")).sendKeys("Boopathi");
		driver.findElement(By.id("input-email")).sendKeys("tsk24am@gmail.com");
		WebElement dropDown1=driver.findElement(By.name("country_id"));
		Select dd1= new Select(dropDown1);
		dd1.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tsk24am@gmail");;
		
	
	}
	
}
