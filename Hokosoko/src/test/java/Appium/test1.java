package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class test1 {

	public static void main(String[] args) throws MalformedURLException {
		//System.out.println("test");
		
		
		/*  step
		 * 
		 * Prerequistes
		 * 
		 * Make sure your Appium server is started 
		 * Make sure your emulator is opened  
		 * 
		 * My desire capabilities 
		 * 
		 * i want to open My emulator 
		 * 
		 * XYZ App
		 * 
		 * Connection steps to server
		 * 
		 * 
		 * 
		 * http //127.0.0.1:4723/wd/hub
		 * steps:- 
		 */
		
		
//		File f = new File("src");
//		File fs = new File(f,"Vedson_apkpure.com.apk" );
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sonuemulator");
		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),cap);
		
		
		
		

	}

}
