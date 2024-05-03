package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class States3 {
  @Test
  public void JK() {
	  String name = "Jammu kashmir";
	  Assert.assertEquals(name, "Jammu kashmir");
  }
  @Test
  public void MH() {
	  String name = "Maharastra";
	  Assert.assertEquals(name, "Maharastra");
  }
  @Test
  public void RJ() {
	  String name = "Rajastan";
	  Assert.assertEquals(name, "Rajastan");
  }
  @Test
  public void UP() {
	  String name = "Utter Pradesh";
	  Assert.assertEquals(name, "Utter Pradesh");
  }
  @Test
  public void HP() {
	  String name = "Himachal pradesh";
	  Assert.assertEquals(name, "Himachal pradesh");
  }
}
