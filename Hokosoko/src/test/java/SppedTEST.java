import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SppedTEST {

	public static void main(String[] args) {
		
		
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://siteadmin.hokosoko.com/");
		driver.findElement(By.id("txtLogin")).sendKeys("hokosoko@cstech.in");
		driver.findElement(By.id("txtPassword")).sendKeys("45824582");
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.id("//*[@id=\"liSales_parent\"]/a")).click();
		driver.findElement(By.linkText("New Orders")).click();
		
		
		
		
		
		

	}

}
