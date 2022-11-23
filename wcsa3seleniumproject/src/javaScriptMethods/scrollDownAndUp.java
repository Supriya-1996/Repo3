package javaScriptMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollDownAndUp
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(3000);

		//create object for JavascriptExecutor(I) 
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//use executeScript() method-to scrollDown using x and y 
		jse.executeScript("window.scrollBy(0,500)");

		//use executeScript() method-to scrollUp using x and y 
		jse.executeScript("window.scrollBy(0,-500)");
		
		
	}
}
