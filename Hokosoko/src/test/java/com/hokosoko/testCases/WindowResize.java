package com.hokosoko.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowResize {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://hokosoko.com/");
		
		int width = 500;
		int height = 768;
		Dimension dimension = new Dimension(width, height);
		
		
		driver.manage().window().setSize(dimension);
		System.out.println("pass");
		
		
	}
	
	

}
