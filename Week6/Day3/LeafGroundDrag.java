package week6.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDrag {
	public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node0pa5guvqlb8feakfc9dqhnjk5421624.node0");
	    driver.manage().window().maximize();
	    
	    WebElement ele2=driver.findElement(By.xpath("(//div[@class='card'])[2]"));
	    System.out.println(ele2.getSize());
	    
	    
	    WebElement ele = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
	   System.out.println("Location is"+ele.getLocation());;
	   System.out.println("size is"+ele.getSize());
	     Actions builder=new Actions(driver);
	     builder.dragAndDropBy(ele, 1000, 200).perform();
	     
	     WebElement source=driver.findElement(By.xpath("//div[@id='form:drag_content']"));
	     WebElement destination=driver.findElement(By.xpath("//div[@id='form:drop_header']"));
	     Actions builder1=new Actions(driver);
	     builder1.dragAndDrop(source, destination).perform();

	     String text = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
	     //System.out.println(text);
	     
	     if(text.equals("Dropped!")) {
	    	 System.out.println("It gets Dropped");
	    	 
	     } else {
	    	 System.out.println("It's not Dropped");
	     }

	     WebElement location = driver.findElement(By.xpath("(//div[@style='width: 400px'])[1]"));
	     System.out.println(location.getSize());
	     
	     WebElement ele3 = driver.findElement(By.xpath("(//div[@style='width: 400px']//span)[1]"));
	     Actions builder2=new Actions(driver);
	     builder2.dragAndDropBy(ele3, -120, 4).perform();
	     
	     WebElement ele4 = driver.findElement(By.xpath("(//div[@style='width: 400px']//span)[2]"));
	     Actions builder3=new Actions(driver);
	     builder3.dragAndDropBy(ele4, 400, 4).perform();
	     
	     
	}

}
