package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonUsingAXES {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/OnePlus-Smartphone-Unlocked-co-Developed-Hasselblad/dp/B07XM54RWB/?_encoding=UTF8&pd_rd_w=RaUfh&content-id=amzn1.sym.4b1f8d21-2805-4db8-a7e4-73e8e7436302&pf_rd_p=4b1f8d21-2805-4db8-a7e4-73e8e7436302&pf_rd_r=YZZ21TB5SCTRMR8ZP8XP&pd_rd_wg=GC9Gs&pd_rd_r=fd3846f6-ab69-43c8-9071-d4338e1f40b7&ref_=pd_gw_exports-popular-this-season-with-similar-asins");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("OnePlus 10 Pro | 5G Android Smartphone | 6.7” QHD+ Display | 12GB+256GB | U.S. Unlocked | Triple Camera co-Developed with Hasselblad | Volcanic Black",Keys.ENTER);
		//driver.switchTo().activeElement().sendKeys("OnePlus 10 Pro | 5G Android Smartphone | 6.7” QHD+ Display | 12GB+256GB | U.S. Unlocked | Triple Camera co-Developed with Hasselblad | Volcanic Black",Keys.ENTER);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']/ancestor::div[@class='centerColAlign centerColAlign-bbcxoverride']/descendant::span[@class='a-price-whole']")).click();
	
	}

}
