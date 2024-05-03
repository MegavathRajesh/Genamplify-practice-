package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class States {
  @Test (priority=1)
  public void TS() {
	  String name = "Telangana";
	  
	  Assert.assertEquals(name, "Telangana");   	  
  }
  @Test
  public void GJ()
  {
	  String name = "Gujarat";
	  Assert.assertEquals(name, "Gujarat");
	  
  }
  @Test
  public void AP() {
	  String name = "Andra pradesh";
	  Assert.assertEquals(name, "Andra pradesh");
  }
  @Test
  public void TN() {
	  String name = "Tamilnadu";
	  Assert.assertEquals(name, "Tamilnadu");
  }
}
