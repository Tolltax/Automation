package practise;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		

	
		/*
		 * 

		 *  4 = 4x3x2x1
		 *  
		 *  fact =1;
		 *  
		 *  for(int i =1;i<=no;i++){
		 *  
		 *  
		 *  }
		 */
		int i,fact =1;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		 int InputNumber = sc.nextInt();
		 System.out.println("Entered Number is" + " "+ InputNumber);
		 
		for (i =1;i<=InputNumber;i++) {
			
			
			fact =fact*i;
		}
		 
			System.out.println("fact is " +fact);
		}
		
	}


