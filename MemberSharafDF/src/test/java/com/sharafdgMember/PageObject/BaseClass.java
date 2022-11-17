package com.sharafdgMember.PageObject;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UtilitiesHelpers.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {



	public WebDriver driver;
	ReadProperties pro;


	@Parameters("browser")

	@BeforeTest
	public void Setup(String browser) throws IOException  {

		pro = new ReadProperties();
		pro.ReadPropertiesFile();


		if(browser.equalsIgnoreCase(pro.ReadPropertiesFile().getProperty("Chromebrowser"))) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} 
		else if(browser.equalsIgnoreCase(pro.ReadPropertiesFile().getProperty("Edgeebrowser"))) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get(pro.ReadPropertiesFile().getProperty("BaseURL"));

	}


	@Test
	public void login() {
		
		System.out.println("successfully executed");
		
	}
	
	
	

	@AfterTest
	public void Teardown() {

		driver.close();

	}



}
