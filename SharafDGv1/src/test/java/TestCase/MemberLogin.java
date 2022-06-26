package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.BaseClass;

public class MemberLogin extends BaseClass {

	//WebDriver driver;
	
	@Test
	public void Validlogin() {
		
		driver.get("https://dgbusiness.com/login");
		//System.out.println("ok");
		
	}
	
	
	
	
}
