package com.hokosoko.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReCaptcha_click {

	public static void main(String[] args) {
	
		
		

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");


		
		WebDriver driver = new ChromeDriver();
		driver.get("https://appv23.getcalley.com/registration.aspx");
		
		JavascriptExecutor js = null;
		
		if (driver instanceof JavascriptExecutor) {
		    js = (JavascriptExecutor) driver;
		}
		 js.executeScript("return document.getElementsByClassName('g-recaptcha')[0].remove();");

	}	
	
			
	
	}


