package practise;

public class TextPalindrome {

	public static void main(String[] args) {

		
		String input = "tet",Reverse ="", Reve="";
		
		
		for(int i =input.length()-1;i>=0;i--) {
			
			
			 Reve = Reverse + input.charAt(i);
	
		}

		System.out.println(Reve);
		if(input.equals(Reve)) {
			
		System.out.println("String is palindrome");
			
			
		}else {
			
			System.out.println("String is not palindrome");
			
		}
		
	}

}
