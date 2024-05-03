package pom_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Locatingclass {
	
	 public static WebElement Nop_log_email(WebDriver driver) {
		 return
				 driver.findElement(locaters.nop_email_xpath);
	 }
	 
	 public static WebElement Nop_log_Password(WebDriver driver) {
		 return
				 driver.findElement(locaters.nop_password_xpath);
		  
	 }
	 public static WebElement Nop_login(WebDriver driver) {
		 return
				 driver.findElement(locaters.nop_login_xpath);
		 
	 }
	 public static WebElement customers(WebDriver driver) {
		 return
				 driver.findElement(locaters.Customers_xpath);
		 
	 }
	 public static WebElement in_customer(WebDriver driver) {
		 return
				 driver.findElement(locaters.inside_customer_xpath);
		 
	 }
	 public static WebElement Email(WebDriver driver) {
		 return
				 driver.findElement(locaters.email_xpath);
	 }
	 public static WebElement Firstname(WebDriver driver) {
		 return 
				 driver.findElement(locaters.firstname_xpath);
	 }
	 public static WebElement lastname(WebDriver driver) {
		 return
				 driver.findElement(locaters.lastname_xpath);
				 
	 }
	 public static Select month(WebDriver driver) {
		 return new
		Select(driver.findElement(locaters.month_xpath));
	 }
	 
	 public static Select day (WebDriver driver) {
		 return new 
				 Select(driver.findElement(locaters.day_xpath));
		 
	 }
	 public static WebElement register_from (WebDriver driver) {
	 return
			 driver.findElement(locaters.from_registration_xpath);
	 
	 }	
	 public static WebElement register_to (WebDriver driver) {
		 return
				 driver.findElement(locaters.to_registration_xpath);
	 }
	 
	 public static WebElement activity_from(WebDriver driver) {
		 return
				 driver.findElement(locaters.from_activity_xpath);
	 }
	 public static WebElement activity_to(WebDriver driver) {
		 return
				 driver.findElement(locaters.to_activity_xpath);
		 
	 }
	 public static WebElement company_name(WebDriver driver) {
		 return
				 driver.findElement(locaters.Company_xpath);
	 }
	 public static WebElement ipaddres(WebDriver driver) {
		 return
				 driver.findElement(locaters.ip_address_xpath);
	 }
}
