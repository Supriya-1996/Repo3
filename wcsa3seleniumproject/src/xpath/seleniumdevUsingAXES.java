package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdevUsingAXES {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[text()='Java']/ancestor::div[@class='card h-100 bg-transparent border-0']/descendant::a[text()='API Docs']")).click();
		//Thread.sleep(3000);
	}

}
