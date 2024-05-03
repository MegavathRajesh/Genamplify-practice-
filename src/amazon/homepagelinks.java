package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepagelinks {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 
		System.out.println("The total links in the page : "+driver.findElements(By.tagName("a")).size());
		 
		 // footer links 
		
		WebElement footerlink = driver.findElement(By.xpath("//div[@id='navFooter']"));
		System.out.println("The Footer in the page links"+footerlink.findElements(By.tagName("a")).size());

		System.out.println("The Page link Are "+footerlink.getText());
		 
	}

}
