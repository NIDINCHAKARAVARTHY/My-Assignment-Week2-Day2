package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W2D2Task2 {
  public static void main(String args[]) {
	  
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get( "http://leaftaps.com/opentaps/control/login");
	  driver.get( "http://leaftaps.com/opentaps/control/login");
	  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
	  driver.findElement(By.className("decorativeSubmit")).click();
	  driver.findElement(By.linkText("CRM/SFA")).click();
	  driver.findElement(By.linkText("Leads")).click();
	  driver.findElement(By.linkText("Create Lead")).click();
	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
	  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raja");
	  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajakumar123@gmail.com");
	  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8658587565");
	  driver.findElement(By.name("submitButton")).click();
	  driver.findElement(By.linkText("Edit")).click();
	  driver.findElement(By.id("updateLeadForm_companyName")).clear();
	  driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("DN");
	  driver.findElement(By.className("smallSubmit")).click();
  }
}
