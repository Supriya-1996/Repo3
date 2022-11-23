package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//way3-Upcasting from broswerSpecificClass(ChromeDriver) to RemoteWebDriver(Class)
		RemoteWebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize(); 
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);

		//using method screen shot store in src ref variable(src-source)
		File src = driver.getScreenshotAs(OutputType.FILE); //return type file

		//right destination to store file
		File dest = new File("./ScreenShots/Way3ScreenShot.png");

		//using third party class store file source and destination
		Files.copy(src, dest); //throws IOException


	}

}
