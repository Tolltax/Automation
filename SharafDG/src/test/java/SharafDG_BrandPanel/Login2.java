package SharafDG_BrandPanel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login2 {

	public static void main(String[] args) throws IOException {
		
		
		 FileInputStream fs = new FileInputStream("C:\\Users\\cstechmk02\\Desktop\\Book1.xlsx");
		 XSSFWorkbook wb= new XSSFWorkbook(fs);
		 XSSFSheet sheet = wb.getSheet("Sheet1");
		 Iterator<Row> rowIt = sheet.iterator();
		 
		 rowIt.next();
		 
		 ArrayList<String> list = new ArrayList <String>();
		 while(rowIt.hasNext()) {

			
			 System.out.println((rowIt.next().getCell(0).getStringCellValue()));

		}
		
		System.out.println(" ");
		

	}

}
