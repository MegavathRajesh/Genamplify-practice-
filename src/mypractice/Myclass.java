package mypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myclass {

	public static void main(String[] args) throws InterruptedException {
 
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.sumopayroll.com/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rajesh.m@genamplifysol.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Rajeshnagi@1");
		
		driver.switchTo().frame(0);
	
		driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[@name=\"button\"]")).click();
		
	}

}
