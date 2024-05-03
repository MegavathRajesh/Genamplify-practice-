package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mobiles {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
 		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		 driver.get("https://www.amazon.in/");
		 
		WebElement tyy = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));//click on mobile
		tyy.click();
		
		WebElement accessories = driver.findElement(By.xpath("(//a[@aria-haspopup='true'])[1]"));
		
		Actions action = new Actions(driver);//action
		
		action.moveToElement(accessories).perform();
		
		WebElement samsung = driver.findElement(By.linkText("Samsung"));
		samsung.click();
		
		List<WebElement> mobileslinks = driver.findElements(By.xpath("//div[@class='_octopus-search-result-card_style_apbSearchResultItem__2-mx4']"));
		
		int totallinks = mobileslinks.size();
		System.out.println("The Total links on the page is : "+totallinks);
		
		for(WebElement tlinks:mobileslinks) {
			
			String link = tlinks.getText();
			System.out.println("In The page link is :"+link );

			 
		}

		 
	}

}
