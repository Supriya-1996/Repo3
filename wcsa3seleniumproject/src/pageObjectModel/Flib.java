package pageObjectModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{  //Method to read the data from excel
    public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
    {
    	FileInputStream fis = new FileInputStream(excelpath);
    	Workbook wb = WorkbookFactory.create(fis);
    	Sheet sh = wb.getSheet(sheetName);
    	Row row = sh.getRow(rowCount);
    	Cell cell = row.getCell(cellCount);
    	String excelvalue = cell.getStringCellValue();
		return excelvalue;  	
    }
    //Method to write the data into excel
    public void writeExcelData(String excelpath,String sheetName,int rowCount,int cellCount,String Data) throws EncryptedDocumentException, IOException
    {
    	FileInputStream fis = new FileInputStream(excelpath);
    	Workbook wb = WorkbookFactory.create(fis);
    	Sheet sh = wb.getSheet(sheetName);
    	Row row = sh.getRow(rowCount);
    	Cell cell = row.createCell(cellCount);
    	cell.setCellValue(Data);
    	
    	FileOutputStream fos = new FileOutputStream(excelpath);
    	wb.write(fos);  		
    }
    //Method to get used row count from excel to use all the data 
    public int getRowCountFromExcel(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
    {
    	FileInputStream fis = new FileInputStream(excelpath);
    	Workbook wb = WorkbookFactory.create(fis);
    	Sheet sh = wb.getSheet(sheetName);
    	int rowcount = sh.getLastRowNum();
		return rowcount;
    }
    
  //Method To read tha data from property data -mandatory and valid data
    public String readPropertyData(String propFilePath,String key) throws IOException
    {
    	FileInputStream fis = new FileInputStream(propFilePath);
    	
    	Properties prop = new Properties();
    	prop.load(fis);//to load the file 
    	
    	String keyValue = prop.getProperty(key);//read key value from the file
		return keyValue;//return the value from file
    	
    }
    
}
