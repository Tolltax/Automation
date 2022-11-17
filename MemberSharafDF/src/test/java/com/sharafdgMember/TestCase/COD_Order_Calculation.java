package com.sharafdgMember.TestCase;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sharafdgMember.PageObject.BaseClass;
import com.sharafdgMember.PageObject.LoginBrand;
import com.sharafdgMember.PageObject.LoginBuyerPO;
import com.sharafdgMember.PageObject.ProductDescription;
import com.sharafdgMember.PageObject.ShoppingCart;

import UtilitiesHelpers.GetScreenShot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class COD_Order_Calculation extends BaseClass {


	@Test 
	public void TC_001_Checkout() throws IOException, InterruptedException {

		

		driver.navigate().to("http://sharafdguat.cstechns.com/default.aspx?id=CheckoutNew");
		
			
		

		//COD Check box 
		WebElement Radio1 = driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[4]/div[4]/div/div/input"));
		Radio1.click();

		// terms checkbox 
		WebElement Checkbox = driver.findElement(By.id("checkoutterm"));
		Checkbox.click();

		driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[3]/div[2]/p/a[1]")).click();	

		Thread.sleep(4000);

		JavascriptExecutor jsj = (JavascriptExecutor) driver;
		jsj.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);



		JavascriptExecutor jst = (JavascriptExecutor)driver;
		jst.executeScript("window.scrollBy(0, 110);");
		Thread.sleep(4000);
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+"Checkout" +".png");

		driver.findElement(By.xpath("//*[@class='button Proddescheckout button-full center-text bg-orange-light full-bottom uppercase']")).click();

		Thread.sleep(2000);


		driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
		Thread.sleep(2000);
		//GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+driver.findElement(By.id("block-title-black")).getText() +".png");
		driver.findElement(By.id("btncodsubmit")).click();

		//Thank you page //
		Thread.sleep(4000);
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		Screenshot fpScreenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot1.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+ "Thanks You page"+".png"));



		//Navigating To MyAcount///
		driver.navigate().to("http://sharafdguat.cstechns.com/myaccount");
		Thread.sleep(3000);
		JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		JavascriptExecutor jsm = (JavascriptExecutor)driver;
		jsm.executeScript("window.scrollBy(0, 240);");
		Thread.sleep(4000);

		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+ "MyAccount" +".png");


	}



	@Test ( enabled=false )
	public void TC_002_Checkout() throws IOException, InterruptedException {

		driver.get(BaseURL);
		LoginBrand lp = new LoginBrand(driver);
		lp.SetUserName(Username);
		lp.SetPassword(paassword);

		GetScreenShot Sc = new GetScreenShot();

		lp.clickSubmit();
		System.out.println("login sucessful");
		Thread.sleep(2000);

		driver.navigate().to(Product1);
		System.out.println("Product 1 PDP Open");


		Thread.sleep(3000);
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+driver.getTitle() +".png");
		ShoppingCart cart = new ShoppingCart(driver);
		cart.AddToCart();
		////////////////////////////////////////////////////////
		driver.navigate().to(Product2);
		System.out.println("Product 2 PDP Open");
		Thread.sleep(2000);
		GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+driver.getTitle() +".png");
		cart.AddToCart();
		//////////////////////////////////////////

		//GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).getText() +".png");

		driver.navigate().to("http://sharafdguat.cstechns.com/shoppingcart");


		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);

		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+ "ShoppingCart"+".png"));


		/////////////////////////////////////////////////////////////


		driver.navigate().to("http://sharafdguat.cstechns.com/default.aspx?id=CheckoutNew");

		driver.findElement(By.id("Applycon")).click();
		Thread.sleep(5000);



		//COD Check box 
		WebElement Radio1 = driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[4]/div[4]/div/div/input"));
		Radio1.click();

		// terms checkbox 
		WebElement Checkbox = driver.findElement(By.id("checkoutterm"));
		Checkbox.click();

		driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[3]/div[2]/p/a[1]")).click();	

		Thread.sleep(4000);

		JavascriptExecutor jsj = (JavascriptExecutor) driver;
		jsj.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);



		JavascriptExecutor jst = (JavascriptExecutor)driver;
		jst.executeScript("window.scrollBy(0, 110);");
		Thread.sleep(4000);
		GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+"Checkout" +".png");

		driver.findElement(By.xpath("//*[@class='button Proddescheckout button-full center-text bg-orange-light full-bottom uppercase']")).click();

		Thread.sleep(2000);

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



		//Navigating To MyAcount///
		driver.navigate().to("http://sharafdguat.cstechns.com/myaccount");
		Thread.sleep(3000);
		JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		JavascriptExecutor jsm = (JavascriptExecutor)driver;
		jsm.executeScript("window.scrollBy(0, 240);");
		Thread.sleep(4000);

		GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+ "MyAccount" +".png");


	}



	@Test (enabled =false)
	public void TC_003_Checkout() throws IOException, InterruptedException {

		driver.get(BaseURL);
		LoginBrand lp = new LoginBrand(driver);
		lp.SetUserName(Username);
		lp.SetPassword(paassword);

		GetScreenShot Sc = new GetScreenShot();

		lp.clickSubmit();
		System.out.println("login sucessful");
		Thread.sleep(2000);

		driver.navigate().to(Product1);
		System.out.println("Product 1 PDP Open");


		Thread.sleep(3000);
		GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_003\\"+driver.getTitle() +".png");
		ShoppingCart cart = new ShoppingCart(driver);
		cart.AddToCart();
		////////////////////////////////////////////////////////
		driver.navigate().to(Product2);
		System.out.println("Product 2 PDP Open");
		Thread.sleep(2000);
		GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_003\\"+driver.getTitle() +".png");
		cart.AddToCart();
		//////////////////////////////////////////

		//GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).getText() +".png");

		driver.navigate().to("http://sharafdguat.cstechns.com/shoppingcart");


		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);

		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_003\\"+ "ShoppingCart"+".png"));


		/////////////////////////////////////////////////////////////


		driver.navigate().to("http://sharafdguat.cstechns.com/default.aspx?id=CheckoutNew");

		//COD Check box 
		WebElement Radio1 = driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[4]/div[4]/div/div/input"));
		Radio1.click();

		// terms checkbox 
		WebElement Checkbox = driver.findElement(By.id("checkoutterm"));
		Checkbox.click();

		driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[3]/div[2]/p/a[1]")).click();	

		Thread.sleep(4000);

		JavascriptExecutor jsj = (JavascriptExecutor) driver;
		jsj.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);



		JavascriptExecutor jst = (JavascriptExecutor)driver;
		jst.executeScript("window.scrollBy(0, 110);");
		Thread.sleep(4000);
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_003\\"+"Checkout" +".png");

		driver.findElement(By.xpath("//*[@class='button Proddescheckout button-full center-text bg-orange-light full-bottom uppercase']")).click();

		Thread.sleep(2000);


		driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
		Thread.sleep(2000);
		driver.findElement(By.id("btncodsubmit")).click();

		//Thank you page //
		Thread.sleep(4000);
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		Screenshot fpScreenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot1.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_003\\"+ "Thanks You page"+".png"));



		//Navigating To MyAcount///
		driver.navigate().to("http://sharafdguat.cstechns.com/myaccount");
		Thread.sleep(3000);
		JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		JavascriptExecutor jsm = (JavascriptExecutor)driver;
		jsm.executeScript("window.scrollBy(0, 240);");
		Thread.sleep(4000);

		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_003\\"+ "MyAccount" +".png");


	}

	@Test (enabled =false)
	public void TC_004_Checkout() throws IOException, InterruptedException {

		driver.get(BaseURL);
		LoginBrand lp = new LoginBrand(driver);
		lp.SetUserName(Username);
		lp.SetPassword(paassword);

		GetScreenShot Sc = new GetScreenShot();

		lp.clickSubmit();
		System.out.println("login sucessful");
		Thread.sleep(2000);

		driver.navigate().to(Product1);
		System.out.println("Product 1 PDP Open");


		Thread.sleep(3000);
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_004\\"+driver.getTitle() +".png");
		ShoppingCart cart = new ShoppingCart(driver);
		cart.AddToCart();
		////////////////////////////////////////////////////////
		driver.navigate().to(Product2);
		System.out.println("Product 2 PDP Open");
		Thread.sleep(2000);
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_004\\"+driver.getTitle() +".png");
		cart.AddToCart();
		//////////////////////////////////////////

		//GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).getText() +".png");

		driver.navigate().to("http://sharafdguat.cstechns.com/shoppingcart");


		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);

		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_004\\"+ "ShoppingCart"+".png"));


		/////////////////////////////////////////////////////////////


		driver.navigate().to("http://sharafdguat.cstechns.com/default.aspx?id=CheckoutNew");

		//COD Check box 
		WebElement Radio1 = driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[4]/div[4]/div/div/input"));
		Radio1.click();

		// terms checkbox 
		WebElement Checkbox = driver.findElement(By.id("checkoutterm"));
		Checkbox.click();

		driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[3]/div[2]/p/a[1]")).click();	

		Thread.sleep(4000);

		JavascriptExecutor jsj = (JavascriptExecutor) driver;
		jsj.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);



		JavascriptExecutor jst = (JavascriptExecutor)driver;
		jst.executeScript("window.scrollBy(0, 110);");
		Thread.sleep(4000);
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_004\\"+"Checkout" +".png");

		driver.findElement(By.xpath("//*[@class='button Proddescheckout button-full center-text bg-orange-light full-bottom uppercase']")).click();

		Thread.sleep(2000);


		driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
		Thread.sleep(2000);
		driver.findElement(By.id("btncodsubmit")).click();

		//Thank you page //
		Thread.sleep(4000);
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		Screenshot fpScreenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot1.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_004\\"+ "Thanks You page"+".png"));



		//Navigating To MyAcount///
		driver.navigate().to("http://sharafdguat.cstechns.com/myaccount");
		Thread.sleep(3000);
		JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		JavascriptExecutor jsm = (JavascriptExecutor)driver;
		jsm.executeScript("window.scrollBy(0, 240);");
		Thread.sleep(4000);

		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_003\\"+ "MyAccount" +".png");


	}



	@Test ( enabled=false )
	public void TC_009_Checkout() throws IOException, InterruptedException {

		driver.get(BaseURL);
		LoginBrand lp = new LoginBrand(driver);
		lp.SetUserName(Username);
		lp.SetPassword(paassword);

		GetScreenShot Sc = new GetScreenShot();

		lp.clickSubmit();
		System.out.println("login sucessful");
		Thread.sleep(2000);

		driver.navigate().to(Product1);
		System.out.println("Product 1 PDP Open");


		Thread.sleep(3000);
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_009\\"+driver.getTitle() +".png");
		ShoppingCart cart = new ShoppingCart(driver);
		cart.AddToCart();
		////////////////////////////////////////////////////////
		driver.navigate().to(Product2);
		System.out.println("Product 2 PDP Open");
		Thread.sleep(2000);
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_009\\"+driver.getTitle() +".png");
		cart.AddToCart();
		//////////////////////////////////////////

		//GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_002\\"+driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).getText() +".png");

		driver.navigate().to("http://sharafdguat.cstechns.com/shoppingcart");


		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);

		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_009\\"+ "ShoppingCart"+".png"));


		/////////////////////////////////////////////////////////////


		driver.navigate().to("http://sharafdguat.cstechns.com/default.aspx?id=CheckoutNew");


		driver.findElement(By.xpath("//*[@id=\"Applystorecra\"]/a")).click();
		Thread.sleep(4000);

		driver.findElement(By.id("display_storecredit")).clear();
		driver.findElement(By.id("display_storecredit")).sendKeys("200");
		driver.findElement(By.id("applystorecredit")).click();



		//COD Check box 
		WebElement Radio1 = driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[4]/div[4]/div/div/input"));
		Radio1.click();

		// terms checkbox 
		WebElement Checkbox = driver.findElement(By.id("checkoutterm"));
		Checkbox.click();

		driver.findElement(By.xpath("//*[@id=\"BodyCheck\"]/div/div[3]/div[2]/p/a[1]")).click();	

		Thread.sleep(4000);

		JavascriptExecutor jsj = (JavascriptExecutor) driver;
		jsj.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);



		JavascriptExecutor jst = (JavascriptExecutor)driver;
		jst.executeScript("window.scrollBy(0, 110);");
		Thread.sleep(4000);
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_009\\"+"Checkout" +".png");

		driver.findElement(By.xpath("//*[@class='button Proddescheckout button-full center-text bg-orange-light full-bottom uppercase']")).click();

		Thread.sleep(2000);


		driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
		Thread.sleep(2000);
		driver.findElement(By.id("btncodsubmit")).click();

		//Thank you page //
		Thread.sleep(4000);
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		Screenshot fpScreenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot1.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_009\\"+ "Thanks You page"+".png"));



		//Navigating To MyAcount///
		driver.navigate().to("http://sharafdguat.cstechns.com/myaccount");
		Thread.sleep(3000);
		JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");

		Thread.sleep(4000);
		JavascriptExecutor jsm = (JavascriptExecutor)driver;
		jsm.executeScript("window.scrollBy(0, 240);");
		Thread.sleep(4000);

		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_009\\"+ "MyAccount" +".png");


	}


}
