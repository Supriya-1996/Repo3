package pageObjectModel;

//Its interface use to store all commom path of file
public interface IAutoConstant 
{
	//System.setProperty(Key,value) of browser chrome	
	String Chrome_key="webdriver.chrome.driver";
	String Chrome_Value="./drivers/chromedriver.exe";

	//System.setProperty(Key,value) of browser firefox	
	String Firefox_key="webdriver.gecko.driver";
	String Firefox_Value="./drivers/.geckodriver.exe";   

	//Excel path-test case scenario
	String Excel_Path ="./Data/testdata.xlsx";

	//PropertyFile Path-ActiTime -store valid data mandatory and frequantly used
	String Prop_Path="./Data/config.properties";

	//PropertyFile Path-ActiTime -store valid data mandatory and frequantly used
	String OHRM_Prop_Path="./Data/config.properties";



}
