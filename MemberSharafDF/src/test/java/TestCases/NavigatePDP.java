package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageobject.BaseClass;

public class NavigatePDP extends BaseClass {

	
	
	@Test
	public void Pdp() {
		
		driver.get("https://dgbusiness.com/sitemap.xml");
		
		List<WebElement> links =driver.findElements(By.tagName("loc"));
		
		System.out.println("ok");
		
	}
	
	
}
