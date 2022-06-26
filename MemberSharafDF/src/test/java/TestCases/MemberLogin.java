package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import UtilsHelpers.GetScreenShot;
import UtilsHelpers.JavaScriptManage;
import UtilsHelpers.ReadExcelSheet;
import pageobject.BaseClass;
import pageobject.LoginBuyerPO;
import pageobject.LoginBrand;

public class MemberLogin extends BaseClass {



	@Test
	public void TC_001_Login() throws InterruptedException, IOException {




		

		driver.get(BaseURL);


		LoginBuyerPO lp = new LoginBuyerPO(driver);
		lp.Buyer_login("sonu@cstech.in", "12345");
		Thread.sleep(4000);
		
		driver.navigate().to("http://sharafdguat.cstechns.com/orderconfirm/WEPuKMbsBao=&status=");
		JavaScriptManage.HideHeader();
		GetScreenShot.FullSS("C:\\Users\\cstechmk02\\Desktop\\Youtube1\\"+ "ThankyouPage" +".jpg");

	}


}
