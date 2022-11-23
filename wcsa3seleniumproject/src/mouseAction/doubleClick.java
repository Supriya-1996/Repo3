package mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Login OrangeHRM with Xpath
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//click on 'Admin' link
		//driver.findElement(By.linkText("/web/index.php/admin/viewAdminModule")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		//click on 'Corporate Branding'
		driver.findElement(By.xpath("//a[@class)='oxd-topbar-body-nav-tab-link --more']")).click();
		Thread.sleep(3000);
		//click on 'Browser' to upload file
		WebElement target = driver.findElement(By.xpath("(//div[@class='oxd-file-button'])[1]"));
		Thread.sleep(3000);
		//create object for Action(broswerRefVariable) class
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		//use doubleClick() method for file upload operation single click it not work
		//Note:- perform() method mandetory to perfrom the doubleClick Action
		action.doubleClick(target).perform();

		//to upload file use AutoIt VB script writed file path

	}
}
