package com.sharafdgMember.PageObject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MemberMyOrderPO extends BaseClass {

	WebDriver ldriver;


	public MemberMyOrderPO(WebDriver rdriver) {

		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);

	}

	
	
    /* Sort By Filter */

	@FindBy(id="ddl_order_status")
	WebElement SortBy;

	public void shippingheight() {

		Select sort = new Select(SortBy);
		sort.selectByVisibleText("Delivered");

		
	}
	
	
	
	
	
	public void OrderReturnProduct() throws InterruptedException {
		
		
		
		
		String SellerID = "OI";
		
		driver.navigate().to("stg.dgbusiness.com/orderdetailsreturns/"+SellerID);   
		String Url =driver.findElement(By.id("//div[@id='checkboxretuns']")).getText();
		driver.navigate().to(Url);
		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		jsp.executeScript("window.scrollBy(0, 300)");
		
	    WebElement QTY= driver.findElement(By.xpath("//select[@id='ddlquantity']"));
	    Select bn = new Select(QTY);
	    bn.selectByIndex(0);
	    
	    
	    WebElement Reason= driver.findElement(By.xpath("//select[@id='ddlreason']"));
	    Select rn = new Select(Reason);
	    bn.selectByIndex(0);
		
	    
	    WebElement type= driver.findElement(By.xpath("//select[@id='ddlreturnstatus']"));
	    Select ty = new Select(type);
	    bn.selectByIndex(0);
	  
	    
	    WebElement Credittype= driver.findElement(By.xpath("//select[@id='ddlreturnstatus']"));
	    Select ct = new Select(Credittype);
	    bn.selectByIndex(0);
	    
	    driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("this is  sample refund");
	    driver.findElement(By.xpath("//input[@id='filewithboximg']")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(4000);
		
		driver.findElement(By.id("btnreturnsubmit")).click();
		
	}





}
