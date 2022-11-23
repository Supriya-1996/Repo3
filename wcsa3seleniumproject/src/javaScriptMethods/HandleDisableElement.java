package javaScriptMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Html/Loginpage.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(3000);
		
		//create object for JavascriptExecutor(I)driver-using ref varibale
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
		//use executeScript() method of JavascriptExecutor(I)
		jse.executeAsyncScript("document.getElementById('i1').value='admin'");

	}
}
