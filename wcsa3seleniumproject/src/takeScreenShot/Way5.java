package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way5
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);

		//way5-create object for TakeScreenShot(I)
		TakesScreenshot tss = (TakesScreenshot)driver;

		//using method screen shot store in src ref variable(src-source)
		File src = tss.getScreenshotAs(OutputType.FILE); //return type file

		//right destination to store file
		File dest = new File("./ScreenShots/Way5ScreenShot.png");

		//using third party class store file source and destination
		Files.copy(src, dest); //throws IOException


	}
}
