package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPO   {

	public WebDriver driver;
	
	

	@FindBy(id="user-name")
	WebElement Usertext;


	@FindBy(xpath="//*[@id='password']")
	WebElement passtext;

	@FindBy(id="login-button")
	WebElement loginbtn;


	
	@FindBy(xpath="//H4[text()='Accepted usernames are:']")
	WebElement TextNAME;
	
	
	public  SwagLabLoginPO(WebDriver driver) {


		this.driver = driver;
		PageFactory.initElements(driver,this);



	}

	
	
	public void textaatribute() {
		
		
	 String color =	TextNAME.getCssValue("color");
	 System.out.println(color);
		
	}
	

	public void loginClick(String Username,String pwd) {
		Usertext.sendKeys(Username);
		passtext.sendKeys(pwd);
		loginbtn.click();
		

	}


	public void SetUserName(String Username) {
		Usertext.sendKeys(Username);

	}



	public void SetPassword(String pwd) {

		passtext.sendKeys(pwd);
	}


}
