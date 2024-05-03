package waitcondition;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wiatcondition {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).clear(); 
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	        driver.findElement(By.linkText("Catalog")).click();
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	        
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class = 'nav-icon far fa-dot-circle'])[1]"))).click();
//	      
	     driver.findElement(By.xpath("(//i[@class = 'nav-icon far fa-dot-circle'])[1]")).click();
	     
//	     WebElement productname = driver.findElement(By.id("SearchProductName"));
//	     productname.sendKeys("MACBOOKPRO");
	     
	 
	     
	     WebElement dd = driver.findElement(By.name("SearchCategoryId"));
	     Select drop = new Select(dd);
	     List<WebElement> drop1 = drop.getOptions();
	     
	     int value = drop1.size();
	     System.out.println("The category values are : "+value);
	     
	     drop.selectByIndex(3);
	     
	     for(int i=1; i<value; i++) {
	    	 
	    	String values  = drop1.get(i).getText();
	    	System.out.println("The Category are : "+values);
	     }
	     
	     WebElement checked = driver.findElement(By.id("SearchIncludeSubCategories"));
	     checked.click();
	     
	}

}
