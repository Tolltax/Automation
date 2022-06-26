		import java.io.File;
		import java.io.IOException;
		import java.util.concurrent.TimeUnit;

		import javax.imageio.ImageIO;
		import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.ie.InternetExplorerDriver;

		import ru.yandex.qatools.ashot.AShot;
		import ru.yandex.qatools.ashot.Screenshot;
		import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
		
		
public class CalystaSS {

	public static void main(String[] args) throws IOException, InterruptedException{
		

			int i,j;
								
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
				        
						//IE
						//System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Webdriver//IEDriverServer.exe");
				        // WebDriver driver=new InternetExplorerDriver();
				        
			 ChromeDriver driver=new ChromeDriver();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     
		     
		 
		     
		   //  String n [] =new String [] {"http://vedson.cstechns.com/"};
		     
		     
		    String n [] = new String [] {"http://calysta.cstechns.com/login", "http://calysta.cstechns.com/register", "http://calysta.cstechns.com", "http://calysta.cstechns.com/products/MEMORIALPENDANTS/WhiteGold/BMP-S1330583#.YQmwyogzbIU"};
		     
		     for(int p=0; p<n.length; p++)  {
		 		
		 		
//					n[p] = Link.get(p);
//					       //System.out.println(n[i]);
//			         
//					    }
		     
		     
		     for (int k =0; k<n.length;k++)
		     
		     {
		    	 
   		     driver.navigate().to(n[0]);
   		     
   		     // driver.navigate().to(n[i]);
             
		     
					   
		                 //int[] width =   new int[]   {240, 320, 320 , 320,  320,  320, 360, 375, 414, 375 };
			            
			             //int[] height = new int []   {274, 480, 568,  570,  640,  712, 480, 667, 736, 812};
					    
					    
					    
				        
				         
				        
			           int[] width =   new int[]   {800,  1024, 768 ,1280, 1366, 1024, 1366, 1920, 1440, 1680, 1920, 2000, 2048, 2393, 2560, 2560, 3440, 5120 };
			            
			           int[] height = new int []   {1280, 1366, 1024,800,  1024, 768,  768,  1080,  900, 1050, 1200, 2000, 1152, 1346, 1080,  1440, 1440, 1440};

			            String str= driver.getTitle();
			            String  s= str.substring(0, Math.min(str.length(), 18));

				         
					for(i = 0 ; i<width.length;i++)	 
						
					{	
					     Dimension dimension = new Dimension( width[i],height[i]);
					     driver.manage().window().setSize(dimension);
					     
					     JavascriptExecutor js = (JavascriptExecutor) driver;
			                js.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
					     
						 Thread.sleep(7000);
						 
						 
						 
				 		 Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
				 		 //Home page 
						 // ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Vedson SS//3_Home_page//"+ width[i] +"X" +height[i]+ "_"+  str + " _" +".jpeg"));
						
				 		 //login page
						 //ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Vedson SS//0_Login_page//"+ width[i] +"X" +height[i]+ "_"+  str + " _" +".jpeg"));
		                    
						 //Registar page 
						 //ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Vedson SS//1_register_page//"+ width[i] +"X" +height[i]+ "_"+s +".jpeg"));
						           	     
						 //Login page
						 
						 //ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Vedson SS//4_Login_page//"+ width[i] +"X" +height[i]+ "_"+  str + " _" +".jpeg"));
		                 
				 		 
				 		 //PDP page
						ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Vedson_SS//3_Home_page//"+ width[i] +"X" +height[i]+ "_"+  str +".jpeg"));

						 
					}		 
					
		     }
						            	   
					 driver.close(); 

			}
			
	}	}	

				
				


