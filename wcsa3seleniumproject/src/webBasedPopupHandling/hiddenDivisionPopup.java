package webBasedPopupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDivisionPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Lauch the flipkart
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		//HiddenDivisionPopup-gin page generated-click on ' X'
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	//	Note:-calender,login page -its hiddenDivisionPopups
	}

}
