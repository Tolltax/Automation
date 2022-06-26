package AdminOrderTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.vedsonmemberPageObject.BaseClass;

import AdminVedPO.AdminLoginPO;


public class RemovCart extends BaseClass {

	


	public void RemovCart() throws InterruptedException {


			driver.get(BaseUrladmin);

			AdminLoginPO AL = new AdminLoginPO(driver);
			AL.AdminLogin(AdminUsername, Adminpwd);
			
			driver.navigate().to("http://siteadminvedson.cstechns.com/remove_itemfromcart.aspx");
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
