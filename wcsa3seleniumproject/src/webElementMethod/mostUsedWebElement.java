package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mostUsedWebElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Login OrangeHRM operation:-//
		
		//webElement Method-sendKeys() and clear()
		WebElement uername = driver.findElement(By.xpath("//input[placeholder='Username']"));
		uername.sendKeys("Admin");
		uername.clear(); //Note:-clear() method work with only ref variable not direct as like click()
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin1234");	
		
		//webElement method-click()
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//use getText() webElement
        driver.findElement(By.xpath("//h5[.='Employee Information']")).getText();
        
	}
}
