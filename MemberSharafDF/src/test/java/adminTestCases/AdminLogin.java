package adminTestCases;
import org.testng.annotations.Test;

import adminPO.AdminLoginPO;
import pageobject.BaseClass;



public class AdminLogin extends BaseClass {

	@Test
	public void AdminValideLogin() {

		
		  driver.get(BaseUrladmin);
		  
		  AdminLoginPO AL = new AdminLoginPO(driver);
		  AL.AdminLogin(AdminUsername, Adminpwd);
		
		}	
	}
