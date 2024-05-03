package loginpage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Log {

  @BeforeMethod
  public void bm() {
	  
	  System.out.println("haii this is beforeMethod");
  }

  @AfterMethod
  public void am() {
	  
	  System.out.println("haii this is afterMethod");
  }

  @BeforeClass
  public void bc() {
	  
	  System.out.println("haii this is beforeClass");
  }

  @AfterClass
  public void ac() {
	  
	  System.out.println("haii this is afterClass");
  }

  @BeforeTest
  public void bt() {
	  
	  System.out.println("haii this is beforeTest");
  }

  @AfterTest
  public void at() {
	  System.out.println("haii this is afterTest");
	    
  }
  
  @Test
  public void load() {
	  
	  System.out.println("Hai hallo this is @test");
	  
  }

  @BeforeSuite
  public void bs() {
	  
	  System.out.println("haii this is beforeSuite");
  }

  @AfterSuite
  public void as() {
	  
	  System.out.println("haii this is afterSuite");
  }

}
