package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				
		//xpath using text() function without any attribute name or value 
		//using click function on login page text 'forgot your password' 
		
		driver.findElement(By.xpath("//a[text()='Forgot password?]")).click();
		driver.navigate().back();
		
		//text() can replace with dot (.)
		driver.findElement(By.xpath("//a[.='Forgot password?']")).click();
		driver.navigate().back();
		
		
	
	}

}
