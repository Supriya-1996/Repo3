package readPropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("./Data/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String keyvalue = prop.getProperty("username-OHRM");
		
		System.out.println(keyvalue);
		
		
	}

}
