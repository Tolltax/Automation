package practise;

public class PriceNumber {

	public static void main(String[] args) {
		


		int Num = 10; int temp =0;

		// 2,3,4,5,6,7,8,9(n , n-1)


		for(int i =2;i<Num-1;i++) {

			if(Num%i==0) {

				temp =temp+1;
			}

		}
		if(temp>0) {

			System.out.println("number is prime");

		}else {

			System.out.println("Number is not prime");
		}




	}

}
