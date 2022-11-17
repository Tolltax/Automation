package com.sharafdgMember.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sharafdgMember.PageObject.BaseClass;

public class NavigatingStaffLogin extends BaseClass {

	@Test
	public void Lauch()
	{
		
		try {
		driver.get("http://siteadminsohostyle.cstechns.com/");
		driver.findElement(By.id("txtLogin")).sendKeys("sohostyle@cstech.in");
		driver.findElement(By.id("txtPassword")).sendKeys("45824582");
		driver.findElement(By.id("btnSubmit")).click();
		
		String Actual =driver.findElement(By.xpath("//*[@class='page_title']")).getText();
		System.out.println(Actual);
		String expected = "Dashboard";
		Assert.assertEquals(Actual, expected,"Test case is pass");
		
		
		
		Actions action = new Actions(driver);
		
		WebElement we = driver.findElement(By.xpath("//*[@id='lisettings12']"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.linkText("Staff Login")).click();
		}catch(Exception e){
			
			System.out.println("Element is not found");
		}
		
	}
	
	
}
