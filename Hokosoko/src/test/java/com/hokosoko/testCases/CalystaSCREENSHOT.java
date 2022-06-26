package com.hokosoko.testCases;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class CalystaSCREENSHOT {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		

				int i,j;
				
				
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
				
				ChromeDriver driver=new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
		        driver.get("http://calysta.cstechns.com/sitemap.xml");
		       

		        
		        
		        /*      Desktop / Laptop
		                1366 X 768
		                1920 X 1080----
		                1440 X 900
		                1680 X 1050

		                Mobile
		                360 X 480
		                375 X 667

		                Tablet 
		                1024 X 768
		                768 X 1024
		         * 
		         */
		        
		        
		        //mentioned size of browser 
				
				int width = 1366;              
		        int height = 768;
				Dimension dimension = new Dimension(width,height);
				driver.manage().window().setSize(dimension);
				
				List<WebElement> links =driver.findElements(By.tagName("loc"));
				int linksCount = links.size();
				
				System.out.println("Total No of link available Calysta Store: "  +linksCount);
				
				String n [] = new String[linksCount]; 
				
				
				
				// intialization
				
				
				 
				for(i=0; i<linksCount;i++)  {
				
					n[i] = links.get(i).getAttribute("innerHTML");
					
					    }
				
				
				    	for (i=0;i < linksCount ;i++) {
					
					
		                  driver.navigate().to(n[i]);
		                
		                 //  int k =1;
		                
//		               do{
//		                
//		                driver.findElement(By.xpath("*//a[@class='close']")).click();
//					   } while(k<=1);
//		               
//		               
		               
		               
		                Thread.sleep(10);
		                
		                //If header is fixed we can manage this thru Javascript below code written
		                JavascriptExecutor js = (JavascriptExecutor) driver;
		                js.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		                
		           
		                /////////////////////////// Page Open  with all modification ///////////////////////
		                
		                
		               Boolean isPresent= driver.findElements(By.id("pagesize_ddl")).size()>0; 
		               
		               
		               if (isPresent == true)  // true
		            	   
		               {
		            	   
		            	   WebElement s =driver.findElement(By.id("pagesize_ddl"));
		                   String p=  s.getAttribute("innerHTML");
		            	   
		            	     if(p.equals("Total <b>0</b> Products."))
		            	     
		            	        {
		            	    	 
		            	    	   System.out.println("product no associted with list " + driver.getCurrentUrl());
		            	    	 
		            	        }
		            	     
		            	     
		            	            else 
		            	     
		            	               {
		            	    	 
		            	    	          Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		    	    	                  ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C://Users//cstechmk02//Desktop//Calysta//1666//"+ i+".png"));
		            	    	 
		                        	     }
		            	     
		               } 
		               
		               
		               else 
		               
		               {
		            	   
		            	   
		            	     Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
			    	         ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C://Users//cstechmk02//Desktop//Calysta//1666//"+ i+".png"));
		            	   
		            	   
		               }
		               
		             
		            	      
		            	           {
		                   	
		                  	
		                   	
		            	        
		                           }
		            	   
		            	   
		            	   
		               }
		               
		              
		               
		       }
				
			


	}

