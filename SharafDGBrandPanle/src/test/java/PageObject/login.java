package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class login {

	
	WebDriver ldriver;
	
	//Constructor, as every page needs a Webdriver to find elements

	
	public login (WebDriver rdriver) {
		
		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);
		
	}

	
	@FindBy(how=How.ID,using="left_txtemail")
	WebElement username;
	
	@FindBy(how=How.ID,using="left_txtpwd")
	WebElement password ;
	
	
	@FindBy(how=How.ID,using="signin_btnlogin")
	WebElement submit_button;
	
	
	@FindBy(how=How.LINK_TEXT,using ="Login")
	WebElement LoginTxt;
	
	
	public String Getattribute() {
		
		return LoginTxt.getAttribute("innerHTML");
		
	}
	
	
	public void SetUserName(String Username) {
		username.sendKeys(Username);
		
	}
	
	public void SetPassword(String paasword) {
		password.sendKeys(paasword);
		
	}
	
	
	public void clickSubmit() {
		
		submit_button.click();
	}
	
	
	public void login_brand(String uid, String pwd) {
		
		username.sendKeys(uid);
		password.sendKeys(pwd);
		submit_button.click();
		
	}
	
}
