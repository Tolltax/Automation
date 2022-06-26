package adminTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import adminPO.AdminLoginPO;
import adminPO.ExeptionManageAdmin;
import pageobject.BaseClass;

public class RemoveSpecificCart extends BaseClass {

	

		@Test
		public void CartRemoveSpecific() throws InterruptedException {


			driver.get(BaseUrladmin);

			AdminLoginPO AL = new AdminLoginPO(driver);
			AL.AdminLogin(AdminUsername, Adminpwd);
			
			driver.navigate().to("https://siteadmin.dgbusiness.com/remove_itemfromcart.aspx");
			driver.findElement(By.xpath("//input[@type='button' and @value='Remove From Cart']")).click();
			driver.findElement(By.xpath("//*[@class='confirm']")).click();
			

//			Thread.sleep(4000);
//			
//			WebElement Wb= driver.findElement(By.id("//*[@id='ddlusertype']"));
//			
//			System.out.println("test");
//			Select sc =new Select(Wb);
//			sc.selectByVisibleText("Specific");
////			
////			ExeptionManageAdmin Sp =  new ExeptionManageAdmin(driver);
////			Thread.sleep(3000);
////			Sp.RemoveCart(CartRemoveEmil);


		}	
		
		
//		public void PromoApp() throws InterruptedException {
//			
//			driver.get(BaseUrladmin);
//
//			AdminLoginPO AL = new AdminLoginPO(driver);
//			AL.AdminLogin(AdminUsername, Adminpwd);
//			driver.navigate().to("https://siteadmin.dgbusiness.com/promotions.aspx");
//			driver.
//			
//			
//			
//		}
		
		
	}





