package mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select and drag webElement 
		WebElement drag = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));//source
		WebElement drop = driver.findElement(By.xpath("//ol[@id='bank']/li"));//destination
		
		//create object for action(ref variable) method
		Actions action = new Actions(driver);
		
		//perform selected drag element with dragAndDrop() method with ref variable of webelement
		//Note:- perform() method mandetory to perfrom the drag&drop Action
		action.dragAndDrop(drag, drop).perform();
		
	}
}
