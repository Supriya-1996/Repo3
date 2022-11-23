package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelegramLogin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://telegr.am/user_mgt/login");
		
		//Telegram login by using Name and cssSelect Locators
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345678");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//Executed
		//driver.findElement(By.id("F103091653301P4QNK")).sendKeys("admin");
		//driver.findElement(By.value("password")).click();
		//driver.findElement(By.name("password")).sendKeys("12345");
				
	}

}
