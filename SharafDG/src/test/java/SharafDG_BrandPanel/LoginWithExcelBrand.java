package SharafDG_BrandPanel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithExcelBrand {
	
	WebDriver driver;
	
	
	    @BeforeTest
	    public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
	}

	
	    @Test
	    public void TC1_LoginWithSheet() throws IOException {
	    	
	    	driver.get("http://brandsharafdguat.cstechns.com/");
	    	

	    	WebElement Login =driver.findElement(By.linkText("Brand Login"));
	    	Login.click();
	    	
	    	FileInputStream fs = new FileInputStream("C:\\Users\\cstechmk02\\Desktop\\Book1.xlsx");
	    	XSSFWorkbook wb = new XSSFWorkbook(fs);
	    	
	    	XSSFSheet sheet =wb.getSheet("Sheet1");
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	WebElement uid =driver.findElement(By.id("left_txtemail"));
	    	uid.sendKeys("test.apple1@apple.com");
	    	
	    	WebElement pwd =driver.findElement(By.id("left_txtpwd"));
	    	pwd.sendKeys("test.apple1@apple.com");
	    	

	    	WebElement btn =driver.findElement(By.id("signin_btnlogin"));
	    	btn.click();
	    	
	    	driver.close();
	    	
	    	
	    			
	    }
	
	    
	    
	
	    @AfterTest
	    public void Teardown() {
	    	
	    	System.out.println("Test pass");
	    }
	
}
