package locators;//Run sucessfully

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=e7kfi66klp6b1");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Manager");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		
		
	}
}
