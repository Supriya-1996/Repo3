package xpath;

//31-line nosuchelementexception
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartUsingAXES {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Lauch the flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//Close X
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		
		//Search webElement functionality
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("hp laptop");
		Thread.sleep(4000);
		
		//Click on serach button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		//xpath 
		driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).click();
		
		//System.out.println(priceOfSmartTv+ ": 1st Suggested Smart TV price");
		Thread.sleep(3000);
		
		//Add to cart 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
		
		//Save for later
		driver.findElement(By.xpath("//div[text()='Save for later']")).click();
		Thread.sleep(3000);
		
		//Remove
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		
		//confirm remove popup
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
		
		//back to page
		driver.navigate().back();
		Thread.sleep(3000);
		
		//back to all suggestion/product display page
		
		
		//Homepage
		
		

		
		
		
	}

}
