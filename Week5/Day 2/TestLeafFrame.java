package week5.day1;

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafFrame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.html']")));
		driver.switchTo().frame("frame2");
	    driver.findElement(By.id("Click1")).click();
	    driver.switchTo().defaultContent();
	   
	}

}
