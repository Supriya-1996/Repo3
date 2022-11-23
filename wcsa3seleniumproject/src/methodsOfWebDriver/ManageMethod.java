package methodsOfWebDriver;//Run successfully

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //avoid illegal exception
		WebDriver driver=new ChromeDriver(); //upcasting to access only webdriver method
		driver.manage().window().maximize();//method chaining-maximize chrome window by manage method
		
	}

}
