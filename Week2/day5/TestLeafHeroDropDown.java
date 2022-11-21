package week2.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafHeroDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://testleaf.herokuapp.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@href='pages/Dropdown.html']")).click();
	   
	    WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
	    Select dd1= new Select(dropDown1);
	    dd1.selectByIndex(3);
	    
	    WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
	    Select dd2= new Select(dropDown2);
	    dd2.selectByVisibleText("Loadrunner");
	    
	    WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
	    Select dd3= new Select(dropDown3);
	    dd3.selectByValue("2");
	    
	    WebElement dropdown4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
	    Select dd4=new Select(dropdown4);
	    List<WebElement> dd41 = dd4.getOptions();
	    System.out.println(dd41.size());
	    
	    driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Appium");
	    driver.findElement(By.xpath("(//option[@value='4'])[6]")).click();
	    
	   
	    
	}

}
