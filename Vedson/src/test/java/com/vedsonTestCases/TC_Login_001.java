package com.vedsonTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vedsonmemberPageObject.BaseClass;
import com.vedsonmemberPageObject.LoginPageMemberPO;

public class TC_Login_001 extends BaseClass {

	
	@Test
	public void ValideloginTest()
	
	{
		driver.get(BaseURl);
		LoginPageMemberPO lp = new LoginPageMemberPO(driver);
		lp.setUseName(Uname);
		lp.setPassword(pwd);
		lp.ClickSubmit();
		
		
	
	}
	
	
	
	
	
}
