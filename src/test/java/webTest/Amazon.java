package webTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?");
	//JavascriptExecutor js= (JavascriptExecutor) driver;
	//js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
	//Thread.sleep(2000);
	 //js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 200)");

	}

}
