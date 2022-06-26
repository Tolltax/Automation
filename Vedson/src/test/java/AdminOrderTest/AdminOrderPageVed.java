package AdminOrderTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.vedsonmemberPageObject.BaseClass;

public class AdminOrderPageVed extends BaseClass {

	
	
	
	
	public static void AdminOrderSS() throws InterruptedException, IOException {
		
		driver.get("http://siteadminvedson.cstechns.com/orderlist_new.aspx");
		Thread.sleep(5000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0, 200)");
		Thread.sleep(2000);

	}
	
	public static void AdminManageOrder() throws InterruptedException, IOException {
		
		String op=driver.findElement(By.xpath("//*[@id=\"dt_table\"]/tbody/tr[1]/td[2]")).getAttribute("innerAttribute");
		
		System.out.println(op);
	}
	
	
	
	
	
	
	
	
	
	
}
