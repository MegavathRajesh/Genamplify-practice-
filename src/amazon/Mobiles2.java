package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mobiles2 {


		public static void main(String[] args) throws InterruptedException {

			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']")).click();
			Thread.sleep(3000);

		WebElement ele=driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
			Actions act=new Actions(driver);
			
			act.moveToElement(ele).perform();
			WebElement ele1=driver.findElement(By.xpath("(//a[contains(text(),'Samsung')])[1]"));
			ele1.click();
			
			List<WebElement> allLinks = driver.findElements(By.xpath("//img[@class='s-image']/ancestor::a"));
			
			for(WebElement link:allLinks) {
				System.out.println(link.getText() + " - " + link.getAttribute("href"));
			}
			
			driver.quit();
 
	    }
	}
