package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellerDashboardPO3 {

	
	
	
	WebDriver ldriver;
	
	
	public SellerDashboardPO3(WebDriver rdriver) {
		
		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(xpath="//*[text()=\" Manage \"]")
	WebElement txtmanage;
	
	
	public String Managetext () {
		String ManageT = txtmanage.getText();
		return ManageT;
		
	}
	
	
	
	@FindBy(linkText="Total Orders")
	WebElement TotalOrders;
	
	
	public void ClickOrders () {
		TotalOrders.click();
	
		
	}
	

	
}
