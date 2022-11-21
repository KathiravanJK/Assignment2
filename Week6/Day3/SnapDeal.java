package week6.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
	    driver.manage().window().maximize();
	    
	    WebElement ele = driver.findElement(By.xpath("(//span[contains(text(), 'Fashion')])[1]"));
	    
	   
	    Actions builder=new Actions(driver);
	    builder.moveToElement(ele).perform();
	    
	    driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
	    
	    
	    String Title=driver.getTitle();
	    System.out.println(Title);
	    
	    String shoes=driver.findElement(By.xpath("//h1[@itemprop='name']/following-sibling::span")).getText();
	    System.out.println("No.of Shoes-"+shoes);
	    
	    driver.close();
	}

}
