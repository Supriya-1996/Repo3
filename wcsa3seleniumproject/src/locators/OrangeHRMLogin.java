package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//Login OrangeHRM By using cssSelector Locator used name,placeholder and type attribute
		                      
		             //syntax- cssSelector("tagname[attribute_name='attribute_value']")
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		

	}

}
