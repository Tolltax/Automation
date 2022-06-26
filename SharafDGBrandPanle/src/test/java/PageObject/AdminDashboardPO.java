package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPO {

	
	WebDriver ldriver;
	
	
	
	
	public AdminDashboardPO(WebDriver rdriver) {
		
		ldriver = ldriver;
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	
	
	@FindBy(how=How.CLASS_NAME,using="page_title")
	WebElement Dashboard;
	

	public String GetDashboardText() {
		return Dashboard.getText();
		
	}
	
}
