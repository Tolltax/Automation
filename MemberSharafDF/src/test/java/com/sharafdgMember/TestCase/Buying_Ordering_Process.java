package com.sharafdgMember.TestCase;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sharafdgMember.PageObject.BaseClass;
import com.sharafdgMember.PageObject.CheckoutPageObject;
import com.sharafdgMember.PageObject.ProductDescription;
import com.sharafdgMember.PageObject.ShoppingCart;

import UtilitiesHelpers.GetScreenShot;
import UtilitiesHelpers.HeaderRemove;
import UtilitiesHelpers.JavaScriptManage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Buying_Ordering_Process extends BaseClass {



	@Test
	public void TC_001_COD() throws InterruptedException, IOException

	{

				 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		         js1.executeScript("window.scrollBy(0,900)");


		CheckoutPageObject cp = new CheckoutPageObject(driver);
		Thread.sleep(2000);

		cp.BillingYes();
	//	cp.CheckBoxcLICKED();
		cp.CODClick();

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-900)");

		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);

		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+ "Checkout"+".png"));

	//	cp.OrderPlace();

		//OTP VERIFICATION
		driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
		Thread.sleep(2000);
		driver.findElement(By.id("btncodsubmit")).click();

		//Thank you page //
		Thread.sleep(4000);
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		Screenshot fpScreenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot1.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+ "Thanks You page"+".png"));


		//MY ACCOUNT

		//Navigating To MyAcount///
		driver.navigate().to("http://sharafdguat.cstechns.com/myaccount");
		Thread.sleep(3000);
		JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		JavascriptExecutor jsm = (JavascriptExecutor)driver;
		jsm.executeScript("window.scrollBy(0, 240);");
		Thread.sleep(4000);

	//	GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+ "MyAccount" +".png");




	}

	@Test 
	public void TC_002_COD_PROMO() throws InterruptedException, IOException {


		CheckoutPageObject cp = new CheckoutPageObject(driver);

		cp.ApplyFinalCoupone();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		cp.BillingYes();
		cp.CheckBoxcLICKED();
		cp.CODClick();


		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-900)");

		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);

		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+ "Checkout"+".png"));

		cp.OrderPlace();

		//OTP VERIFICATION
		driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
		Thread.sleep(2000);
		driver.findElement(By.id("btncodsubmit")).click();

		//Thank you page //
		Thread.sleep(4000);
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		Screenshot fpScreenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot1.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+ "Thanks You page"+".png"));


		//MY ACCOUNT

		//Navigating To MyAcount///
		driver.navigate().to("http://sharafdguat.cstechns.com/myaccount");
		Thread.sleep(3000);
		JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		JavascriptExecutor jsm = (JavascriptExecutor)driver;
		jsm.executeScript("window.scrollBy(0, 240);");
		Thread.sleep(4000);

		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+ "MyAccount" +".png");

	
		

	}




}
