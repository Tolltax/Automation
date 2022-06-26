package com.hokosoko.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Getcalley {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://appv23.getcalley.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("txtEmailId")).sendKeys("testdemopro@cstech.in");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"btnLogIn\"]")).click();
		
		
		
		driver.navigate().to("https://appv23.getcalley.com/BulkUploadCsv.aspx");
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtlistname\"]")).sendKeys("Newlist10082");
		
	   WebElement file = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fileUpload\"]"));
		file.sendKeys("C:\\Users\\cstechmk02\\Desktop\\bl\\record1.csv");
		driver.findElement(By.xpath("//*[@id=\"btnUp\"]")).click();
		//driver.findElement(By.xpath("/html/body/div[7]/div[7]/div/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("confirm")).click();
		Thread.sleep(3000);
		
		
		
		WebElement rt = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnUpload\"]"));
		
		Thread.sleep(9000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", rt);
		


	}

}
