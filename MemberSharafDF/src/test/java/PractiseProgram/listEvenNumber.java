package PractiseProgram;

import java.util.Scanner;

public class listEvenNumber {
	
	public static void main(String[] Args)
			{
		
		          
		int i;
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter Number");
		      int value= sc.nextInt();
		      
		      System.out.println("Entered Number is " + value);
		      
		      
		      for(i =1; i==value;i++) {
		    	  
		      if(value%2==0) {
		    	  
		    	  System.out.println("Number is even" + i );
		    	  
		      }
		      
		      }
			}

}
