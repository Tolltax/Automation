package PageObjectPO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static Properties pros;
	public static WebDriver driver;
	public static String BrowserName;



	@BeforeTest
	public static void Setup() {

		readconfig();
		
		WebDriverManager.chromedriver().setup();
		BrowserName = pros.getProperty("browser");

	    if(BrowserName.contains("Chrome")) {
			
			driver = new ChromeDriver();

		}else if(BrowserName.contains("firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}else if(BrowserName.contains("edge")) {
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}else if(BrowserName.contains("InternetExploer")) {
			//WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();

		}

		driver.get(pros.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}



	@AfterTest
	public void TearDown() {

		//driver.close();

	}


	public static void readconfig()  {

		try {
			pros = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\kumar\\OneDrive\\Desktop\\work-space\\SwagLabs\\src\\test\\java\\Config\\config.properties");
			pros.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
