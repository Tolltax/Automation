package com.hokosoko.testCases;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class IEdriverSS {

	public static void main(String[] args) throws IOException, InterruptedException {
	 
			
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Webdriver//IEDriverServer.exe");
				        
			//WebDriverManager.iedriver().setup();
		
		    WebDriver driver=new InternetExplorerDriver();
		    int width =375;
			int height= 100000;
            Dimension dimension = new Dimension( width, height);
		    driver.manage().window().setSize(dimension);	        
		    
		    
		    
	         driver.get("https://hokosoko.com/");
	         Thread.sleep(50000);
						
					    

			 String str= driver.getTitle();
			 String  s= str.substring(0, Math.min(str.length(), 18));

			
			 // visible part 
			 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			 FileUtils.copyFile(scrFile, new File("C://Users//cstechmk02//Desktop//Hokosoko_ScreenShot//0_Home_page//.png"));

			 
			 
			 
			 
			 
//			 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	         FileUtils.copyFile(scrFile, new File("C://Users//cstechmk02//Desktop//Hokosoko_ScreenShot//0_Home_page//.png"));			 
			 
			 
			 
			// Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
				 		
  		     //ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Hokosoko_ScreenShot//0_Home_page//"+ width +"Xllyy1111" +height+ "_"+  str + " _" +".jpeg"));
						
				 		
		    driver.close(); 

			}
			
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

