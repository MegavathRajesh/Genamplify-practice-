package screenshots;

 import java.io.File;
import java.io.IOException;
import java.time.Duration;
 
import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;

public class swaglabs {

	public static void main(String[] args) throws IOException, InterruptedException {
 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		
	
	File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
	File F1 = new File("C:\\Users\\LENOVO\\OneDrive\\Pictures\\screens//"+"1.log"+".png");
	FileHandler.copy(screenshot, F1);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name=\"user-name\"]")).sendKeys("standard_user");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("secret_sauce");
	
	File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File F2 = new File("C:\\Users\\LENOVO\\OneDrive\\Pictures\\screens//"+"2.givencredential"+".png");
	FileHandler.copy(screenshot2, F2);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	
	File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File F3 = new File("C:\\Users\\LENOVO\\OneDrive\\Pictures\\screens//"+"3.Afterlogin"+".png");
	FileHandler.copy(screenshot3, F3);
	
	driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")).click();
	//here put option be like low to high price 
	Thread.sleep(1000);
	driver.findElement(By.xpath("//option[@value=\"lohi\"]")).click();
	//after put option be like low to high price select add to cart
	
	File screenshort4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File F4 = new File("C:\\\\Users\\\\LENOVO\\\\OneDrive\\\\Pictures\\\\screens//"+"4.selecting hightolow"+".png");
	FileHandler.copy(screenshort4, F4);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class=\"inventory_item_name \"])[1]")).click();
	
	File Screenshot5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File F5 = new File("C:\\\\Users\\\\LENOVO\\\\OneDrive\\\\Pictures\\\\screens//"+"5.Adding cart"+".png");
	FileHandler.copy(Screenshot5, F5);
	
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@name=\"add-to-cart-sauce-labs-onesie\"]")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@name=\"checkout\"]")).click();
	
	File screenshot6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File F6 = new File("C:\\\\Users\\\\LENOVO\\\\OneDrive\\\\Pictures\\\\screens//"+"6.Details"+".png");
	FileHandler.copy(screenshot6, F6);
	
	Thread.sleep(1000);
	
	
 
		 
	}

}
