package css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
 
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.findElement(By.cssSelector("#email")).sendKeys("Rajesh");
	    driver.findElement(By.cssSelector("[name='pass']")).sendKeys("RAjesh123");
	    driver.findElement(By.cssSelector("[name='login']"));
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Rajesh");
	    driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("Megavath");
	    
	    driver.findElement(By.cssSelector("[name='reg_email__']")).sendKeys("9703778228");
	    
	    driver.findElement(By.cssSelector("[name='reg_passwd__']")).sendKeys("Rajesh@123");
	    
	  new Select(driver.findElement(By.cssSelector("#day"))).selectByValue("19");
	  
	  new Select(driver.findElement(By.cssSelector("#month"))).selectByVisibleText("Jul");
	  new Select(driver.findElement(By.cssSelector("#year"))).selectByIndex(26);
	  
	  Thread.sleep(1000);
	   driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	    
	    //tagname[@attribute='attributename'] 
	   
	  
	    driver.findElement(By.cssSelector("[name='websubmit'")).click();
 
	}

}
