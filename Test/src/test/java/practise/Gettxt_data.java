package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Gettxt_data {

	public static void main(String[] args) throws IOException  {


		//System.out.println("test");



       FileInputStream Fis = new FileInputStream("C:\\Users\\cstechmk02\\Desktop\\test.txt");

       int a= Fis.read(); // Test
         
       int i=0;    
       while((i=Fis.read())!=-1){    
        System.out.print((char)i);    
       }    
        	
           



	}


}
