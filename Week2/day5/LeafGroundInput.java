package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInput {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://leafground.com/input.xhtml");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//input[@name='j_idt88:name']")).sendKeys("Kathiravan");
	    driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).sendKeys(",Palani");
	    
	    
	    WebElement editField = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt93']")); 
	    if(editField.isEnabled()) {
	    	 System.out.println("Edit Field is Enabled");
	    } else {
	    	System.out.println("Edit Field is Disabled");
	    }
	    
	    driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
	    driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']")).sendKeys("tsk24am@gmail.com");
	    driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']")).sendKeys(Keys.TAB);
	    driver.findElement(By.xpath("//textarea[@name='j_idt88:j_idt101']")).sendKeys("I'm a fan of Stanley Kubrick. I love filmmaking and trying to be an ardent Reader");
	    driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
	    
	    String value2=driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
	    System.out.println(value2);
	    
	    
	    driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']")).sendKeys("Jayakanthan");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[@data-item-label='Jayakanthan2']")).click();
	  
	    WebElement value=driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']"));
	    value.sendKeys("05/27/2000");
	    Thread.sleep(1000);
	    String value3=value.getAttribute("value");
	    System.out.println(value3);
	    if(value3.equals("05/27/2000")) {
	    	System.out.println("Date verified-Ok");
	    } else {
	    	System.out.println("Date verified-Not OK");
	    }
	    
	    driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys("1");
	    WebElement spinUp=driver.findElement(By.xpath("(//span[@class='ui-button-text'])[3]"));
	    spinUp.click();
	    spinUp.click();
	    spinUp.click();
	    Thread.sleep(1000);
	    WebElement spinDown=driver.findElement(By.xpath("(//span[@class='ui-button-text'])[4]"));
	    spinDown.click();
	    
	    driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("24");
	    
	    driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
	    
	    

	    
	    
	    
	}
	
	
}
