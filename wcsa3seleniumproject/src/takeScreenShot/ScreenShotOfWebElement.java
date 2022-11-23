package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement

{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); //maximized webPage
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);

		//select xpath for webElement to take screenShot
		WebElement element = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));

		//using method screen shot store in src ref variable(src-source)
		File src = element.getScreenshotAs(OutputType.FILE); //return type file

		//right destination to store file
		File dest = new File("./ScreenShots/WebelementScreenShot.png");

		//using third party class store file source and destination
		Files.copy(src, dest); //throws IOException


	}
}
