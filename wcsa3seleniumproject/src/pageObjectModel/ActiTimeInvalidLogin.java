package pageObjectModel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//create object of all class to call the inside methods
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		int rowcount = flib.getRowCountFromExcel(Excel_Path, "invaliddata");
		//getRowCountFromExcel() method return the row count we store in 'rowcount' ref variable 
		
		LoginPage lp = new LoginPage(driver);
		//we store all webelement in PageFactory class 
		//also call the invalidLoginMethod
		
		//use for loop execute all data
		for(int i=1; i<=rowcount ;i++)
		{
			String username = flib.readExcelData(Excel_Path, "invaliddata", i, 0); //i=row & 0=column
			String password = flib.readExcelData(Excel_Path, "invaliddata", i, 1); //i=row & 0=column
			
			lp.invalidLoginMethod(username, password);
		}
		
		bt.tearDown();
		
	}

}
