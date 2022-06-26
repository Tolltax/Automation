package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginSeller {

	WebDriver ldriver;
	
    public LoginSeller (WebDriver rdriver) {
	
	ldriver=ldriver;
	PageFactory.initElements(rdriver, this);
	
   	}
	

    
	
}
