package Demo;

public class Palindrome {

	
	public static void main(String[] args) {
		
		
		int r,sum=0,temp;
	    int n = 45467;
		
		
		temp=n;
		
		System.out.println("test");
		
		while(n>0) {
			
			r =n%10;
			
			sum = (sum*10) +r;
			n=n/10;
			
			
		}
		
		
		if(temp==sum) {
			
			System.out.println("Number is palindrome" + " "+ temp);
			
		}else {
			
			
			System.out.println("Number is not palindroen"+ " "+temp );
			
		}
	}
}
