package mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//right click on 'Learn More' option
		//store webElement in ref variable to perform action
		WebElement learnmore = driver.findElement(By.xpath("//a[text()='Learn More']"));
		
		//to perform right click need to create object for Action()class
		Actions act = new Actions(driver);
		
		//for right click operation use contextClick(ref variable of webelement) method 
		//Note:- perform() method mandetory to perfrom the mouseHover Action
		act.contextClick(learnmore).perform();
		
		
		
	}

}
