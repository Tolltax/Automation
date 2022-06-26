package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.BaseClass;
import utils.getScreenShot;

public class UiRunMember extends BaseClass {

	
	@Test
	public void UIRun() throws IOException {
		
	
		System.out.println("Hello ie");
		driver.get(MemberURL);
		getScreenShot SS = new getScreenShot();
		
		SS.FullScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot");
		
		
	}
	
}
