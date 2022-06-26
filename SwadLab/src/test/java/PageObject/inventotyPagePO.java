package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class inventotyPagePO {

	public WebDriver driver;


	@FindBy(id="react-burger-menu-btn")

	WebElement MenuIcon;



	
	@FindBy(id="logout_sidebar_link")
	WebElement Logoutbtn;


	public  inventotyPagePO(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	
	
	public  void  menuclick() {

		MenuIcon.click();

	}

	

	   public  void logout() {
		   
		   
		   Logoutbtn.click();
	   }
		
}
