package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleOperationalMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//scenario 1- check with singleSelect DropDown
		driver.get("file:///D:/Html/Dropdown.html");
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.id("menu"));
		//create object for select() method
		Select sel = new Select(element);

		// isMultiple() used to check dropdown is single selected or multiselected
		boolean checkDropDown = sel.isMultiple(); //return type is boolean
		//print the output in 'true' 'false' statement
		System.out.println(checkDropDown+"if dropdown is single selected:return false");

//scenario 2- check with multiSelect DropDown
		driver.navigate().to("file:///D:/Html/multipleSelectDropDown.html");
		Thread.sleep(3000);

		WebElement element1 = driver.findElement(By.id("menu"));
		//create object for select() method
		Select sel1 = new Select(element1);

		//to check dropdown is single selected or multiselected
		//used isMultiple() method its store in ref variable
		boolean checkDropDown2 = sel1.isMultiple(); //return type is boolean
		//print the output in 'true' 'false' statement
		System.out.println(checkDropDown2 +"if dropdown is multiselected:return true");




	}
}
