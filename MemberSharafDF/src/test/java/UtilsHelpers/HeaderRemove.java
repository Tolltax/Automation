package UtilsHelpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HeaderRemove {

	
	static WebDriver driver;
	
	@Test
	public void RemoveHeader() throws InterruptedException
	
	{
		JavascriptExecutor jsj = (JavascriptExecutor) driver;
		jsj.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		Thread.sleep(4000);
		
	}
	

	
}
