package week7.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement findElement1 = driver.findElement(By.xpath("//a[text()='brands']"));
		
		Actions builder=new Actions(driver);
	    builder.moveToElement(findElement1).perform();
	    
	    driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
	    driver.findElement(By.xpath("(//a[contains(text(),'Oreal Paris')])[1]")).click();
	    
	    String Title=driver.getTitle();
	    System.out.println(Title);
	    
	    if(Title.contains("L'Oreal Paris")){
	    	System.out.println("Title contains");
	    } else {
	    	System.out.println("Title not contains");
	    }
	    
	    driver.findElement(By.xpath("//span[@class='sort-name']/..")).click();
	    driver.findElement(By.xpath(" (//span[text()='customer top rated']/..//following::div)[1]")).click();
	    driver.findElement(By.xpath(" //span[text()='Category']/..")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(" //span[text()='Hair']/..")).click();
	    driver.findElement(By.xpath(" //span[text()='Hair Care']/..")).click();
	    driver.findElement(By.xpath("(//span[text()='Shampoo']/..//following::div)[1]")).click();
	    
	    driver.findElement(By.xpath("//span[text()='Concern']/..")).click();
	    driver.findElement(By.xpath("(//span[text()='Color Protection']/..//following::div)[1]")).click();
	    
	    String ele1 = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
	    System.out.println(ele1);
	    
	    if(ele1.equals("Shampoo")) {
	    	System.out.println("Filter contains Shampoo");
	    } else {
	    	System.out.println("Filter not contains Shampoo");
	    }
	    
	    String parentwindow = driver.getWindowHandle();
	    System.out.println(parentwindow);
	    
	    
	    driver.findElement(By.xpath("(//div[contains(text(),'Oreal Paris Colour Protect Shampoo')])")).click();
	    
	    Set<String> windowHandles = driver.getWindowHandles();
	    
	    List<String> opened=new ArrayList<String>(windowHandles);
	    driver.switchTo().window(opened.get(1));
	    
	   String title2=driver.getTitle();
	   System.out.println(title2);
	   
	    driver.findElement(By.xpath("(//span[text()='192.5ml'])/..")).click();
	    
	    
	    String text = driver.findElement(By.xpath("(//span[text()='₹170'])[1]")).getText();
	    System.out.println("Price-"+text);
	  
	    driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
	    driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
	    
	    driver.switchTo().frame(0);
	    String text2 = driver.findElement(By.xpath("//p[text()='₹240']")).getText();
	    System.out.println(text2);
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//span[text()='Proceed']/../..//span)[3]")).click();
	    
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	    
	    String text3 = driver.findElement(By.xpath("//p[text()='₹240']")).getText();
	    System.out.println(text3);
	    
	   if(text3.equals(text2)) {
	    	System.out.println("Price Equals");
	    } else {
	    	System.out.println("price Not Equals");
	    }
	    
	    driver.quit();
	}

}
