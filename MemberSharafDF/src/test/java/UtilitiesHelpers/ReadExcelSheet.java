package UtilitiesHelpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ReadExcelSheet {

	static WebDriver driver;
	
	public String  read() throws IOException {
	
	try
	
	{
		
		File file = new File("C:\\Users\\cstechmk02\\Desktop\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet =wb.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
	    XSSFCell cell=	row.getCell(0);
	    
	    String User_Name = cell.getStringCellValue();
	    
	    
		
		
	}
	
	catch (FileNotFoundException fe){
	    fe.printStackTrace();
	}
	return null;
	
	
	
	
	
	
}
	
}


