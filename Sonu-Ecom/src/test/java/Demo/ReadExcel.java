package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ReadExcel {


	public void readExcel() throws IOException {


		String s = "C:\\Users\\cstechmk02\\eclipse-workspace\\Sonu-Ecom\\testdata\\Book1.xlsx";
		String filename = "testdata";
		String sheetname = "sheet1";

		File file = new File(s);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);  //get this workbook
		XSSFSheet sheet = wb.getSheetAt(0);

		int lastrow= sheet.getLastRowNum();
		System.out.println(lastrow);
	
		
		for(int i=0;i<=lastrow;i++) {
		
	  String sp =	sheet.getRow(i).getCell(i).getStringCellValue();
	  String sp2 =sheet.getRow(i).getCell(i).getStringCellValue();
	  
	  System.out.print(sp);
	  System.out.print("");
	  System.out.print(sp2);
		
		}

		

	}
	
	
	public static void main(String [] Args) throws IOException {
		
		ReadExcel obj = new ReadExcel();
		
		Date d = new Date((long) 10.0);
		
		d.
		obj.readExcel();
		
		
	}


}
