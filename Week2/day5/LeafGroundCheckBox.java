package week2.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://leafground.com/checkbox.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    
	    driver.findElement(By.xpath("(//span[text()='Basic']/preceding-sibling::div)[2]")).click();
	    
	  
	    driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
	    
	    List<WebElement> s3 = driver.findElements(By.xpath("//input[@name='j_idt87:basic']/../following-sibling::div"));
		
		for(WebElement all:s3 )
		{
			all.click();
		}
		
	
	   driver.findElement(By.xpath("(//div[@class='col-12']//div)[24]")).click();
	
	 
	   String state1= driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
	   if(state1.equals("State = 1")) {
		   System.out.println("Notification is in 1st State");
	   } else {

		   System.out.println("Notification is not in 1st State");
	   }
	   
	   
	   driver.findElement(By.xpath("(//div[@class='col-12']//div)[24]")).click();
	   
	   
	   String state2= driver.findElement(By.xpath("//p[text()='State = 2']")).getText();
	   if(state2.equals("State = 2")) {
		   System.out.println("Notification is in 2nd State");
	   } else {
		   System.out.println("Notification is not in 2nd State");
	   }
	    
	    driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	    
	    WebElement enabled1 = driver.findElement(By.xpath("//input[@name='j_idt87:j_idt102_input']")); 
	    if(enabled1.isEnabled()) {
	    	System.out.println("enabled");
	    } else {
	    	System.out.println("disabled");
	    }
	    
	    driver.findElement(By.xpath("//ul[@data-label='Cities']//following-sibling::div")).click();
	    
	    List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='group']//label"));	
	    /*String text="";
	    
	    		
	    		for(int i=0; i<ele.size(); i++) {
	    			text=ele.get(i).getText();
	    			driver.findElement(By.xpath("//label[text()='"+text+"']/preceding-sibling::div")).click();
	    		}*/
	    		
	    		for(WebElement s1:ele) {
	    			String countries=s1.getText();
	    			System.out.println(countries);
	    			
	    			if(countries.equals("London") || countries.equals("Paris") || countries.equals("Rome") || countries.equals("Amsterdam") ) {
	    				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	    				wait.until(ExpectedConditions.elementToBeClickable(s1));
	    				s1.click();
	    		}
	    		
	    			
	}
	}
}

