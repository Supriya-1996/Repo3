package methodsOfWebDriver;//Not Run

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
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
		List<WebElement> laptop = driver.findElements(By.xpath("//div[@class='_3OO5Xc']"));
		Thread.sleep(2000);

		//for each loop
		for(WebElement lap:laptop)
		{
			String hplaptop = lap.getText();
			System.out.println(hplaptop);
		}
		
		
	
		
		//for loop to get list

		//for(int i=0;i<=mobile.size(); i++)
		//{
		//	WebElement iphone = mobile.get(i);
			//String iphonelist =iphone.getText();
			//System.out.println(iphonelist);

		//}

	}


}
