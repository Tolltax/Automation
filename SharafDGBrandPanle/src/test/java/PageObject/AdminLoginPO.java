package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPO {

	
	WebDriver ldriver;
	
	
	
	
	public AdminLoginPO(WebDriver rdriver) {
		
		ldriver = ldriver;
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	
	

	@FindBy(id="txtLogin")
	WebElement txtUid;
	
	
	@FindBy(how=How.ID,using="txtPassword")
	WebElement txtpwd;
	
	@FindBy(how=How.ID,using="btnSubmit")
	WebElement btn;
	
	
	//Sign i  text get
	
	@FindBy(xpath="//*[text()='Sign in with your ID']")
	WebElement SignTxt;
	
	
	public String SignText() {
	
		return SignTxt.getText();
		
		
	}
	

	//Error 
	
	@FindBy(how=How.ID,using="lblerrorMessage")
	WebElement ErrorLogin;
	
	public String GetErrorAdminLogin() {
		
		return ErrorLogin.getText();
		
		
		
	}
	
	
	public void SetUserName(String Username) {
		txtUid.sendKeys(Username);
		
	}
	
	public void SetPwd(String pwd) {
		txtpwd.sendKeys(pwd);
		
	}
	
	public void Click( ) {
		btn.click();
		
	}
	
	
	
}
