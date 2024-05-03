package datawrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jQurey {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/demos/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Droppable")).click();
		Actions action = new Actions(driver);
		
	WebElement A =	driver.findElement(By.id("draggable"));
	WebElement B =	driver.findElement(By.id("droppable"));
	
	action.dragAndDrop(A, B);

	}

}
