package member;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	

	WebDriver ldriver;
	
    public Login (WebDriver rdriver) {
	
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
    
    

	public void Buyer_login(String uid, String pwd) {
		
		UserName.sendKeys(uid);
		Password.sendKeys(pwd);
		Btn.click();

	}
	
	   
	   
	   
}
