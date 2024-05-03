package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
//ChromeOptions opt=new ChromeOptions();
//opt.addArguments("--disable-notification");
WebDriver driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
//Thread.sleep(3000);
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("windows.scrollTo(0,document.body.scrollHeight)");
//driver.findElement(By.xpath("//font[text()='Create a new account']")).click();
  driver.findElement(By.id("email")).sendKeys("tester1@gmail.com");
  Thread.sleep(2000);
 driver.findElement(By.id("pass")).sendKeys("Token@123");
 Thread.sleep(2000);
 driver.findElement(By.name("login")).click();




	}

}
