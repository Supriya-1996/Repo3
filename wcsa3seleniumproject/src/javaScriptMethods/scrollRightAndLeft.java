package javaScriptMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollRightAndLeft
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(3000);

		//create object for JavascriptExecutor(I) 
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//use executeScript() method-to scrollRight using x and y 
		jse.executeScript("window.scrollBy(5000,0)");

		//use executeScript() method-to scrollLeft using x and y 
		jse.executeScript("window.scrollBy(-5000,0)");


	}

}
