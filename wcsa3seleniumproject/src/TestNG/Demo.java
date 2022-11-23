package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test // Its replace class main method 
  public void DemoMethod() {
	  //Reporter.log(arg1,true) method is replace system.out.println method
	  //in agrument pass print statement and pass true boolean value to see the result in console as well in report
	  Reporter.log(" demo method",true);
  }
  
  //Notes:
  //1) every method should start with @Test
  //2)Reporter.log("print statement",true) its mandtatory to see the result in console as well in report 
  //3)Method Execution is always start with alphanumerically base on method name
}
