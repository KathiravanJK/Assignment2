package week2.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("Kathiravan");
		
		
		driver.findElement(By.name("lastname")).sendKeys("Boopathi");
		driver.findElement(By.name("reg_email__")).sendKeys("tsk24am@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234567Kat@");
		
		WebElement birthday_day=driver.findElement(By.xpath("//select[@id='day']"));
		Select dd1=new Select(birthday_day);
		dd1.selectByIndex(26);
		
		WebElement birthday_month=driver.findElement(By.xpath("//select[@id='month']"));
		Select dd2=new Select(birthday_month);
		dd2.selectByValue("5");
		
		WebElement birthday_year=driver.findElement(By.xpath("//select[@id='year']"));
		Select dd3=new Select(birthday_year);
		dd3.selectByVisibleText("2000");
		
		
		
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		File s=driver.getScreenshotAs(OutputType.FILE);
		File d= new File("./BK/ak.jpeg");
		FileUtils.copyFile(s, d);
		
	}
}
