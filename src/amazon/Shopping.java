package amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopping {
//total wrong do again

		public static void main(String[] args) throws InterruptedException, IOException {

               Properties prop = new Properties();
			
			FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Genamplify\\src\\amazon\\Shopinginput.properties");

			prop.load(file);
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		
			Thread.sleep(3000);
			
			
			driver.get(prop.getProperty("Url"));
			WebElement Fashion = driver.findElement(By.xpath(prop.getProperty("Fashion_xpath")));
			WebElement mens = driver.findElement(By.xpath(prop.getProperty("Mensfashion_xpath")));
			WebElement sprin = driver.findElement(By.xpath(prop.getProperty("Sprinsummer_xpath")));
			WebElement levis = driver.findElement(By.xpath(prop.getProperty("Sprinsummer_xpath")));
			
			
			
			Fashion.click();
			mens.click();
			sprin.click();
			levis.click();
			
			
			
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
 
	    }
	}
