package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingAXES {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//OrangeHRM Login page Lauched
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Thread.sleep(3000);

		//Login OrangeHRM 
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		//Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		//Thread.sleep(3000);

		driver.findElement(By.cssSelector("button[type='submit']")).click();

		//xpath using AXES-Descendant+ancestor
       //static webElement(source)+ancestor+common parent attribute+descendant+dynamicElement(destination)
		driver.findElement(By.xpath("//h5[text()='Employee Information']/ancestor::div[@class='oxd-table-filter']/descendant::input[@class='oxd-input oxd-input--active']")).sendKeys("454545");
	   //Thread.sleep(3000);

		//xpath using AXES-following-sibling

		//h6[text()='Add Employee']/ancestor::div[@class='orangehrm-card-container']/descendant::input[@name='firstName']
		//input[@class='oxd-input oxd-input--active orangehrm-middlename']


		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
