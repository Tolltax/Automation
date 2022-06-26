package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class dashboard {

	
	
	WebDriver ldriver;
	
	//Constructor, as every page needs a Webdriver to find elements

	
	public dashboard (WebDriver rdriver) {
		
		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);
		
	}

	
	
	@FindBy(how=How.ID,using="block-title-black")
	WebElement Dashboard;

	
	public void  GetDashboardValue() {
		
	//	return String Txt1= Dashboard.getText();
		
		
		
	}
	
}
