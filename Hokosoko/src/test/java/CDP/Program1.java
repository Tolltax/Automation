package CDP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.Log;
import org.openqa.selenium.devtools.network.Network;


public class Program1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	   DevTools devtools =	driver.getDevTools();
	   devtools.createSession();
	   //devtools.send(Page.captureScreenshot());

	   
	   devtools.send(Log.enable());
	   
	   
	   
	
	
		
        

	}

}
