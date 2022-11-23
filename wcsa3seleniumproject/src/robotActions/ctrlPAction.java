package robotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ctrlPAction
{
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		
		//create object for Robot() class 
		 Robot robot = new Robot();
		 
		 //generate Print page popup by (ctrl+P)
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_P);
		 robot.keyRelease(KeyEvent.VK_P);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 
		 Thread.sleep(3000);
		 
		 //press 'Tab' button to switch control to 'cancel' button
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 Thread.sleep(3000);
		 
		 //hit the 'cancel' button
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
	}
}
