package sportalook;

public class Car {

    
	 String Color = "Red";
	 int Price = 400000;
	 String Module = "XUV";
	 
	void  Speed(){
		 
		 System.out.println("Car is Speeding");
		 
	 }
	 
	
	void Running () {
		
		System.out.println("Car us Running");
		
	}
	 
	 
	public static void main(String args[]) {
		
		Car c = new Car();
		
		c.Speed();
		c.Running ();
		
		
	}
	
	
	
}


