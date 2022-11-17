package UtilitiesHelpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.google.common.collect.Table.Cell;

public class ExcelData {

	
	WebDriver driver;
	
	
	public void ReadExcel() throws IOException {
		
		
		//Path of the excel file
		
		FileInputStream fs = new FileInputStream("C:\\Users\\cstechmk02\\Desktop\\login.xlsx");
		
		//Creating a workbook
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
		Row row = sheet.getRow(0);
		
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
		
		
	}
	
}
