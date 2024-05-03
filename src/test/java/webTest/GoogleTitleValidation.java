package webTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.co.in/");
	    String actitle = driver.getTitle();
	    System.out.println("Actual title is:"+actitle);
	    if(actitle.equals("gOogle"))
	    {
	    	System.out.println("Actual title matched with expected title");
	    }
	    else
	    {
	    	System.out.println("Actual title not matched with expected title");
	    }
	 
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
