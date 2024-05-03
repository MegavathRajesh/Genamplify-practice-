package groups;

import org.testng.annotations.Test;

public class Group3 {
	
  @Test(groups = "Regression")
  public void Group3test1() {
	  
	  System.out.println("Group3 Testcase1 and in Regression group ");
	  
	  
  }
  @Test(groups = "Smoke")
  public void Group3test2() {
	  
	  System.out.println("Group3 Testcase2 and in Smoke group ");
  }
  @Test(groups= "Smoke")
  public void Group3test3() {
	  System.out.println("Group3 Testcase3 and in Smoke group ");
  }
  @Test(groups="sanity")
  public void Group3test4() {
	  
	  System.out.println("Group3 Testcase4 and in sanity group ");
  }
  @Test(groups="Regression")
  public void Group3test5 () {
	  
	  System.out.println("Group3 Testcase4 and in Regression group ");
  }
  
}
