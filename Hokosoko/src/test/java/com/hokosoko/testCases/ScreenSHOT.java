package com.hokosoko.testCases;



import javax.swing.JFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenSHOT {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//JFrame frame = new JFrame("JFrame Example"); 
		
		
		int width = 1024;
		int height = 768;
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);

		driver.manage().deleteAllCookies();
		//driver.get("https://hokosoko.com/");
		
		
		
		

	}

}
