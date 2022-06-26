package TestCases;

import org.testng.annotations.Test;

import PageObject.BaseClass;
import PageObject.SwagLabLoginPO;
import PageObject.inventotyPagePO;

public class dataDriveenPOI extends BaseClass
{

	
	@Test
	public void LoginDataDriven() throws InterruptedException {
		
		driver.get(BaseURL);
		SwagLabLoginPO SP = new SwagLabLoginPO(driver);
		SP.loginClick("standard_user", "secret_sauce");
		inventotyPagePO OP = new inventotyPagePO(driver);
		Thread.sleep(3000);
		OP.menuclick();
		OP.logout();
		System.out.println("PAASS");
	}
	
	
	
	
}
