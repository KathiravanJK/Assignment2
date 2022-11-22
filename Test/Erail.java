package week7.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://erail.in");
	driver.manage().window().maximize();
	
	 WebElement from1 = driver.findElement(By.id("txtStationFrom"));
	  from1.clear();
	  from1.sendKeys("MAS");
	  from1.sendKeys(Keys.TAB);
	  WebElement to1 = driver.findElement(By.id("txtStationTo"));
	  to1.clear();
	  to1.sendKeys("DG");
	  to1.sendKeys(Keys.TAB);
	  driver.findElement(By.id("chkSelectDateOnly")).click();
	  Thread.sleep(3000);
	 List<WebElement> trains = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
	  System.out.println(trains.size());
	 for (int i = 0; i < trains.size(); i++) {
		 String value=trains.get(i).getText();
		 System.out.println(i+"-"+value);
}
}
}