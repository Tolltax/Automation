package utilVed;

import org.openqa.selenium.JavascriptExecutor;

import com.vedsonmemberPageObject.BaseClass;

public class JavaScriptCD extends BaseClass {

	
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
