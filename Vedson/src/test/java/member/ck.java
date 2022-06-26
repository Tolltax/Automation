package member;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vedsonmemberPageObject.BaseClass;

public class ck extends BaseClass {

	
	//WebDriver driver;
	
        @Test	
    	public void Lv() throws InterruptedException, IOException {
    		
        	
        	SingleProductCheckout gj = new SingleProductCheckout();
        	
    	
        	
        	
        	driver.get("http://vedson.cstechns.com/Paymentgateway/Razorpay/Payment.aspx?orderid=YjQ7YexXo7c=&amt=5wt197eCmdk=&fname=kbHC5q7VfgI=&lname=Uh8efFe58TM=&add=X9RF71jw5/o=&email=tegT+9rQrMqS6xAreI2bQA==&city=TdPeaof2CH6JdjQ97+bDcQ==&state=Jsdz2Vn9BzVmDVc7gRGphQ==&country=BkvU7Sln0jA=&zip=JLgs1ebhX2s=&mob=ZpmwK59Gm5VEwDXX5PjrDg==&ordertype=9i1y0Vkb5xg=");	
    	    
        	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']")));
    	    
//    	    JavascriptExecutor jh = (JavascriptExecutor)driver;
//    		jh.executeScript("window.scrollBy(0, 320)");
    		
    		driver.findElement(By.xpath("//*[@id=\"form-common\"]/div[1]/div/div/div[2]/div/div/button[4]")).click();
    		
    		
    		driver.findElement(By.xpath("//*[@id=\"wallet-radio-mobikwik\"]/span[1]")).click();
    		JavascriptExecutor jh = (JavascriptExecutor)driver;
   		jh.executeScript("window.scrollBy(0, 320)");
    		
    	//	driver.findElement(By.id("vpa-upi")).sendKeys("8287729020@okaxis");
    		
    		driver.findElement(By.xpath("//*[@id=\"footer-cta\"]")).click();
    		
    	    
        	
        	
        	
    	}
	
	
	
}
