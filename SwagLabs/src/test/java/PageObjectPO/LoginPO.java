package PageObjectPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {

	WebDriver driver;
	
	public LoginPO(WebDriver driver){
		
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(id="user-name")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="login-button")
	WebElement loginbtnl;
	
	
	public void Login(String uid,String pawd) {
		
		UserName.sendKeys(uid);
		pwd.sendKeys(pawd);
		loginbtnl.click();
		
	}
	
	
	@FindBy(xpath="//h3[@data-test='error']")
	WebElement Error;
	
	public String GetError() {
		
		String Eror =Error.getText();
		return Eror;
	}

	
	
}
