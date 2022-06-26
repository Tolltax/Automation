package utils;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class getScreenShot {
	
	WebDriver driver; 
	
	
	public static void TakeScreenshot(WebDriver webdriver,String fileWithPath) throws IOException {
		
		 
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	
		File SrcFile =scrShot.getScreenshotAs(OutputType.FILE);
		 
		File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);

	}

	
	public static void FullScreenshot(WebDriver driver,String filewithPath) throws IOException {
		
		
        Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
        ImageIO.write(fpScreenshot.getImage(),"jpeg",new File(filewithPath, ".jpeg"));

	}
	
}
