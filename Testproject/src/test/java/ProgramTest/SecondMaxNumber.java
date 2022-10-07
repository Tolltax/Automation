package ProgramTest;

public class SecondMaxNumber {

	static int i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int a [] = {89,3,5,6,7,12,43};
		
	    int max = a[0];
		
	    System.out.println("Original array is list is"); 
	    
		for(int i =0;i<=a.length-1;i++) {
			
			System.out.println(a[i]);
		
		}
		
		System.out.println("Sorted order of array is");
		
		//int a [] = {89,3,5,6,7,12,43};
		
		for(int i =0;i<a.length;i++) {
			
		
			
			for(int j =i+1;j<a.length;j++) {
				
				
				if(a[i]>a[j]) {
					
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
				
			}
			
			
		}
		
		for(int i =0;i<a.length;i++) {
			System.out.println(a[a.length-2]);
		}
		
		

	}

}
