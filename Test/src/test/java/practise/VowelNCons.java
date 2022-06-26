package practise;

public class VowelNCons {

	public static void main(String[] args) {


		String c ="This is Testing";
		
		//Vowels = iiei
		//cons =ThssTstng
		
		
		int vCount =0,cCount=0;
		
		for(int i =0;i<=c.length()-1;i++) {
			
//			char ch =c.charAt(i);
			
			
			if(c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='0'||c.charAt(i)=='u') {
				
				vCount++;
				
			}else if (c.charAt(i)>='a' && c.charAt(i)<='z') {
				
				cCount++;
				
			}
			
			
			
			
			
		}
		
		System.out.println(vCount);
		System.out.println(cCount);
		
	}

}
