package TestCases;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.BaseClass;
import PageObject.SwagLabLoginPO;
import PageObject.inventotyPagePO;
import utility.TakeScreenShot;

public class Login extends BaseClass {


	String ActualPageurl= "https://www.saucedemo.com/inventory.html";
	String ActualPageurl2= "https://www.saucedemo.com/";

	@Test (priority =1)
	public void Buyer_Should_Login_With_Valide_User_and_ID()  {

		driver.get(BaseURL);
		SwagLabLoginPO login = new SwagLabLoginPO(driver);
		login.textaatribute();
		
			login.loginClick("standard_user", "secret_sauce");
		inventotyPagePO mp = new inventotyPagePO(driver);
		mp.menuclick();
		mp.logout();
//		System.out.println(driver.getCurrentUrl());
//		Assert.assertEquals(ActualPageurl, driver.getCurrentUrl());
		

	}

	@Test(priority= 2,enabled=false)
	public void Buyer_ShouldNot_Login_With_InValide_User_and_InValidID() throws IOException {

		try{

			driver.get(BaseURL);
			SwagLabLoginPO login = new SwagLabLoginPO(driver);
			login.loginClick("standard_user1", "secret_sauce");
			//Assert.assertTrue(false);
			TakeScreenShot.GetScreenshot("C:\\Users\\cstechmk02\\Desktop\\WAP\\" +"test2.jpg");
			
		}catch(Exception e){
			
			
			
			System.out.println("Error ");
//			//e.getMessage();
//
//
//			//	TakeScreenShot.GetScreenshot("C:\\Users\\cstechmk02\\Desktop\\WAP\\" +"test.jpg");
//				TakesScreenshot Screen =((TakesScreenshot)driver);
//				File fileSrc =Screen.getScreenshotAs(OutputType.FILE);
//				File Desc = new File("C:\\Users\\cstechmk02\\Desktop\\WAP\\" +"op.jpg");
//				FileUtils.copyFile(fileSrc, Desc);

//			
			
		}
			
		//	TakeScreenShot.GetScreenshot("C:\\Users\\cstechmk02\\Desktop\\WAP\\" +"test.jpg");
//			TakesScreenshot Screen =((TakesScreenshot)driver);
//			File fileSrc =Screen.getScreenshotAs(OutputType.FILE);
//			File Desc = new File("C:\\Users\\cstechmk02\\Desktop\\WAP\\" +".jpg");
//			FileUtils.copyFile(fileSrc, Desc);

			//Assert.assertEquals(ActualPageurl2, driver.getCurrentUrl());
		//	Assert.assertTrue(false);
//
//		}catch(Exception e) {
//
//
//
//			TakesScreenshot Screen =((TakesScreenshot)driver);
//			File fileSrc =Screen.getScreenshotAs(OutputType.FILE);
//			File Desc = new File("C:\\Users\\cstechmk02\\Desktop\\WAP\\" +".jpg");
//			FileUtils.copyFile(fileSrc, Desc);
//			
//			//TakeScreenShot.GetScreenshot("C:\\Users\\cstechmk02\\Desktop\\WAP\\" +".jpg");
//
//		}

	}



}

