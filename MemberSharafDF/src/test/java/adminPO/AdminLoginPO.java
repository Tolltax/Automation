package adminPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageobject.BaseClass;

public class AdminLoginPO {

	WebDriver ldriver;

	public AdminLoginPO(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}


	@FindBy(id="txtLogin")
	WebElement txtUid;


	@FindBy(how=How.ID,using="txtPassword")
	WebElement txtpwd;

	@FindBy(how=How.ID,using="btnSubmit")
	WebElement btn;


	//Sign i  text get
	//	
	//	@FindBy(xpath="//*[text()='Sign in with your ID']")
	//	WebElement SignTxt;
	//	
	//	
	//	public String SignText() {
	//	
	//		return SignTxt.getText();
	//		
	//	}
	//	
	//
	//	@FindBy(how=How.ID,using="lblerrorMessage")
	//	WebElement ErrorLogin;
	//	
	//	public String GetErrorAdminLogin() {
	//		
	//		return ErrorLogin.getText();
	//		
	//	}
	//	

	public void SetUserName(String AdminUsername) {
		txtUid.sendKeys(AdminUsername);

	}

	public void SetPwd(String Adminpwd) {
		txtpwd.sendKeys(Adminpwd);

	}

	public void Click( ) {
		btn.click();

	}


	//Login Methode
	public void AdminLogin(String AdminUsername, String Adminpwd ) {
		SetUserName(AdminUsername);
		SetPwd(Adminpwd);
		Click();

	}





}
