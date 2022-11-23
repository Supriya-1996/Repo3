package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsFunction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		//Login OrangeHRM By using xpath Locator used name,placeholder and type attribute
		                      
		             //syntax- By.xpath(//tagname[contains(@attributename,'part of attribute value'])")
		
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'name')]")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		//executed
		

	}

}
