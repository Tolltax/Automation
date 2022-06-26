package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import UtilsHelpers.GetScreenShot;
import UtilsHelpers.JavaScriptManage;
import adminTestCases.RemoveSpecificCart;
import pageobject.BaseClass;
import pageobject.LoginBuyerPO;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestSS extends BaseClass {

	int i;
	int j=0;

	String OnlinePath= "C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\";	

	@Test
	public void LauchBrowser() throws IOException, InterruptedException {


			driver.get(BaseURL);
			LoginBuyerPO lp = new LoginBuyerPO(driver);
			lp.Buyer_login("Rashid.abdul@sharafelectronics.com", "12345");
			
			Thread.sleep(1000);
			
			
			driver.navigate().to("https://dgbusiness.com/products/Logitech-HEADSET-H540-USB-BLACK3593/Black/BMP-S1149548");

//			Thread.sleep(2000);
			GetScreenShot.TakeScreenshot(OnlinePath+ "0_ShoppingCart" +".jpg");
			
			

                	 
		}

	}


