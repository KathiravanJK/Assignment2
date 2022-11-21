package week2.day5;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafCheckBox {
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://testleaf.herokuapp.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[7]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
			
			
			WebElement s1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
			if(s1.isSelected()){
				System.out.println("It is Selected");
			} else {
				System.out.println("It is not Selected");
			}
			
			List<WebElement> s2 = driver.findElements(By.xpath("(//label[text()='DeSelect only checked'])//following-sibling::input"));
			for(WebElement all1:s2)
			if(all1.isSelected()){
				all1.click();
			}
			
			List<WebElement> s3 = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input"));
			
			for(WebElement all:s3 )
			{
				all.click();
			}
				
			
			
            	 
            
}
}
