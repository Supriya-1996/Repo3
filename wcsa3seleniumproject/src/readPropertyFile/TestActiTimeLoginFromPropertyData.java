package readPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeLoginFromPropertyData {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://127.0.0.1/login.do;jsessionid=e7kfi66klp6b1");
	 Flib flib = new Flib();
	 
	 String username = flib.readPropertyFile("./Data/config.properties", "username");
	 driver.findElement(By.name("username")).sendKeys(username);
	 
	 String password = flib.readPropertyFile("./Data/config.properties", "password");
	 driver.findElement(By.name("username")).sendKeys(password);
	 
	driver.findElement(By.id("loginButton")).click();
	
	}

}
