package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementOprationalMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/Html/Dropdown.html");
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.id("menu"));
		//create object for select() method
		Select sel = new Select(element);

// getWrappedElement() used to get the all options from dropdown
		WebElement wrappedElement = sel.getWrappedElement();
		//print the wrappedElemt
		System.out.println(wrappedElement);

	}
}