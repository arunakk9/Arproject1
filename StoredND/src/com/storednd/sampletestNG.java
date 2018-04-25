package in.Hubot;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class sampletestNG
{
	
	@AfterTest
	  public void afterTest() 
	  {
		  System.out.println("aTest");
	  }

	
	@BeforeTest
	  public void beforeTest() 
	  {
		System.out.println("bTest");
	  }
	
	@BeforeClass
	  public void beforeClass() 
	  {
		System.out.println("bClass");
	  }
	
	@BeforeMethod
	  public void beforeMethod() 
	  {
		System.out.println("bMethod");
	  }
	
  @Test(priority =0)
  public void b() 
  {
	  System.out.println("Test1");
  }
  
  @Test(priority =1,enabled=false)
  public void a()
  {
	  System.out.println("Test2");
  }
  
  
  @Test(priority =2)
  public void c() 
  {
	  System.out.println("Test3");
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("aMethod");
  }

  

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("aClass");
  }

  

  
  

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("asuite");
  }
  
  @BeforeSuite
	 public void beforeSuite() 
	 {
		System.out.println("bsuite");
	 }


}
