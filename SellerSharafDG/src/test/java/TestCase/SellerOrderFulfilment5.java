package TestCase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import PageObject.BaseClassSeller1;
import PageObject.SellerDashboardPO3;
import PageObject.SellerHomePO4;

public class SellerOrderFulfilment5 extends BaseClassSeller1 {

	
	
	
	@Test
	public void TC_001() throws InterruptedException {
		
		driver.get(SellerURL);
		
		SellerHomePO4 sl = new SellerHomePO4(driver);
		
	     sl.ClickSingIN();
	     sl.SellerLogin(SellerEmail, Sellerpwd);
	     
	   //  Thread.sleep(3000);
	     
	     SellerDashboardPO3 SD = new SellerDashboardPO3(driver);
	     SD.ClickOrders();
	     
	     
	}

	
	
	
	
	
	
	
	
	
}
