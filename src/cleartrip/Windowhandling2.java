package cleartrip;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling2 {

	public static void main(String[] args) throws InterruptedException {
 
	 
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
			driver.get("https://www.cleartrip.com/trains");
			
			driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/faq/account/tour/trains_cancellation.shtml#cancel']")).click();
			
			driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/offers/india/irctc-packages']")).click();
			
			Set<String>handler=	driver.getWindowHandles();
			Iterator<String>it=handler.iterator();
			
			String mainwindow=it.next();
			Thread.sleep(2000);
			System.out.println("The main window is: "+mainwindow);
			String subwindow1=it.next();
			System.out.println("The subwindow1 is: "+subwindow1);
			String subwindow2=it.next();
			System.out.println("The subwindow2 is: "+subwindow2);
			
			Thread.sleep(2000);
			driver.switchTo().window(subwindow2);
			System.out.println("The subwindow2 is " +driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			
			Thread.sleep(2000);
			driver.switchTo().window(subwindow1);
			System.out.println("The subwindow1 is "+driver.getTitle());
			driver.close();
			
			Thread.sleep(4000);
			driver.switchTo().window(mainwindow);
			System.out.println("The mainwindow is "+driver.getTitle());
			driver.quit();

	}

}
