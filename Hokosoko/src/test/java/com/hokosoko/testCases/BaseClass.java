package com.hokosoko.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	public String Baseurl = "https://hokosoko.com/login";
	public String MobileNo = "9888888888";
	public static WebDriver driver;
	
	
	@BeforeClass
	public void Setup()
	{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	@AfterClass
	public void tearDown()
	
	{

		driver.quit();
	}
	

}
