package SharafDG_BrandPanel;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CDP {

	public static void main(String[] args) {
		

	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    DevTools devTools = driver.getDevTools();
        devTools.createSession();
        Map deviceMetrics = new HashMap()
        {{
            put("width", 600);
            put("height", 1000);
            put("mobile", true);
            put("deviceScaleFactor", 50);
        }};
        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
        driver.get("https://www.google.com");
		

	}

}
