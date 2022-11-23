package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMInvalidLogin
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	
	Flib flib = new Flib();
	int rowcount = flib.getRowCountMethod("./Data/testdata.xlsx", "invaliddata");
	
	//use for loop to cover all invalid scenario from excel data
	for(int i=1;i<=rowcount;i++)
	{
		//invalid username from excel 
		String invalidusername = flib.readExcelData("./Data/testdata.xlsx", "invaliddata", i, 0);
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		
		//invalid password from excel
		String invalidpassword = flib.readExcelData("./Data/testdata.xlsx", "invaliddata", i, 1);
		driver.findElement(By.name("password")).sendKeys(invalidpassword);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
						
	}
	
	}

}
