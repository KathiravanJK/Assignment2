package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafAlert {
public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	    Alert sA= driver.switchTo().alert();
	    sA.accept();
	   
	    driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	    Alert cA= driver.switchTo().alert();
	    cA.dismiss();
	    
	    driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	    Alert pA= driver.switchTo().alert();
	    Thread.sleep(2000);
	    pA.sendKeys("Kubrick");
	    pA.accept();
	   
	    
	    
}
}
