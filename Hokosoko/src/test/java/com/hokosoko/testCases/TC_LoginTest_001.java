package com.hokosoko.testCases;



import org.testng.annotations.Test;

import com.hokosoko.pageobject.loginPAGE;

public class TC_LoginTest_001 extends BaseClass {
	
	
	
	@Test
	public void logintext()
	{
		
		driver.get(Baseurl);
		
		loginPAGE lp = new loginPAGE(driver);
		lp.setEnterMobileNO(MobileNo);
		lp.setGETOTP(MobileNo);
		lp.setENTEROTP("4582");
		lp.setVerify(Baseurl);
	}
	
	

}
