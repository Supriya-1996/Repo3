package methodsOfWebDriver;//Run successfully

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //avoid illegal exception
		WebDriver driver=new ChromeDriver(); //upcasting to access only webdriver method
		driver.manage().window().maximize();//method chaining-maximize chrome window by manage method
		driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("happy dasera",Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
	}

}
