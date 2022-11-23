package methodsOfWebDriver;//Run successfully

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  //avoid illegal exception
		WebDriver driver=new ChromeDriver();  //upcasting to access only webdriver method
		driver.manage().window().maximize();  //method chaining-maximize chrome window by manage method
		
		driver.get("https://omayo.blogspot.com/");  //get method to lunch url
		driver.findElement(By.linkText("Open a popup window")).click();  //find linktext from page to perform click operation
		Thread.sleep(3000); //to hold window for 3sec
		driver.quit(); //close both parent and child window 
	}
}
