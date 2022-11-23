package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectionMethods 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("file:///D:/Html/multipleSelectDropDown.html");
	Thread.sleep(3000);
	
	WebElement selectMethod = driver.findElement(By.id("menu"));
	
	//create objet for select() method
	Select sel = new Select(selectMethod);
	Thread.sleep(3000);
	
	//Selection Methods:-
	//Method1:- selectByIndex(index: int);
	sel.selectByIndex(3);
	Thread.sleep(3000);
	
	//Method2:- selectByValue(value: string)
	sel.selectByValue("i4");
	Thread.sleep(3000);
	
	//Method3:- selectByVisibleText(Text: string)
	sel.selectByVisibleText("pizza");
	Thread.sleep(3000);
	
	System.out.println(sel);
	
	
	
	
	
	
}

}
