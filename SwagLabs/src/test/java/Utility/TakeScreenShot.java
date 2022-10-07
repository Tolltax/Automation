package Utility;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import PageObjectPO.BaseClass;

public class TakeScreenShot extends BaseClass {

	
	
	public static void Screenshot1(String imageName) throws IOException {
		
		File fs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("C:\\Users\\kumar\\OneDrive\\Desktop\\work-space\\SwagLabs\\Screenshots\\"+imageName+"Test.jpeg"));
		
	}
	
}
