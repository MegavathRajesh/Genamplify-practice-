package fbproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class profacebook {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
	 
		Properties pro = new  Properties();
		
		FileInputStream fi = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Genamplify\\src\\fbproperties\\rajesh.properties");
		pro.load(fi);
		
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("disignation"));
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String url = pro.getProperty("URL");
		System.out.println("The Given URL is : "+url);
		driver.get(url);
		
	 	driver.findElement(By.xpath(pro.getProperty("usernamexpath"))).sendKeys(pro.getProperty("username"));
        driver.findElement(By.xpath(pro.getProperty("passwordxpath"))).sendKeys(pro.getProperty("password"));	
  //   driver.findElement(By.xpath(pro.getProperty("loginxpath"))).click();
     
	 driver.findElement(By.xpath(pro.getProperty("Creatnewaccount"))).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(pro.getProperty("firstnamecss"))).sendKeys(pro.getProperty("firstname"));
	 driver.findElement(By.cssSelector(pro.getProperty("lastnamecss"))).sendKeys(pro.getProperty("lastname"));
	 driver.findElement(By.cssSelector(pro.getProperty("numbercss"))).sendKeys(pro.getProperty("number"));
	 driver.findElement(By.xpath(pro.getProperty("newpasswordxpath"))).sendKeys(pro.getProperty("password1"));
	 
	// WebElement dd = driver.findElement(By.xpath(url))
	 Select dselect = new Select(driver.findElement(By.xpath(pro.getProperty("date"))));
	 dselect.selectByValue("2");
	 
	 List<WebElement> totaldays = dselect.getOptions();
	 System.out.println("Total days are : "+totaldays.size());
	 
	 for(WebElement Dtotal:totaldays) {
		 
		 String daystotal = Dtotal.getText();
		 System.out.println("The  Day is"+daystotal);
	 }
	 
	 Select mselect = new Select(driver.findElement(By.xpath(pro.getProperty("month"))));
	 mselect.selectByVisibleText("Jul");
	 
	 List<WebElement> totalmonth = mselect.getOptions();
	 System.out.println("The Total Months are : "+totalmonth.size());
	 
	 for(WebElement tmonths:totalmonth) {
		 
		 String monthtotal = tmonths.getText();
		 System.out.println("The  Month is"+monthtotal);
	 }
	 
	 Select yselect = new  Select(driver.findElement(By.xpath(pro.getProperty("year"))));
	 yselect.selectByVisibleText("1998");
     
	 List<WebElement> totalyear = yselect.getOptions();
	 System.out.println("The Total Year are "+totalyear.size());
	 
	 for(WebElement tyear:totalyear) {
		 String yearstotal = tyear.getText();
		 System.out.println("The Year was : "+yearstotal);
	 }
	 
	 driver.findElement(By.xpath(pro.getProperty("gender"))).click();

	 driver.findElement(By.xpath(pro.getProperty("signup"))).click();
	}

}
