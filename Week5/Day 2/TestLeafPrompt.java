package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafPrompt {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    driver.manage().window().maximize();
	    
	    
	    driver.switchTo().frame("iframeResult");
	    
	    WebElement frame1=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	    frame1.click();
	    Alert sA= driver.switchTo().alert();
	    sA.sendKeys("Stanley Kubrick");
	    sA.accept();
	    
	    WebElement value= driver.findElement(By.xpath("//p[@id='demo']"));
	    String text =value.getText();
	    System.out.println(text);
	    
	    driver.switchTo().defaultContent();
	}

}
