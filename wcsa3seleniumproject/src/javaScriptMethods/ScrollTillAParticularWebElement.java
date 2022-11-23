package javaScriptMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillAParticularWebElement
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(3000);

		//select a particular webelement to till scrolling store in ref variable
		WebElement particularwebelement = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));

		//by using ref variable get location of webElemt using getLocation() method
		Point loc = particularwebelement.getLocation(); //getLoction()-return type is point

		//store X and Y value
		int xAxis = loc.getX();
		int yAxis = loc.getY();

		//to reach that webElement
		//create object for JavascriptExecutor(I)driver- ref variable for interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeAsyncScript("window.scrollBy("+xAxis+","+(yAxis-300)+")");
		
	}
}
