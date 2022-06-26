package PageObject;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AllSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		WebDriver driver ;
		int i;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("http://sharafdguat.cstechns.com/login");
		driver.findElement(By.id("left_txtemail")).sendKeys("sonu@cstech.in");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();

		
		 int[] width =   new int[]   {800,  1024, 768 , 1280, 1366 , 1024,  1366, 1920, 1440, 1680, 1920, 2000, 2048, 2393, 2560, 2560, 3440, 5120 };
	        
         int[] height = new int []   {1280, 1366, 1024, 800,  1024,  768,   768,  1080,  900, 1050, 1200, 2000, 1152, 1346, 1080,  1440, 1440, 1440  };
		
         
         String n [] = new String[] { 


        		 "http://sharafdguat.cstechns.com/login",
        			 "http://sharafdguat.cstechns.com/register"
        				, "http://sharafdguat.cstechns.com/orderdetails/OSeplusDyNEJSjhxVCWWo8nYA=="

         };
//                 "http://sharafdguat.cstechns.com/",
//                  "http://sharafdguat.cstechns.com/list/all",
//                  "http://sharafdguat.cstechns.com/products/APPLEiPhone12MiniRed64GBF15F/Red/BMP-S1121233#.YanfptBBzIU",
//
//                  "http://sharafdguat.cstechns.com/BrandProductList/BMP-S1412108",
//                   "http://sharafdguat.cstechns.com/sellerproductlist/BMP-S1084919"
//                   ,"http://sharafdguat.cstechns.com/contactus"
//                   ,"http://sharafdguat.cstechns.com/shoppingcart"
//                   ,"http://sharafdguat.cstechns.com/myaccount"
//                   ,"http://sharafdguat.cstechns.com/profile"
//                   ,"http://sharafdguat.cstechns.com/changepassword"
//                   ,"http://sharafdguat.cstechns.com/manage-addresses"
//                   ,"http://sharafdguat.cstechns.com/storecredit"
//                   ,"http://sharafdguat.cstechns.com/RfqList"
//                   ,"http://sharafdguat.cstechns.com/messages"
//                   ,"http://sharafdguat.cstechns.com/content/about-us"
//                   ,"http://sharafdguat.cstechns.com/content/careers"
//                   ,"http://sharafdguat.cstechns.com/content/privacy-policies"};

		
         
         for (int j=0;j<=n.length;j++)  

 		{

 			driver.navigate().to(n[j]); 
 			Thread.sleep(3000);

 			String str= driver.getCurrentUrl();
 			//String  s= str.substring(0, Math.min(str.length(), 18));
 			String  st= str.replaceAll("\\W", " ");
 			System.out.println(st);

 			for(i = 0 ; i<width.length-1;i++)	 

 			{	         


 				Dimension dimension = new Dimension( width[i],height[i]); 
 				driver.manage().window().setSize(dimension); 
 				Thread.sleep(5000);
 				
 				JavascriptExecutor js3 = (JavascriptExecutor) driver;
 				js3.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
 				Thread.sleep(4000);

 				Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
 				ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C:\\Users\\cstechmk02\\Desktop\\MemberSS\\" + + width[i] +"X" +height[i]+" " +st + " " +".jpeg"));
 			}		 

 		}
 	}
         


	}


