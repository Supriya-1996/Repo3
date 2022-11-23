package readPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Flib
{
public String readPropertyFile(String propPath, String key ) throws IOException
{
	//to read the data from file
	FileInputStream fis = new FileInputStream(propPath);
	
	//property class create object to use inside method its java class
	Properties prop = new Properties();
	//load() method -load property file
	prop.load(fis);
	
	//get value/data from property file
	String value = prop.getProperty(key);
	
	//return statement to get value 
	return value;
	
	
	
}
}
