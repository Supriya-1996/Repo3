package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationOfWebElement
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement news = driver.findElement(By.xpath("//h2[.='Getting Started']"));
		Point loc = news.getLocation();
		int xLocation = loc.getX();
		int yLocation = loc.getY();
		System.out.println("x"+xLocation+""+"y"+yLocation);
	}

}
