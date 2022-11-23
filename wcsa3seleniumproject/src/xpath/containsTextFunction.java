package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsTextFunction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://telegr.am/user_mgt/login");
		
		//to click on on text value and also text value is lengthy
		//contains with text() funtion
		//syntax- //tagname[contains(text(),'part of text value')]
		
		driver.findElement(By.xpath("//")).click(); //pending for any text value from telegram page
		

	}

}
