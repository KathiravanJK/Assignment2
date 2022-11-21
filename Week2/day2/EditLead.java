package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Stanley");
	    driver.findElement(By.name("departmentName")).sendKeys("Aeronautical Engineering");
	    driver.findElement(By.name("description")).sendKeys("Leo Tolstoy and Dotestovsky are good writers in the world");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tsk25am@gmail.com");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("Stanley Kubrick was the best story teller in the world");
	    driver.findElement(By.name("submitButton")).click();
	     String title=driver.getTitle();
	     
	     System.out.println(title);
	}

}
