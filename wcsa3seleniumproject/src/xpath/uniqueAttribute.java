package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//xpath using unique attribute from webpage

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("supdhanu");
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("ad12345678");
		
		//xpath using contains text() function for log in button
		driver.findElement(By.xpath("//div[contains(text(),'Log In')]")).click();
		
		//xpath using text() function for forgot password text from webpage
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		
		//back function
		driver.navigate().back();
		
		//login with facebook
		//xpath using cssSelector shortcut (*-for any attribute value)
		driver.findElement(By.cssSelector("span[class*='KPnG0']")).click(); 
		driver.close();
		
		//Note:-Serach if password not correct use else 

	}

}
