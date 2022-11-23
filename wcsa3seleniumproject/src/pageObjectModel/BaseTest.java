package pageObjectModel;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Class is implements with interface to access all path
public class BaseTest implements IAutoConstant
{
	//upcasting remoteWebDriver(class) to WebDriver(I)
	//To access all WebDriver Methods which helps to launch and close the any browser as well url
	static WebDriver driver; 
	
	//method to launch the browser and url
	public void setUp() throws IOException
	{
		//create the object for Flib class 
		// call the readPropertyData() method which has store browser and url 
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData(Prop_Path, "browser");
		String url = flib.readPropertyData(Prop_Path, "url");

		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(Chrome_key, Chrome_Value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);			
		}
		else if(browservalue.equalsIgnoreCase("firefor"))
		{
			System.setProperty(Firefox_key, Firefox_Value);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		
		else
		{
			System.out.println("Invalid browser name");
		}
	}
	
	//method to close the browser and url
	public void tearDown() 
	{
		driver.quit();
		//quit() use to close parent and child window both
		
	}
	
}
