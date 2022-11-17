package com.sharafdgAdmin.TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.sharafdgMember.PageObject.BaseClass;

import UtilitiesHelpers.GetScreenShot;

public class AdminOrderPage extends BaseClass{

	
	
	
	
	public static void AdminOrderSS() throws InterruptedException, IOException {
		
		driver.get("https://siteadmin.dgbusiness.com/orderlist_new.aspx");
		Thread.sleep(5000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0, 250)");
		Thread.sleep(2000);

	}
	
	public static void AdminManageOrder() throws InterruptedException, IOException {
		
		String op=driver.findElement(By.xpath("//*[@id=\"dt_table\"]/tbody/tr[1]/td[2]")).getAttribute("innerAttribute");
		
		System.out.println(op);
	}
	
	
	
	
	
}
