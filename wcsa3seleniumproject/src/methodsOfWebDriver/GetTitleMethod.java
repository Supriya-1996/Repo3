package methodsOfWebDriver;//Run successfully

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //avoid illegal exception
		WebDriver driver=new ChromeDriver(); //upcasting to access only webdriver method
		driver.manage().window().maximize();//maximize chrome window by manage method
		driver.get("https://www.flipkart.com");//get method to lunch url
		Thread.sleep(3000);//to hold window for 3sec
		
		String titleOfTheFirstPage=driver.getTitle();
		System.out.println(titleOfTheFirstPage);

	}

}
