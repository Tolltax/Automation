package UtilsHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobject.BaseClass;

public class JavaScriptManage extends BaseClass{


	
	public static void ScrollPage(int a , int b)
	{


		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(a, b)");


	}




	public static void HideHeader()
	{


		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");


	
}
}