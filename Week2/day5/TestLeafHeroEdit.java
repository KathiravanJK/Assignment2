package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafHeroEdit {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://testleaf.herokuapp.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@href='pages/Edit.html']")).click();
	    driver.findElement(By.id("email")).sendKeys("rp.pm@bitsathy.in");
	    
	    WebElement value1=driver.findElement(By.xpath("//input[@value='Append ']"));
	    value1.clear();
	    value1.sendKeys("Deepavali");
	    value1.sendKeys(Keys.TAB);
	    
	    String value =driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
	    System.out.println("Default Value- "+value);
	    
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	  
	    WebElement editField = driver.findElement(By.xpath("//input[@disabled='true']")); 
	    if(editField.isEnabled()) {
	    	 System.out.println("Edit Field is Enabled");
	    } else {
	    	System.out.println("Edit Field is Disabled");
	    }
	   
	  
	}
	

}
