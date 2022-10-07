package TestCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectPO.BaseClass;
import PageObjectPO.LoginPO;
import PageObjectPO.inventoryPO;
import Utility.TakeScreenShot;



public class Login extends BaseClass {

	@Test (priority=1)
	public void ValidLogin() throws IOException {

		
		LoginPO pp = new LoginPO(driver);
		pp.Login(pros.getProperty("UserName"), pros.getProperty("password"));
		inventoryPO in = new inventoryPO(driver);
		String ActualStg = in.getTextName();
		String Expected = pros.getProperty("Expected");
		Assert.assertEquals(ActualStg, Expected);
		System.out.println("Test Case Pass");
        driver.close();

	}

	@Test(priority=2,enabled=true)
	public void BlankLogin() throws IOException {
		
		LoginPO pp1 = new LoginPO(driver);
		pp1.Login("   ", "   ");
		System.out.println("Login Failed");
		TakeScreenShot.Screenshot1("BlankLogin");
		LoginPO in1 = new LoginPO(driver);
		String ActualStg =in1.GetError();
		String Expected = pros.getProperty("ExpectedError");
		Assert.assertEquals(ActualStg, Expected);
		

	}

	@Test (priority=3,enabled=false)
	public void InvalidPwdLogin() throws IOException {

		LoginPO pp = new LoginPO(driver);
		pp.Login("standard_user", "secret_sauce1");

	}
	@Test (priority=4,enabled=false)
	public void InValideUIDLogin() throws IOException {

		LoginPO pp = new LoginPO(driver);
		pp.Login("standard_user1", "secret_sauce");

	}

	@Test (priority =5,enabled=false)
	public void GettPlaceHolderLogin() {



	}

}




