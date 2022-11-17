package practise;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConvertFToC {

	
	public static void main (String [] Args) {
		
	

      int x =25,y=23;
      
      
      x=x+y; // 48
      y=x-y; // 48-23 = 25
      x =x-y;	//48-25 ==23
    
    System.out.println(x);
    System.out.println(y);
		
	}
	
	
	
	
}
//
//  String file ="thisbsi"
//  File fs = new File(file)
// 
//  FilterInputStream fis = new FilterInputStream(fs);
// 
//  XSSFWorkbook workbook = new XSSFWorkbook(fis);
// 
//  XSSFSheet sheet =workbook.getSheetAt(1);
//  
  