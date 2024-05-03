package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amozon {


		public static void main(String[] args) throws InterruptedException {

			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
			bestseller.click();
			WebElement books = driver.findElement(By.xpath("(//a[text()='Books'])[2]"));
			books.click();
			WebElement book= driver.findElement(By.xpath("//div[text()='BUYERSTOPS Interact in English Main Course Book (MCB) + Literature+ Workbook for class 9 A textbook for English course (Communicative) March 2023-24']"));
			book.click();
			
			WebElement dd = driver.findElement(By.xpath("//select[@name='quantity']"));
			Select select = new Select(dd);
			
			select.selectByVisibleText("6");
			
			
			
			WebElement addtocart = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
			addtocart.click();
			
			
			
			
//			driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']")).click();
//			Thread.sleep(3000);
//
//		WebElement ele=driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
//			Actions act=new Actions(driver);
//			
//			act.moveToElement(ele).perform();
//			WebElement ele1=driver.findElement(By.xpath("(//a[contains(text(),'Samsung')])[1]"));
//			ele1.click();
//			
//			List<WebElement> allLinks = driver.findElements(By.xpath("//img[@class='s-image']/ancestor::a"));
//			
//			for(WebElement link:allLinks) {
//				System.out.println(link.getText() + " - " + link.getAttribute("href"));
//			}
//			
//			driver.quit();
// 
	    }
	}
