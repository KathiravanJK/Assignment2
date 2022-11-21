package week6.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    ele.sendKeys("bags");
	    Thread.sleep(2000);
	    List<WebElement> searchBox = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//span/.."));
	    
	   for(WebElement sB1:searchBox) {
	    	
	    	String listItem=sB1.getText();
	    	if(listItem.equals("bags for boys")) {
	    		/*WebElement elem=driver.findElement(By.xpath("//span[text()=' for boys']/.."));
	    		Actions v=new Actions(driver);
	    		v.moveToElement(elem).perform();*/
	    		sB1.click();
	    	break;
	    	}
	    }
	 
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    
	    String name = driver.findElement(By.xpath("(//span[text()='\"bags for boys\"']/preceding-sibling::span)[1]")).getText();
	    System.out.println("Total Results"+name);
	    
	    driver.findElement(By.xpath("//span[text()='American Tourister']/preceding-sibling::div//i")).click();
	    driver.findElement(By.xpath("//span[text()='Generic']/preceding-sibling::div//i")).click();
	    
	    String name1 = driver.findElement(By.xpath("(//span[text()='\"bags for boys\"']/preceding-sibling::span)[1]")).getText();
	    System.out.println("Total Results"+name1);
	    if(name1.equals(name)) {
	    	System.out.println("results are not changed");
	    } else {
	    	System.out.println("results are changed");
	    }
	    
	    
	    driver.findElement(By.xpath("(//select[@id='s-result-sort-select']/following-sibling::span)")).click();
	    driver.findElement(By.xpath("(//a[text()='Newest Arrivals'])")).click();
	    
	    String name3 = driver.findElement(By.xpath("(//h5[@class='s-line-clamp-1'])[51]")).getText();
	    String name4 = driver.findElement(By.xpath("(//span[@class='a-letter-space'])[19]//following-sibling::span")).getText();
	    System.out.println("Name of the Product-"+name3);
	    System.out.println("Discount"+name4);
	    
	    WebElement ele1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    ele1.clear();
	    ele1.sendKeys("books");
	    ele1.sendKeys(Keys.ENTER);
	    
	    
	     String color = driver.findElement(By.xpath("(//span[text()='The Power of Your Subconscious Mind'])[1]/../../../..//span[@class='a-badge-label']")).getCssValue("color");
	     System.out.println(color);
	     
	     String priceOut=driver.findElement(By.xpath("(//span[text()='₹105'])[1]")).getText();
	     System.out.println("Price (Outside)-"+priceOut);
	     
	     if(color.equals("rgba(177, 39, 4, 1)")) {
	    	 System.out.println("Color is Red");
	     } else {
	    	 System.out.println("Color is not in Red");
	     }
	     
	     driver.findElement(By.xpath("(//a[@target='_blank'])[3]")).click();
	     
	     String windowHandle = driver.getWindowHandle();
	     System.out.println("Session Id-"+windowHandle);
	     
	     Set<String> windowHandles = driver.getWindowHandles();
	     
	     List<String> openedWindow=new ArrayList<String>(windowHandles);
	     driver.switchTo().window(openedWindow.get(1));
	     
	     String ele2 = driver.findElement(By.xpath("//span[@id='price']")).getText();
	     System.out.println("Price (Inside)-"+ele2);
	  
	     if("₹105.00".equals(ele2)) {
	    	 System.out.println("Both Price are Same");
	     } else {
	    	 System.out.println("Both Price are not Same");
	     }
	     
	     File source=driver.getScreenshotAs(OutputType.FILE);
	     File destination=new File("./snapshot/amazonbooks.png");
	     FileUtils.copyFile(source, destination);
	     
	     driver.close();
	}
	
    

}
