package ProgramTest;

public class MaxNumbrArray {

	 static int SecodndMax;


	public static void main(String[] args) {



		int  [] a = {1,13,56,76,89,444};

		int max = a[0] ;
		//int ArrayLenght = Array.length;
//		System.out.println(ArrayLenght);
//		System.out.println(max);

		for(int i =1;i<=a.length-1;i++) {

           if(a[i]>=max) {
        	   
        	   
        	 max =a[i];
        	 int SecodndMax =a[2];
        	 
        	   
           }


		}
		 System.out.println("Max Number is " + max);
		 System.out.println( a[2]);
		


	}

}
