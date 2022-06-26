package AdminVedPO;

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

	
	
	
	@FindBy(xpath="//h3[text()=\"Sign in with your ID\"]")
	WebElement Text;
	
	public String GetText() {
		
		
		return Text.getText();
	}
	
	


	
}
