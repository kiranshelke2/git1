package obj_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;
public class loginobj extends TestBase{
	
	//loginobj reflogin= new loginobj();

	@FindBy(xpath="//input[@id='EggTimer-start-time-input-text']")
	public WebElement input_timer;
	
	//Initializing the page object
	public  loginobj() {
		PageFactory.initElements(driver, this);
	}
	
	
}
