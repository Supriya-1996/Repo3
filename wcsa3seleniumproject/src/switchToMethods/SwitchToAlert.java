package switchToMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//use for only findelement() method
		driver.get("file:///D:/Html/AlertBox.html");
		Thread.sleep(3000);

		//to generate the alert popup need to click on 'Try it' button
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(3000);

		//control switched to alert popup (saved in ref variable)
		Alert al = driver.switchTo().alert(); //alert() return type alert class

		//hit the 'Ok' button by using accept()
		al.accept(); //al.dismiss()-also used to press 'Ok' button

		//Note:-generate exception once alert is alredy handled
		// NoAlertPresentException
		//al.dismiss();

	}
}
