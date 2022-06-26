package com.hokosoko.testCases;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class MobileSCREENSHOT {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://hokosoko.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
        
        
		
		/* THIS IS CUSTOMMIZES SCREENSHOT  */
		
       	DevTools devTools = driver.getDevTools();
		
		devTools.createSession();

    Map deviceMetrics = new HashMap()
    {{  
        put("width", 375);
        put("height",600 );
        put("mobile", true);
        put("deviceScaleFactor", 70);
    }};

//    driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
//    driver.get("https://hokosoko.com/");      
    
    Thread.sleep(2000); 
  
//    ((JavascriptExecutor) driver)
//    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    
	Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
	ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C://Users//cstechmk02//Desktop//Hokosoko"  +".png"));
	//driveruit();
		
		
    System.out.println("FAILED");

    
	}

	
		
	}

