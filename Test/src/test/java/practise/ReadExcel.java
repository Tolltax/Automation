package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {


		File myFile = new File("C:\\Users\\cstechmk02\\Desktop\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet  = workbook.getSheetAt(0);

		XSSFRow row= sheet.getRow(1);


		XSSFCell cell =row.getCell(0);
		String usename = cell.getStringCellValue();
		System.out.println(" User name  ------------->" +usename);

		XSSFCell cell2 =row.getCell(1);
		int  password = (int) cell2.getNumericCellValue();
		System.out.println("Password   ------------->" +password);


		XSSFCell cell3 =row.getCell(2);
		int Mobile= (int) cell3.getNumericCellValue();
		System.out.println("Mobile   ------------->" +Mobile);


		

		XSSFCell cell4 =row.getCell(3);
		int  formula= (int)cell4.getNumericCellValue();
		System.out.println("formula   ------------->" +formula);



		//      //USING FOR LOOP
		//        
		//        int rows=   sheet.getLastRowNum();
		//    	int col = sheet.getRow(1).getLastCellNum();
		//    	
		//    	
		//    	for(int r= 0;r<=rows;r++)
		//    	{  
		//    		
		//    		
		//    		XSSFRow row =sheet.getRow(r);
		//    		
		//    		for(int c=0;c<=col;c++)
		//    		{
		//    			
		//    			XSSFCell cell =row.getCell(c);
		//    			
		//    			
		//    			switch(cell.getCellType())
		//    			
		//    			{
		//    			
		//    			  
		//    			case STRING  : System.out.println(cell.getStringCellValue());break;
		//    			case NUMERIC: System.out.println(cell.getNumericCellValue());break;
		//    			case BOOLEAN : System.out.println(cell.getBooleanCellValue());break;
		//    			
		//    			
		//    			}
		//    		System.out.println();	
		//    		}


		//}

	}

}
