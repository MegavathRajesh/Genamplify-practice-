package exTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Besictestng2 {
	
  @Test
  public void ram() {
	  
	  String name = "Ramagundam";
	  Assert.assertEquals("Ramagundam", name);//comparing actual value to expected value
	  
  }
  @Test
public void raj() {
	  
	  String name = "Rajamundry";
	  Assert.assertEquals("Rajamundry", name);
  }
  @Test
  public void vij() {
  	  
  	  String name = "Vijayawada";
  	  Assert.assertEquals("Vijayawada", name);
    }
  
  
}
