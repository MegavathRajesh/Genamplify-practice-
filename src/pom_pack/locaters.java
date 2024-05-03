package pom_pack;

import org.openqa.selenium.By;

public class locaters {
	
	public static By nop_email_xpath = By.xpath("//input[@name='Email']");
	public static By nop_password_xpath = By.xpath("//input[@name='Password']");
	public static By nop_login_xpath = By.xpath("//button[text()='Log in']");
	
	public static By Customers_xpath = By.xpath("(//i[@class='right fas fa-angle-left '])[4]");
	public static By inside_customer_xpath = By.xpath("(//li[@class='nav-item'])[21]");
	
	public static By email_xpath= By.xpath("//input[@name='SearchEmail']");
	public static By firstname_xpath = By.xpath("//input[@id='SearchFirstName']");
	public static By lastname_xpath = By.xpath("//input[@id='SearchLastName']");
	public static By month_xpath = By.xpath("//select[@id='SearchMonthOfBirth']");
	public static By day_xpath = By.xpath("//select[@id='SearchDayOfBirth']");
	public static By from_registration_xpath = By.xpath("//input[@id='SearchRegistrationDateFrom']");
	public static By to_registration_xpath = By.xpath("//input[@id='SearchRegistrationDateTo']");
    public static By from_activity_xpath = By.xpath("//input[@id='SearchLastActivityFrom']");
    public static By to_activity_xpath = By.xpath("//input[@id='SearchLastActivityTo']");
    public static By Company_xpath = By.xpath("//input[@id='SearchCompany']");
    public static By ip_address_xpath = By.xpath("//input[@id='SearchIpAddress']");
    
	
	

}
