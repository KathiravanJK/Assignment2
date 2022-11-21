package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafLeads {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	   
	    
	    driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
	    
	    String parentwindow = driver.getWindowHandle();
	    System.out.println(parentwindow);
	  
	    driver.findElement(By.xpath("(//img[@alt='Lookup']/parent::a)[1]")).click();
	    
	    Set<String> windowHandles = driver.getWindowHandles();
	    
	    List<String> opened=new ArrayList<String>(windowHandles);
	    driver.switchTo().window(opened.get(1));
         Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	    driver.switchTo().window(opened.get(0));
	    
        driver.findElement(By.xpath("(//img[@alt='Lookup']/parent::a)[2]")).click();
	    
	    Set<String> windowHandles2 = driver.getWindowHandles();
	    
	    List<String> opened2=new ArrayList<String>(windowHandles2);
	    driver.switchTo().window(opened2.get(1));
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//tr[@class='x-grid3-hd-row']/td)[1]")).click();
	    WebElement ele1 = driver.findElement(By.xpath("(//tr[@class='x-grid3-hd-row']//a)[1]"));
	    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele1));
		ele1.click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='x-menu-item xg-hmenu-sort-desc']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	    driver.switchTo().window(opened.get(0));
	    
	    driver.findElement(By.xpath("//a[text()='Merge']")).click();
	    Alert cA=driver.switchTo().alert();
	    cA.accept();
	    
	    String value=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
	    System.out.println("Company Name-"+value);
	}
	
}
