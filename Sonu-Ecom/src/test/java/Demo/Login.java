package Demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Login {


	WebDriver driver;

	@BeforeTest
	public void Setup(){

		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		driver=new ChromeDriver();
		//		driver = new FirefoxDriver();
		//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	
	
	@Test
	public void Valid_Login() {

    driver.get("https://siteadmin.dgbusiness.com/");
    //Verify loginpage
    
    String  s = "Sign in with your ID";
    String s1 =driver.findElement(By.xpath("//*[text()=\"Sign in with your ID\"]")).getText();
    
    
    System.out.println(s1);
    
    if(s1.equals(s)) {
    	
    	System.out.println("Login page open");
    	System.out.println("Sign in with your ID Text Visible");
    	
    	
    }else {
    	
    	
    	System.out.println("login page not opened");
    }
    
   System.out.println(s1.equals(s));
    
    
    driver.findElement(By.id("txtLogin")).sendKeys("as.pillai@sharafdg.com");
    driver.findElement(By.id("txtPassword")).sendKeys("Secure@1008");
    driver.findElement(By.id("btnSubmit")).click();
    
    
    
    
    
    // 

	}


	@AfterTest
	public void Teardown() {

		//driver.quit();

	}





}
