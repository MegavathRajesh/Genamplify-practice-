package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class States2 {
  @Test
  public void MP() {
	  String name = "Madhya pradesh";
	  Assert.assertEquals(name, "Madhya pradesh");
  }
  @Test
  public void KL() {
	  String name = "Kerala";
	 // Assert.assertEquals(name, "Kerala");
	  Assert.assertEquals("Kerala", name);
  }
  @Test
  public void PB() {
	  String name = "Punjab";
	  Assert.assertEquals(name, "Punjab");
  }
  @Test
  public void WB() {
	  String name = "West Bengal";
	  Assert.assertEquals(name, "West Bengal");
  }
}
