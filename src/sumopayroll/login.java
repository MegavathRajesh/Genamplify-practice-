package sumopayroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://app.sumopayroll.com/login");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Rajesh@1.com");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Rajesh@1344");
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement check = driver.findElement(By.className("recaptcha-checkbox-border"));
		check.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement log = driver.findElement(By.name("button"));
		log.click();
		
		

	}

}
