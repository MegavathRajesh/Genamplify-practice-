package datawrite;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class halloo {

	public static void main(String[] args) throws InterruptedException {
		  
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get("https://www.cleartrip.com/trains");
			driver.findElement(By.xpath("//*[@href=\'http://www.cleartrip.com/faq/account/tour/trains_cancellation.shtml#cancel\']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@title=\"Rail Tour Packages\"]")).click();
			//Thread.sleep(3000);
			Set<String>handler=driver.getWindowHandles();
			 Iterator<String> it = handler.iterator();
			
			
	}

}
