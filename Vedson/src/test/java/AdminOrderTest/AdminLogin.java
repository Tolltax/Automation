package AdminOrderTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vedsonmemberPageObject.BaseClass;

import AdminVedPO.AdminLoginPO;

public class AdminLogin extends BaseClass {

	String actualUrl = "VIEW MORE CHARTS";
			
	@Test
	public void AdminLoginValide() {
		
		
		
		
		driver.get(BaseUrladmin);
		Reporter.log("Browser is lauched");
		AdminLoginPO OP = new AdminLoginPO(driver);
		OP.SetUserName(AdminUsername);
		Reporter.log("User NAME fILLED");
		OP.SetPwd(Adminpwd);
		Reporter.log("id NAME fILLED");
		OP.Click();
		Reporter.log("Login button clicked");
		
		String axpected = driver.findElement(By.id("Viewmorecharts")).getText();
		
		Assert.assertEquals(actualUrl,axpected );
		Reporter.log("Admin Login Successful ");
	
	}
	
	@Test(enabled =false)
	public void AdminLoginInvalide() {
		
		driver.get(BaseURL);
		System.out.println("Fail");
		
		
		
	}
	
	
	
	
	
}
