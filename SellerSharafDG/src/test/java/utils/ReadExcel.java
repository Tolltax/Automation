package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {


	@Test
	public void ReadExcel() throws IOException {


		String FileName = "C:\\Users\\cstechmk02\\Desktop\\SellerRegistration.xlsx";
		
		FileInputStream fs = new FileInputStream(FileName);
		XSSFWorkbook wb= new XSSFWorkbook(fs);


		XSSFSheet sheet = wb.getSheetAt(0);

		int RowsNo = sheet.getLastRowNum();

//		for(int i =0;i<=RowsNo;i++)
//
//
//		{

			
			Cell cell =sheet.getRow(2).getCell(2);
			String sellerName =cell.getStringCellValue();
			System.out.println(sellerName);
			

//		}


		




	}










}
