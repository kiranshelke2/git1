package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.FlexUISelenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import obj_pages.loginobj;

public class login extends loginobj  {
	

	@FindBy(xpath = "//input[@id='EggTimer-start-time-input-text']")
	public WebElement input_timer;

	@FindBy(xpath = "//button[@class='validTime']")
	public WebElement btn_start;
	
	@FindBy(xpath = "//div[@class='SunsetTimer-label']/p")
	public WebElement gettime;
	
	
	//@FindBy(xpath = "//*[@class='ClassicTimer-time']/span")
	//public List<WebElement> gettime;
	
	
	

	// Initializing the page object
	public login() {
		PageFactory.initElements(driver, this);
	}
	//login reflogin= new login();

	static WebDriver driver;

//	public  login() {
//		PageFactory.initElements(driver, this);
//	}
	@Given("^user is on timer page$")
	public void verify_loginpage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Acer/eclipse-workspace/timer_Automation/src/test/java/config/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.wait(15000);
		Thread.sleep(5000);
		driver.get("http://e.ggtimer.com");

		driver.manage().window().maximize();
		// driver.wait(10000);
		System.out.println(driver.getTitle());

		System.out.println("User on timer page");
	}

	@When("^user enters timer$")
	public void verify_timer() throws InterruptedException {
		login reflogin= new login();
		
		Thread.sleep(4000);
		reflogin.input_timer.sendKeys("25");
		Thread.sleep(4000);

	}

	@When("^clicks on start button$")

	public void verify_start() throws InterruptedException {
		login reflogin= new login();
		reflogin.btn_start.click();
		Thread.sleep(20000);

		System.out.println("click on start button");

	}

	@Then("^timer countdown begins$")
	public void verify_countdown() {
		
		//login reflogin= new login();
		String timer= ""; 	
		//FlexUISelenium flex= ;
		String time=gettime.getAttribute("value");
		System.out.println("time"+time);
		System.out.println("Going inside while"+timer);
		while( gettime.getAttribute("value")!=null) {
			
			System.out.println("Inside while"+timer);
			
			String atr=gettime.getAttribute("value");
			System.out.println(atr);
		}
		
		System.out.println("timer countdown begins");

	}

	@Then("^after timer ends logout from the application$")
	public void logout() {
		// driver.close();
		driver.quit();
		System.out.println("Looging offf from the application");

	}

}
