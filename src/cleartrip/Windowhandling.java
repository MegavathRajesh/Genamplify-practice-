package cleartrip;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(4000);

//		String mainwindow = driver.getWindowHandle();
//		Thread.sleep(4000);
//		driver.switchTo().window(mainwindow);
//		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@ga_category='TrainsHomepage'])[1]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentwindow = it.next();
		System.out.println("The Parent window ID is : "+parentwindow);
		
		String childwindow = it.next();
		System.out.println("The Child Window ID is : "+childwindow);
		
		String subchild = it.next();
		System.out.println("The Grand Child ID is : "+subchild);
		
		
		Thread.sleep(2000);
		 
		driver.switchTo().window(subchild);
	    System.out.println("The Sub Child Title is : "+driver.getTitle());
	    
	    Thread.sleep(2000);
	    driver.close();
	    
		driver.switchTo().window(childwindow);
		System.out.println("The Child Window Title is : "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	
		
		driver.switchTo().window(parentwindow);
		System.out.println("The Parent Window Title is : "+driver.getTitle());


	    Thread.sleep(2000);
	    driver.quit();
	}

}
