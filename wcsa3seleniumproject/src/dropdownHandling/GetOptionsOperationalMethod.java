package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsOperationalMethod
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/Html/Dropdown.html");
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.id("menu"));
		//create object for select() method
		Select sel = new Select(element);
		
		// getOptions() used to both single & multiple dropdown to get all options from dropdown		
		List<WebElement> allOps = sel.getOptions();
		
		for(WebElement ops:allOps)
		{
			String dropDownOps = ops.getText();
			System.out.println(dropDownOps);
			Thread.sleep(3000);
			
			//if want to list only within particular option use if() loop
			if(ops.getText().equals("pizza"))
			 {
				ops.click();
				break;
			}
		}


	}

}
