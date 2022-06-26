package TestCase;
import org.testng.annotations.Test;
import PageObject.AdminBaseClass;
import PageObject.AdminDashboardPO;
import PageObject.AdminLoginPO;

import org.openqa.selenium.By;
import org.testng.Assert;


public class AdminLoginDeleted extends AdminBaseClass {

	@Test
	public void Login_With_Valide_User_Password() {

		
		
		
		AdminLoginPO ac = new AdminLoginPO(driver);
		System.out.println("Admin Login page url Opened" +" "+driver.getCurrentUrl());
		ac.SetUserName(Username);
		System.out.println("UserNmae filled"+" "+Username);
		ac.SetPwd(pwd);
		System.out.println("Password filled"+" "+pwd);
		ac.Click();
		System.out.println("Submit Button Clicked");

		AdminDashboardPO ap = new AdminDashboardPO(driver);

		String AdminText =ap.GetDashboardText();
		String Expected = "Dashboard";


		if(AdminText.equalsIgnoreCase(Expected)) {

			System.out.println("Admin Dashboard opned Login pass");

		}else {

			System.out.println("Admin Dashboard Not opned Login  Failed");

		}
		
	//	driver.findElement(By.xpath("//*[text()='Logout']")).click();
		
		

	}
		@Test
		public void Valide_User_Invalide_Password() {



			AdminLoginPO ac = new AdminLoginPO(driver);
			System.out.println("Admin Login page url Opened" +" "+driver.getCurrentUrl());
			ac.SetUserName(Username);
			System.out.println("UserNmae filled"+" "+Username);
			ac.SetPwd(inalidepwd);
			System.out.println("Password filled"+" "+inalidepwd);
			ac.Click();

			System.out.println("Submit Button Clicked");

			AdminDashboardPO ap = new AdminDashboardPO(driver);

			String error = ac.GetErrorAdminLogin();

			String Expected = "Invalid Email ID / Password";

			if(error.equalsIgnoreCase(Expected)) {

				System.out.println("Admin Dashboard opned Login pass");

			}else {

				System.out.println("Admin Dashboard Not opned Login  Failed");

			}


		}	
	}
