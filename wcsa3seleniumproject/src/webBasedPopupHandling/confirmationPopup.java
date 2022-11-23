package webBasedPopupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationPopup
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Html/confirmBox.html");
		Thread.sleep(3000);

		//to generate the alert popup need to click on 'Try it' button
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(3000);

		//control switched to alert popup (saved in ref variable)
		Alert al = driver.switchTo().alert(); //alert() return type alert class

		//to get the text of popup use getText() store in ref variable to print
		String textofpopup = al.getText(); //getText() return type is sting

		//print the text of popup
		System.out.println(textofpopup);

		//hit the 'Ok' button by using accept()
		al.accept(); 
		
		//hit the 'cancel' button by using dismiss()
		//al.dismiss();
		

	}

}
