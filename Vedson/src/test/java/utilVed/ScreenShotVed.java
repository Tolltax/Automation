package utilVed;


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

public class ScreenShotVed extends com.vedsonmemberPageObject.BaseClass{


		public static void TakeScreenshot(String filepath) throws IOException {


			TakesScreenshot scrShot =((TakesScreenshot)driver);

			File SrcFile =scrShot.getScreenshotAs(OutputType.FILE);

			File DestFile=new File(filepath);
			FileUtils.copyFile(SrcFile, DestFile);

		}



		public static void FullSS(String path) throws IOException {

			Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
			ImageIO.write(fpScreenshot.getImage(),"PNG",new File(path+".png"));



		}


	}

	

