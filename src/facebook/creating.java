package facebook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class creating {

	public static void main(String[] args) {
		 

			WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/login.php");
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hire");
				//driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//a[@class='_97w5']")).click();
				//driver.findElement(By.linkText("Create a new account")).click();
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("hello");
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("share @gmail.com");
				WebElement ele=driver.findElement(By.id("day"));
				Select sel=new Select(ele);
				sel.selectByValue("5");
			List<WebElement> list=sel.getOptions();
			System.out.println("the total days in the element "+list.size());
				for(WebElement st:list) {
				
					String text=st.getText();
					System.out.println(text);
				}
				WebElement ele1=driver.findElement(By.id("month"));	
				Select sel1=new Select(ele1); 
				sel1.selectByVisibleText("May");
				
				List<WebElement> list1=sel1.getOptions();
				int value=list1.size();
				System.out.println("the total months are: "+ value);
				for(int i=0; i<value; i++){
				String text1=list1.get(i).getText();
				System.out.println(text1);
				}
				
				WebElement ele2=driver.findElement(By.name("birthday_year"));
				Select sel2=new Select(ele2);
				sel2.selectByValue("1996");
				List<WebElement>list2=sel2.getOptions();
				int value1=list2.size();
				System.out.println("the total year "+value1);
				for(int i=0; i<value1; i++) {
				String text2= list2.get(i).getText();
				System.out.println(text2);
				}
				
				
					
				}
	}


