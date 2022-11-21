package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kathir");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Boopathi");
	    
	    
	    WebElement dropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select dd1= new Select(dropDown1);
	    dd1.selectByIndex(3);
	    
	    WebElement dropDown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select dd2=new Select(dropDown2);
        dd2.selectByValue("IND_AEROSPACE");
        
        WebElement dropDown3 =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select dd3=new Select(dropDown3);
        dd3.selectByVisibleText("S-Corporation");
}
}
