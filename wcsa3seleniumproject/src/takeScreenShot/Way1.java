package takeScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 
{
  public static void main(String[] args) throws InterruptedException, IOException
  {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver(); //no need to upcaste with WebDriver(I)
	driver.manage().window().maximize(); //maximized webPage
	driver.get("https://www.selenium.dev/");
	Thread.sleep(3000);
	
	//way1-getScreenShotAs() method
	
	//using method screen shot store in src ref variable(src-source)
	File src = driver.getScreenshotAs(OutputType.FILE); //return type file
	
	//right destination to store file
	File dest = new File("./ScreenShots/Way1ScreenShot.png");
	
	//using third party class store file source and destination
	Files.copy(src, dest); //throws IOException
	
	
	
	
  }
}
