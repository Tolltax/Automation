package practise;

public class Parent {


       public void Addtion() {
    	   
    	  System.out.println("this is parent class");
    	   
    	   
       }

    public  class child extends Parent{
    	 
    	 
    	 public void Addtion() {
      	   
       	  System.out.println("this is parent class");
       	   
       	   
          }

    	 
    	 
     }

	public static void main(String[] args) {

		child c = new Parent();
		

	}

}
