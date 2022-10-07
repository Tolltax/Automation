
public class MaxNumber {

	public static void main(String[] args) {


		int [] a= {1,4,6,34,89,90};


		int max = a[0] ;

		for(int i =1;i<a.length;i++) {

			if(a[i]>max) {

				max=a[i];
			}



		}

         System.out.println("max is "+max);
	}

}
