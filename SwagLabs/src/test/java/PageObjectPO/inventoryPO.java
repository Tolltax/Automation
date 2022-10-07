package PageObjectPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class inventoryPO {

	WebDriver driver;
	
	public inventoryPO(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//*[@class='select_container']")
	WebElement DrpDown;
	
	
	public void Seelct() {
		
		Select drp = new Select(DrpDown);
		drp.selectByIndex(0);
		
	}
	
	
	
	@FindBy(xpath="//*[@class='title']")
	WebElement ProductName;
	
	public String getTextName() {
		
		String Pname =ProductName.getText();
		return Pname;
		
		
	}
	
}
