package webBasedPopupHandling;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableTheNotificationPopup 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//create object for chromeOptions() class
		ChromeOptions co = new ChromeOptions();
		//pass the argument-disable notification
		co.addArguments("--disable-notifications");
		//we can maximize the browser by passing argument
		co.addArguments("-start-maximized");
		
		//pass the referance variable
		WebDriver driver=new ChromeDriver(co);

		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);

		//click on 'Allow' Buttom to genarete the notification popup
		driver.findElement(By.xpath("//span[.='Allow']")).click();

	}
}
