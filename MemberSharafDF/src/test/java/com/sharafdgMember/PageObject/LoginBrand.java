package com.sharafdgMember.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginBrand {

	
	
     	WebDriver ldriver;
	
        public LoginBrand (WebDriver rdriver) {
		
		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);
		
       	}
	
        
        @FindBy(how=How.ID,using="left_txtemail")
        WebElement UserName;
        
        
        @FindBy(how=How.ID,using="left_txtpwd")
        WebElement Password;
        
        
        @FindBy(how=How.ID,using="signin_btnlogin")
        WebElement Btn;
        
        
        @FindBy(how=How.ID, using ="signin_btnlogin")
        WebElement Log;
        
        
        public String LoginText() {
        	
        	return Log.getText();
        }
        
        
        public void SetUserName(String Username) {
        	UserName.sendKeys(Username);
        	
        }
        
        
        public void SetPassword(String paasword) {
        	Password.sendKeys(paasword);
        	
        }
        
        
        public void clickSubmit() {
        	
        	Btn.click();
        }
        
        

    	public void login_brand(String uid, String pwd) {
    		
    		UserName.sendKeys(uid);
    		Password.sendKeys(pwd);
    		Btn.click();

    	}


        
}
