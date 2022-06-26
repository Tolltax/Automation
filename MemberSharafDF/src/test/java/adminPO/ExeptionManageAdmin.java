package adminPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ExeptionManageAdmin {


	WebDriver ldriver;

	String CartRemoveEmil = "sonu@cstech.in";


	public ExeptionManageAdmin(WebDriver rdriver) {

		ldriver = ldriver;
		PageFactory.initElements(rdriver, this);

	}


	@FindBy(how=How.ID,using="//*[@id='ddlusertype']")
	WebElement DropDownType;

	
	public void RemoveSpecificCart() {

		Select drpCartType = new Select(DropDownType);
		drpCartType.selectByVisibleText("Specific");
		

	}


	@FindBy(how=How.ID,using="txtemail")
	WebElement SpecificEmail;

	public void Specificmail(String CartRemoveEmil) {

		SpecificEmail.sendKeys(CartRemoveEmil);


	}
	
	
	@FindBy(how=How.XPATH,using="//input[@type='button' and @value='Remove From Cart']")
	WebElement BTNADDclick;

	public void btnclclickCART() {

		BTNADDclick.click();

	}
	
	
	public void RemoveCart(String CartRemoveEmil) {

		RemoveSpecificCart();
		Specificmail(CartRemoveEmil);
		btnclclickCART();
		
	}
	
	
	

}
