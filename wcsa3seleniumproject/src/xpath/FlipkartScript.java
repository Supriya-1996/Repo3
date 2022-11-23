package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScript {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Lauch the flipkart
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Thread.sleep(3000);
		
		//Close X
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//Search webElement functionality
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("hp laptop");
				
		//Click on serach button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//No need to write for processor filter because its already in open condition
		//driver.findElement(By.xpath("//div[text()='Processor']")).click();
		
		//select core i5-click on checkbox
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();

		//Need to click on brand to open contain opetion--click on filter-Brand
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		
		//select HP-click on checkbox
		driver.findElement(By.xpath("//div[text()='HP']")).click();
			
		//click on filter-Operating System
		driver.findElement(By.xpath("//div[contains(text(),'Operating ')]")).click();
	
		//select Windows-10-click on checkbox
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
				
		//select and print 1st suggested value
		String priceOfSuggestedLaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println(priceOfSuggestedLaptop+ "1st Suggested laptop value");
		
	}

}
