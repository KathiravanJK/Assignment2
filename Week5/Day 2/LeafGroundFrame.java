package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundFrame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://leafground.com/frame.xhtml");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("(//button[text()='Click Me'])")).click();
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(2);
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("(//button[text()='Click Me'])")).click();
	    driver.switchTo().defaultContent();
	    
	   
	    
	}

}
