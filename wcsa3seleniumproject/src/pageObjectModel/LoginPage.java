package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration all the webElement which is present on login webpage
	//declare element as private and access them with getter method
	@FindBy(name="username") private WebElement username;
	@FindBy(name="pwd") private WebElement password;
	@FindBy(id="loginButton") private WebElement loginbutton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keeplogincheckbox;
	@FindBy(xpath="/a[contains(text(),'License)") private WebElement licenselink;


	//Intialization
	//generate constructor
	//In webDriver interface has PageFactory class there is initElements() method its used to give the instruction to @FindBy() to reach the every new address of webelement
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}

	//Utilization
	//for private declaration we used getter() method
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getKeeplogincheckbox() {
		return keeplogincheckbox;
	}
	public WebElement getLicenselink() {
		return licenselink;
	}

	//validlogin operation by creating method
	public void validLoginMethod(String validusername,String validpassword ) throws InterruptedException
	{
		username.sendKeys(validusername);
		password.sendKeys(validpassword);
		Thread.sleep(3000);
		loginbutton.click();
		Thread.sleep(3000);
	}

	//invalidlogin operation by creating method
	public void invalidLoginMethod(String invalidusername,String invalidpassword ) throws InterruptedException
	{
		username.sendKeys(invalidusername);
		password.sendKeys(invalidpassword);
		Thread.sleep(2000);
		loginbutton.click();
		Thread.sleep(3000);
		username.clear(); //only for ActiTime application
	}
	
	//Note:-To write the method for logout operation find where is logout link prsent on which webpage
	//In ActiTime -logout link is present to home page 
}
