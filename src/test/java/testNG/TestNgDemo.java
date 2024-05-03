package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNgDemo 
{
	
	
  @Test(priority=1, description="This test case 1")
  public void chromeBrowserTest() 
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	  
	  
 }
  
  @Test(priority=2)
  public void firefoxBrowserTest() 
  {
	
	    WebDriver driver=new FirefoxDriver ();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	   
	  
	  
  }
  
  
  @Test(priority=3, invocationCount=3, enabled=false )
  public void edgeBrowserTest() 
  {
	
	    WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/?");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	  
	  
  }
  
  @BeforeMethod()
  
  public void bMethod()
  {
	  
	  System.out.println("Before method executes before each test case");
  }
  
@AfterMethod()
  
  public void aMethod()
  {
	  
	  System.out.println("After method executes after each test case");
  }

@BeforeClass()

public void bClass()
{
	  
	  System.out.println("Before class executes before first test case");
}

@AfterClass()

public void AaClass()
{
	  
	  System.out.println("After class executes after last test case");
}

@BeforeTest()

public void bTest()
{
	  
	  System.out.println("Before test executes before class");
}

@AfterTest()

public void aTest()
{
	  
	  System.out.println("After test executes after test");
}
  
@BeforeSuite()

public void bSuite()
{
	  
	  System.out.println("Before suite executes before test");
} 
  
@AfterSuite()

public void aSuite()
{
	  
	  System.out.println("After suite executes after test");
}  
  
  
  
  
  
  
}
