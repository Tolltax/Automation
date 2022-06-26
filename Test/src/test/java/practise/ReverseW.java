package practise;

public class ReverseW {

	public static void main(String[] args) {


		
		String s = "This is sonu";
		s =s+"";
		
		
		String rever = " ",word = " ";
		//char ch;
		
		for(int i= 0;i<=s.length()-1;i++) {
			
			char ch =s.charAt(i);
			
		
		if(ch!=' ') {
			
			
			word =word+ch;
			
		}else {
			
			rever =word + "" +rever;
			word =" ";
			
		
		
		}
		
		
		
	}
		
		System.out.println(rever);	
		
		

	}

}
