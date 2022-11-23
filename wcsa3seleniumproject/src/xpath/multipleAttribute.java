package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Thread.sleep(3000);
		
		//1)using multiple attribute with 'OR' operator 
		//also used contains funtion for lengthy value
		
		driver.findElement(By.xpath("//a[contains(@class,'webdriver')or contains(@class,'ide')or contains(@class='grid')]")).click();
		//Thread.sleep(3000);
		driver.close();
		
		//2)using multiple attribute with 'AND' operator 
		//also used contains funtion for lengthy value
		
		//driver.findElement(By.xpath("//a[contains(@class,'webdriver')and contains(@class,'IDE')and contains(@class='grid')]")).click();
		//Thread.sleep(3000);
		
		
		
		//Note:-while using operator we can use diff types of xpath function 
		// like -@attributename=attributevalue ,contains(arg1,arg2), contains(text(),arg2), text()=attributevalue.
		
	}

}
