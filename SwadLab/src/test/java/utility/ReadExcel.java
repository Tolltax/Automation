package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	
	public void ReadingExce() throws IOException{
		
		String s = "C:\\Users\\cstechmk02\\Desktop\\WAP\\File\\Book1.xlsx";
		
		File fs = new File(s);
		
		FileInputStream fis  = new FileInputStream(fs);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet Sheet= workbook.getSheetAt(0);
		Iterator<Row>rowIterate =Sheet.rowIterator();
		
		
	}
	
	
}
