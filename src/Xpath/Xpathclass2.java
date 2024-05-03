package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpathclass2 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 //Relative xpath
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rajesh@gmail.com");
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("RAjesh123");
		 
		 driver.findElement(By.xpath("//button[@name='login']"));//here am not clicking because of account creating
		 
		 //test xpath
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//Relative xpath with name
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rajesh");
		//Relative xpath with class name
		 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Megavath");
		 
		 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("8499899559");
		 //contains xpath
		 driver.findElement(By.xpath("(//input[contains(@type,'password')])[2]")).sendKeys("Rajesh@123");
		 
		new Select(driver.findElement(By.xpath("//select[@id='day']"))).selectByIndex(18);
		
		new Select(driver.findElement(By.xpath("//select[@id='month']"))).selectByValue("7");
		
		new Select(driver.findElement(By.xpath("//select[@title='Year']"))).selectByVisibleText("1998");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@name='websubmit'])")).click();
		
		 
		 
		 
		 
		 
	}

}
