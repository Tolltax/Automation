package com.sharafdgMember.TestCase;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sharafdgMember.PageObject.BaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SS2 {


	public class MemberScreenshot extends BaseClass {

		int i,j;
		
		
		
		String Link= JOptionPane.showInputDialog("Enter XML Link for your Website");
		
		String path= JOptionPane.showInputDialog("Enter path to store images "+"Format=C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder");

		@Test
		public void MultiResultionSS() throws InterruptedException, IOException {


			
			

			driver.get(Link);


			List<WebElement> links =driver.findElements(By.tagName("loc"));
			int linksCount = links.size();

			System.out.println("Total No of link available Sharafdg  Store: "  +linksCount);

			String n [] = new String[linksCount]; 



			for(i=0; i<linksCount;i++)  
			{

				n[i] = links.get(i).getAttribute("innerHTML"); // link mil rha h

			}



			int[] width =   new int[]   {800,  1024, 768 , 1280, 1366 , 1024,  1366, 1920, 1440, 1680, 1920, 2000, 2048, 2393, 2560, 2560, 3440, 5120 };

			int[] height = new int []   {1280, 1366, 1024, 800,  1024,  768,   768,  1080,  900, 1050, 1200, 2000, 1152, 1346, 1080,  1440, 1440, 1440  };

			//String l [] = new String[] {i} ;

			String str= driver.getTitle();
			String  s= str.substring(0, Math.min(str.length(), 18));

			for(j = 0 ; j<width.length;i++)	 

			{	        
				driver.navigate().to(n[0]);
				Thread.sleep(3000);

				Dimension dimension = new Dimension( width[j],height[j]);
				driver.manage().window().setSize(dimension);

				Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
				ImageIO.write(fpScreenshot.getImage(),"jpeg",new File(path+ s +width[i] +"X" +height[i]+ ".jpeg"));

			}		 

		}






	}


}
