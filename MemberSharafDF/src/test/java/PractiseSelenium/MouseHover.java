package PractiseSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class MouseHover extends BaseClass  {

	
	@Test
	public void MouseHover() {
		
		driver.get("https://www.browserstack.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,490)");
		
		driver.findElement(By.xpath("//*[@class='btn-lg btn-secondary col-md-3 cta col-center view-all-testimonials']")).click();
		
//		WebElement d = driver.findElement(By.xpath("//*[@id='product-menu-toggle']"));
//		
//		Actions  action = new Actions(driver);
//		action.moveToElement(d).build().perform();
//		driver.findElement(By.xpath("//a[@href='/live' and @data-product]")).click();
//		
		
	}
	
	
	
}



