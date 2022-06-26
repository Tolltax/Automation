package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import UtilsHelpers.GetScreenShot;
import pageobject.BaseClass;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class MemberScreenshot2 extends BaseClass {

	int i,j;

	@Test
	public void MultiResultionSS() throws InterruptedException, IOException {



		driver.get("https://dgbusiness.com/login");
		driver.findElement(By.id("left_txtemail")).sendKeys("sonu@cstech.in");        
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");       
		driver.findElement(By.id("signin_btnlogin")).click();


		Thread.sleep(2000);
		driver.navigate().to("https://dgbusiness.com/sitemap.xml");




		List<WebElement> links =driver.findElements(By.tagName("loc"));
		int linksCount = links.size();

		System.out.println("Total No of link available Sharafdg  Store: "  +linksCount);

		String n [] = new String[linksCount]; 



		for(i=0; i<linksCount;i++)  
		{

			n[i] = links.get(i).getAttribute("innerHTML"); 


		}




		//String l [] = new String[] {i} ;

		String str= driver.getTitle();
		String  s= str.substring(0, Math.min(str.length(), 18));

		for(j = 250; j<linksCount;j++)	 

			    	{	        



		driver.navigate().to(n[j]);
		//Thread.sleep(1000);
		System.out.println("Url ===||" + " " + n[j] + " " + "Status===||" +" " + driver.getTitle());	



				 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//
				 FileUtils.copyFile(scrFile, new File("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\PDPSS\\"+ driver.getTitle() +".png"));







		// Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		//ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//sharaf_Screenshot//Brand Home Page//"+ s + ".jpeg"));
		//	
	}		 






	}
}

//}

