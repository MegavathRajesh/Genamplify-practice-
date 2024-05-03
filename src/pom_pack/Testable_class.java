package pom_pack;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Testable_class {
	public static WebDriver driver;
  @Test(priority = 1)
  public void Nop_Login() throws InterruptedException {
	  Thread.sleep(2000);
	  Locatingclass.Nop_log_email(driver).clear();
	  Locatingclass.Nop_log_email(driver).sendKeys(inputdata.nop_email);
	  
	  Locatingclass.Nop_log_Password(driver).clear();
	  Locatingclass.Nop_log_Password(driver).sendKeys(inputdata.nop_password);
	  
	  Locatingclass.Nop_login(driver).click();
	  Thread.sleep(2000);
	
	    
  }
  @Test(priority = 2)
  public void customer_details() {
	  
	  Locatingclass.customers(driver).click();
	  Locatingclass.in_customer(driver).click();
	 
	  Locatingclass.Email(driver).sendKeys(inputdata.email);
	  Locatingclass.Firstname(driver).sendKeys(inputdata.firstname);
	  Locatingclass.lastname(driver).sendKeys(inputdata.lastname);
	  Locatingclass.month(driver).selectByVisibleText(inputdata.month);
	  Locatingclass.day(driver).selectByVisibleText(inputdata.day);
	  Locatingclass.register_from(driver).sendKeys(inputdata.registration_from);
	  Locatingclass.register_to(driver).sendKeys(inputdata.registration_to);
	  Locatingclass.activity_from(driver).sendKeys(inputdata.from_last_activity);
	  Locatingclass.activity_to(driver).sendKeys(inputdata.to_last_activity);
	  Locatingclass.company_name(driver).sendKeys(inputdata.company);
	  Locatingclass.ipaddres(driver).sendKeys(inputdata.ip_Addres);
	  
  }
  @BeforeClass
  public void Browser_open() {
	  
	  driver = new ChromeDriver();
	  driver.get(inputdata.url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
