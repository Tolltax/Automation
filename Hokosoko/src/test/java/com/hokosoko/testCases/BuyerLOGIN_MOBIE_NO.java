package com.hokosoko.testCases;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BuyerLOGIN_MOBIE_NO {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://hokosoko.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
        
		String  Actualtitle= "Online Shopping Site India - Shop Cleaning Mops, Kitchen Appliances & Home Decor Items - Hokosoko";

		
		String Expectedtitlr =driver.getTitle();
		
		// checking for Home page 

		if(Actualtitle.equals(Expectedtitlr)) {
			
			
			System.out.println("Home page open");
		}else {
			
			
		System.out.println("Home page not open");
		}
	    
		Thread.sleep(5000);
		
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C://Users//cstechmk02//eclipse-workspace//Hokosoko//Screenshots"+0 +".png"));
		
        
        driver.findElement(By.linkText("Sign In")).click();
        
		String logintitle= "Login to Hokosoko";
		String expextedlogin = driver.getTitle();
		
		
        if(logintitle.equals(expextedlogin)) {
			
			
			System.out.println("Login Page Open ");
		}else {
			
			
		System.out.println("Home page not open");
		}
		
        Thread.sleep(3000);
        
		
		// Mobile No fill
		
		driver.findElement(By.id("contactMobileField")).sendKeys("8287729020");
		driver.findElement(By.id("btn_get_otp1")).click();
		Thread.sleep(3000);
		
		   Alert alert = driver.switchTo().alert();
		   String alermessage = driver.switchTo().alert().getText();
		   //System.out.println(alermessage + "By Buyer");
		   //Thread.sleep(3000);
		   alert.accept();
	       
		   driver.findElement(By.id("right_txtOTP1")).sendKeys("4582");
		   
		   Screenshot fpScreenshot2 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
			ImageIO.write(fpScreenshot2.getImage(),"PNG",new File("C://Users//cstechmk02//eclipse-workspace//Hokosoko//Screenshots"+ 3+".png"));
		   
		   driver.findElement(By.xpath("//*[@id='ampTabs']/amp-selector/div[2]/div/form/fieldset/div[5]/input")).click();
		   Thread.sleep(2000);
		   
		  
		    WebElement User = driver.findElement(By.className("user"));
		    String Username = User.getAttribute("innerHTML");
		   
		   System.out.println(Username + " " +"Login successful");
		   driver.close();
	}

}
