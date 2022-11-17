package com.sharafdgMember.TestCase;

public class Test2 {

	
	
	 final int x=5;
	int y =10;
	
	public static void main(String[] args) {
		
		Test2 MyObj = new Test2();
		
		MyObj.x=20;
		Test2 Myobj2 = new Test2();
		
		System.out.println(MyObj.x);
		System.out.println(Myobj2.y);
		
	}

}
