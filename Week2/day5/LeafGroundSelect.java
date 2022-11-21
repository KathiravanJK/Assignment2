package week2.day5;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://leafground.com/select.xhtml");
	    driver.manage().window().maximize();
	    
	    WebElement Select1=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	    Select dd1= new Select(Select1);
	    dd1.selectByIndex(2);
	    
	    driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();   
	    driver.findElement(By.xpath("//li[@data-label='India']")).click();
	  
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[@id='j_idt87:city'])")).click();
	    driver.findElement(By.xpath("(//li[@data-label='Chennai'])")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//button[@aria-label='Show Options'])")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
	    driver.findElement(By.xpath("//li[@data-item-label='PostMan']")).click();
	    
	    driver.findElement(By.xpath("(//div[@id='j_idt87:lang']/div)[3]")).click();
	    driver.findElement(By.xpath("//li[@id='j_idt87:lang_2']")).click();
	  
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[@class='col-12']//div)[16]")).click();
	    driver.findElement(By.xpath("//li[@id='j_idt87:value_1']")).click();
	    
	    
	  
	}

}
