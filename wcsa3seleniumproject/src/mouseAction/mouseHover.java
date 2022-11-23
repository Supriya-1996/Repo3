package mouseAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("confirmBtn")).click();

		//create object for robot class 
		Robot robot = new Robot();

		//using 'Tab' control switched to another button-'x' button
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);


		//select webElement for  mouseHover Action
		WebElement target = driver.findElement(By.xpath("//a[contains(@title,'Watch Je')]"));

		//create object for Action(broswerRefVariable) class
		Actions action = new Actions(driver);

		//mouseHover action perform with moveToElement(webElement Ref Variable) method
		//Note:- perform() method mandetory to perfrom the mouseHover Action
		action.moveToElement(target).perform();
		Thread.sleep(3000);

		//select webElement which is under the main webElement
		driver.findElement(By.xpath("//a[text()='Band']")).click();


	}
}

