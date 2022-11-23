package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Way4 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);

		//Way4-using EventFiringWebDriver(ref vvariable) method
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		
		//using method screen shot store in src ref variable(src-source)
		File src = efwd.getScreenshotAs(OutputType.FILE); //return type file

		//right destination to store file
		File dest = new File("./ScreenShots/Way4ScreenShot.png");

		//using third party class store file source and destination
		Files.copy(src, dest); //throws IOException


	}

}
