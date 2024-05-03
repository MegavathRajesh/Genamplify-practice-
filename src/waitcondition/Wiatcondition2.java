package waitcondition;

import java.lang.reflect.Executable;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wiatcondition2 {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//implicitly sintax
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).clear(); 
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
		 driver.findElement(By.linkText("Catalog")).click();
		 
	     driver.findElement(By.xpath("(//i[@class = 'nav-icon far fa-dot-circle'])[1]")).click();
//
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Catalog"))).click();
	    
		
		 
		 
		 
		
		 

	}
	}
