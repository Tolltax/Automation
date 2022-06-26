package com.hokosoko.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vedson_Order_process {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://vedson.cstechns.com/login");
		
		
		driver.findElement(By.id("left_txtemail")).sendKeys("pssonugupta@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		//signin_btnlogin
		driver.findElement(By.id("signin_btnlogin")).click();
		
	    driver.navigate().to("http://vedson.cstechns.com/products/SamsungS32/Blue/BMP-S1407256#.YRWUqYgzbIU");
		//driver.findElement(By.linkText("Buy Now ")).click();
		
	}

}
