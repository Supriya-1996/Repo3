package javaScriptMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebelementUsingIfElse 
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
		
		WebElement username = driver.findElement(By.id("i1"));
		WebElement password = driver.findElement(By.id("i2"));
		
		//if-else block for -username
		if(username.isEnabled())
		{
			username.sendKeys("admin");
			System.out.println("if block executed");
		}
		
		else
		{
			jse.executeAsyncScript("document.getElementById('i1').value='admin'");
			System.out.println("else block executed");
		}
		
		Thread.sleep(3000);
		
		//if-else block for -password
		if(password.isEnabled())
		{
			password.sendKeys("manager");
			System.out.println("if block executed");
		}
		
		else
		{
			jse.executeAsyncScript("document.getElementById('i2').value='manager'");
			System.out.println("else block executed");
		}

	}
}
