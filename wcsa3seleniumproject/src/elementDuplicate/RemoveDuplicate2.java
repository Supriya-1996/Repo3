package elementDuplicate;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicate2 
{
	public static void main(String[] args) {
		//Remove duplicates opetion from multiselecte dropdown with maintaining any order

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///D:/Html/multipleSelectDropDown.html");
		WebElement element = driver.findElement(By.id("menu")); //to select dropdown from webpage

		//create object for select class to use inside getoptions() method
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions(); //return type is in list of element

		//use-create object of hashset<set format>() to remove duplicates from dropdown
		//HashSet<String> set = new HashSet<String>();
		
		//create object of LinkedHashSet<set format>() to remove duplicates from dropdown with order maintained 
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<options.size();i++)
		{
			WebElement allops = options.get(i);
			String txt = allops.getText();
			set.add(txt);
		}

		//to print all options from dropdown:-for each loop
		for(String st:set)
		{
			System.out.println(st);
		}

	}

}
