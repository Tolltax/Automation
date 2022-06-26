package TestCases;



import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import UtilsHelpers.GetScreenShot;
import pageobject.BaseClass;
import pageobject.MyAccountPOMember;

public class MyAccountTest extends BaseClass {




	@Test
	public void Member() throws InterruptedException, IOException {


		Checkout vb = new Checkout();
		vb.LoginBuyer();
		Thread.sleep(2000);
		driver.navigate().to("https://stg.dgbusiness.com/myaccount");

		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		jsp.executeScript("window.scrollBy(0, 200)");

		List <WebElement> AllOrders=	driver.findElements(By.partialLinkText("393"));
		System.out.println(AllOrders.size());
		ArrayList<String> targets1 = new ArrayList<String>();
		
		

		for(WebElement E:AllOrders) {


			
			
			targets1.add(E.getText());
			

		}
		
		
	System.out.println(targets1.get(0));
	System.out.println(targets1.get(1));

	}





}


//String parentHandle = driver.getWindowHandle();
//System.out.println(parentHandle);
//
//for (String winHandle : driver.getWindowHandles()) {
//    driver.switchTo().window(winHandle);
//    
//}
//
//E.click();
//GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+"6_Seller1Order"+".jpg");
//driver.switchTo().window(parentHandle);

