package groups;

import org.testng.annotations.Test;

public class Group1 {
	
  @Test(groups = "Regression")
  public void Group1test1() {
	  
	  System.out.println("Group1 Testcase1 and in Regression group ");    
  }
  @Test(groups = "sanity")
  public void Group1test2() {
	  
	  System.out.println("Group1 Testcase2 and in sanity group ");
  }
  @Test(groups= "Smoke")
  public void Group1test3() {
	  System.out.println("Group1 Testcase3 and in Smoke group ");
  }
  @Test(groups="Regression")
  public void Group1test4() {
	  
	  System.out.println("Group1 Testcase4 and in Regression group ");
  }
  
}
