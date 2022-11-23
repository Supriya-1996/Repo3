package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//create object of all class to call the inside methods
		BaseTest bt = new BaseTest();
		bt.setUp();//to launch the browser as well url

		Flib flib = new Flib();
		String username = flib.readPropertyData(Prop_Path, "username");
		String password = flib.readPropertyData(Prop_Path, "password");

		LoginPage lp = new LoginPage(driver); //constuctor call from class to give the instruction about webElement locator
		lp.validLoginMethod(username, password);	
		Thread.sleep(3000);
		
		//click on logout link
		HomePage hp = new HomePage(driver);
		hp.pageLogoutMethod();
		
		bt.tearDown();//close method call from basetest class

		
//Note 1:-BaseTest class is implements with IAutoConstant Interface where we stored path of property data file 
//Note 2:-Actual script class always extends with BaseTest class which implements with IAutoConstant Interface
		
		//Execution steps:- line 10 & 11
		//1-compiler find basetest class with setup method
		//2-in setup method compiler get the Flib class with readPropertyData method 		
		//3-from the method get propertydata (prop_path,key) which is passed in basetest class
		//4-using if else looping statement complier check property data file for key and value and execute the if loop 
		//5-in if loop -broswer is chrome and url is for ActiTime 

		//Execution steps:- line 13,14 &15
		//complier check for the Flib class
		//we call readPropertyData() method from Flib class
		//complier check method which paramterised with (prop_path,key)
		//we given path and key complier take value from property data file 
		//which we stored in ref variable for String username &String password 
		//And passed in 18 line
		
		//Execution steps:- line 17 & 18
		//compiler go to LoginPage Class
		//call the validLoginMethod() method where we passed the stored data of username and passowrd
		//pass the value and execute the method



	}

}
