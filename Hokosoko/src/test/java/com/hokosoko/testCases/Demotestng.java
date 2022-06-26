package com.hokosoko.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotestng {

	
	
	public void setup()
	
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		
	}
	
	
	
	
	
	
}
