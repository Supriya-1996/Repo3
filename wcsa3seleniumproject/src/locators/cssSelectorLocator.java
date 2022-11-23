package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mdbootstrap.com/docs/standard/extended/login/");
		Thread.sleep(3000);
		
		//Login Bootstrap By using cssSelector Locator shortcut key ( ^ ,$ ,* )
		                      
		//syntax- cssSelector("tagname[attribute_name='attribute_value']")
		
		//driver.findElement(By.cssSelector("//a[@class='auth-modal-toggle btn btn-primary ms-2 me-1'and text()='Login']")).click();
		
		driver.findElement(By.cssSelector("input[id^='user']")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[class*='btn-block']")).click();
	
		//Not Executed
	}


}
