package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //avoid illegal exception
		WebDriver driver=new ChromeDriver(); //upcasting to access only webdriver method
		driver.manage().window().maximize();//maximize chrome window by manage method
		driver.get("https://www.google.com");//get method to lunch url
		
		driver.findElement(By.name("q")).sendKeys("Joey Tribbiani",Keys.ENTER);
		Thread.sleep(3000);//to hold window for 3sec
		driver.findElement(By.className("lNPNe")).click();
		//Executed
	}
}
