package groups;

import org.testng.annotations.Test;

public class Group2 {
	
  @Test(groups = "sanity")
  public void Group2test1() {
	  
	  System.out.println("Group2 Testcase1 and in sanity group ");  
  }
  @Test(groups = "sanity")
  public void Group2test2() {
	  
	  System.out.println("Group2 Testcase2 and in sanity group ");
  }
  @Test(groups= "Smoke")
  public void Group2test3() {
	  System.out.println("Group2 Testcase3 and in Smoke group ");
  }
  @Test(groups="Regression")
  public void Group2test4() {
	  
	  System.out.println("Group2 Testcase4 and in Regression group ");
  }
  @Test(groups= "Smoke")
  public void Group2test5() {
	  System.out.println("Group2 Testcase5 and in Smoke group ");
  }
  
}
