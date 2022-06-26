package practise;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program1 {

	
	@BeforeSuite
	public void Setup() {
		
		System.out.println("@BeforeSuite");
	}
	
	
	@BeforeTest
	public void A() {
		
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
    public void B() {
		
		System.out.println("@BeforeClass");
	} 
	
	
	@BeforeMethod
     public void C() {
	
		System.out.println("@BeforeMethod");
    } 
	
	
	@BeforeGroups
    public void D() {
	
		System.out.println("@BeforeGroups");
   } 
	
	
	
}
