package practise;

import java.util.Scanner;

public class RevesreStatment {

	public static void main(String[] args) {


	
		String s = "i love testing";
		
		s =s+" ";
		
		String reverse =" ",word =" ";
		
		
		for(int i =0;i<=s.length()-1;i++ ){
			
			char ch =s.charAt(i);
			
			if(ch!=' ') {
				
				word= word +ch;
				
			}else {
				
				
				reverse =word + "" + reverse;
				word = " "; 
			}
			
			
			
			
			
		}
		
		
		System.out.println(reverse);
		
	}


}


