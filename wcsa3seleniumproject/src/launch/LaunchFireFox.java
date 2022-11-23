package launch;


import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//to avoid IIlegalstateexception
		FirefoxDriver driver = new FirefoxDriver();//launches  browser
		Thread.sleep(4000);//to open for 4 sec
		driver.close();//to close browser
		
	}
	

}
