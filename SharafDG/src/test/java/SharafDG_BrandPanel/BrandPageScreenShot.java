package SharafDG_BrandPanel;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BrandPageScreenShot

{


	WebDriver driver;
	int i;
	
	@BeforeClass
    public void Setup()
	
	{
	    WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		
		driver.get("http://brandsharafdguat.cstechns.com/login");
		driver.findElement(By.id("left_txtemail")).sendKeys("test.apple1@apple.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		 
		

	}
	
	
	@Test
	public void Test() throws InterruptedException, IOException
	
	{
         
		
		
		int[] width =   new int[]   {800,  1024, 768 , 1280, 1366 , 1024,  1366, 1920, 1440, 1680, 1920, 2000, 2048, 2393, 2560, 2560, 3440, 5120 };
        
         int[] height = new int []   {1280, 1366, 1024, 800,  1024,  768,   768,  1080,  900, 1050, 1200, 2000, 1152, 1346, 1080,  1440, 1440, 1440  };
		
         String n [] = new String[] { "http://brandsharafdguat.cstechns.com/supplierwelcome",
                 "http://brandsharafdguat.cstechns.com/questions_answers.aspx",
                 "http://brandsharafdguat.cstechns.com/suppliermanageprofile",
                 "http://brandsharafdguat.cstechns.com/supplierproductlist",
                 "http://brandsharafdguat.cstechns.com/bulkuploadcsv",
                 "http://brandsharafdguat.cstechns.com/supplierbulkuploadcsv",
                 "http://brandsharafdguat.cstechns.com/products_NewSEO.aspx",
                 "http://brandsharafdguat.cstechns.com/changepassword",
                 "http://brandsharafdguat.cstechns.com/Add_SubUser.aspx",
                 "http://brandsharafdguat.cstechns.com/Permission.aspx?id=20048",
                 "http://brandsharafdguat.cstechns.com/Size_Chart_List.aspx",
                 "http://brandsharafdguat.cstechns.com/Query.aspx",
                 "http://brandsharafdguat.cstechns.com/Query_Add.aspx",
                 "http://brandsharafdguat.cstechns.com/products_imagesadd.aspx?id=158919",
                 "http://brandsharafdguat.cstechns.com/products_priceapproval.aspx?id=158915",
                 "http://brandsharafdguat.cstechns.com/content/about-us",
                 "http://brandsharafdguat.cstechns.com/content/faq",
                 "http://brandsharafdguat.cstechns.com/contactdetails",
                 "http://brandsharafdguat.cstechns.com/login",
                 "http://brandsharafdguat.cstechns.com/SubLogin",
        		                       };
	     

     	
       for (int j=0;j<=n.length;j++)  
    	   
       {
         
          driver.navigate().to(n[j]); 
          Thread.sleep(3000);
         
          String str= driver.getCurrentUrl();
//          String  s= str.substring(0, Math.min(str.length(), 18));
          String  st= str.replaceAll("\\W", " ");
          System.out.println(st);
          
         for(i = 0 ; i<width.length-1;i++)	 
				
        	      {	         
        	 
 
                         Dimension dimension = new Dimension( width[i],height[i]); 
                         driver.manage().window().setSize(dimension); 
                         Thread.sleep(5000);
  
	                     Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
	                     ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//sharaf_Screenshot//TestRun2//" + + width[i] +"X" +height[i]+" " +st + " " +".jpeg"));
                  }		 
		 
       }
	}
	

	
	@AfterClass
	public void teardown()
	
	{
		
		System.out.println("pass");
	}
	

	
}

	

