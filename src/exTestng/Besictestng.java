package exTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Besictestng {
	
  @Test
  public void hyd() {
	  
	  String name = "Hyderabad";
	   Assert.assertEquals("Hyderaba  "
	   		+ "' d", name);//comparing actual value to expected value
	  
  }
  @Test
public void mdr() {
	  
	  String name = "Madhapur";
	  Assert.assertEquals("Madhapur", name);
	  
  }
  @Test
  public void sec() {
  	  
  	  String name = "Secendrabad";
  	  Assert.assertEquals("Secendrabad", name);
    }
  
  
}
