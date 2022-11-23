package syncronization;//Run Sucessfully

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitlyWaitInFireFoxBroswer
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=e7kfi66klp6b1");

		//DynamicWait-ImplicitlyWait (for all FE and FEs)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		//get the title of login page with getTile() method
		String loginpage = driver.getTitle();

		//Login page test using if-else
		if(loginpage.equals("actiTIME - Login"))
		{
			System.out.println("Loginpage test pass");
		}
		else
		{
			System.out.println("Loginpage test fail");
		}

		//Login to actiTime
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
        
		//Thread.sleep(3000);//use for getTitle() method 
		
		//get the title of Home page with getTile() method
		String homepage = driver.getTitle();

		//Home page test using if-else
		if(homepage.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Homepage test pass");
		}
		else
		{
			System.out.println("Homepage test fail");
		}

	
	}

}
