package utility;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import PageObject.BaseClass;


public class TakeScreenShot extends BaseClass {
	
	
	public static void GetScreenshot(String filepath) throws IOException {
		
		TakesScreenshot Screen =((TakesScreenshot)driver);
		File fileSrc =Screen.getScreenshotAs(OutputType.FILE);
		File Desc = new File(filepath);
		FileUtils.copyFile(fileSrc, Desc);
		
	}

	}
	


