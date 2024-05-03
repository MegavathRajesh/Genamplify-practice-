package facebook;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_new_Account {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement Create_new_account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Create_new_account.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement FirstName = driver.findElement(By.xpath("(//input[@name='firstname'])"));
		WebElement LastName = driver.findElement(By.xpath("(//input[@name='lastname'])"));
		WebElement MobileNumber = driver.findElement(By.xpath("(//input[@name='reg_email__'])"));
		WebElement reMobileNumber = driver.findElement(By.xpath("(//input[@name='reg_email_confirmation__'])"));
		WebElement NewPassword = driver.findElement(By.xpath("(//input[@name='reg_passwd__'])"));
		
		FirstName.sendKeys("Rajesh");
		LastName.sendKeys("Megavth");
		MobileNumber.sendKeys("rajesh@genamplifysol.com");
		reMobileNumber.sendKeys("rajesh@genamplifysol.com");
		NewPassword.sendKeys("Rajesh@123");
		
		WebElement date = driver.findElement(By.xpath("(//select[@name='birthday_day'])"));
		Select drop = new Select(date);
		drop.selectByValue("19");
		
	   WebElement month = driver.findElement(By.xpath("(//select[@name='birthday_month'])"));
	   Select drop1 = new Select(month);
	   drop1.selectByVisibleText("Jul");
	   
	   List<WebElement> sheets = drop1.getOptions();
	   int value = sheets.size();	   
	   System.out.println("The Total months are : "+value);
	   
	 //  System.out.println("the visible months are : "+sheets.get(6));
	   
	   for(int i=0; i<value; i++) {
		   
		   String data = sheets.get(i).getText();
		   System.out.println("The Month is : "+data);
	   }  
		   WebElement year = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
		   Select drop3 = new Select(year);
		   drop3.selectByValue("1998");
		   
		   List<WebElement> yearvalue = drop3.getOptions();
		   int asyear = yearvalue.size();
		   
		   System.out.println("The Total Year  In The Elements : "+asyear);
		   
//		   for(int j=0; j<=asyear; j++) {
//			   
//			   String foryear = yearvalue.get(j).getText();
//			   System.out.println("Total Year in the Element : "+foryear);
//		   }
		   
		   WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		   gender.click();
		   
		   WebElement signup = driver.findElement(By.xpath("(//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v'])"));
		   signup.click();
		   
		   
	   
	   }
		
		
		
		
	}


