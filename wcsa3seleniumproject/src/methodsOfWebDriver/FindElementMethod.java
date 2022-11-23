package methodsOfWebDriver;//Run successfully


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);

		//Close X
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);

		//Search webElement functionality
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("hp laptop");
		Thread.sleep(4000);

		//store value in ref varibale
		WebElement link = driver.findElement(By.xpath("//div[@class='_3OO5Xc']"));
		Thread.sleep(3000);
		System.out.println(link);
		link.click();

         //get address of webElement

	}

}
