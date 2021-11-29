package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()  {
		
		try {
			prop= new Properties();
			FileInputStream fs = new FileInputStream("C:/Users/Acer/eclipse-workspace/timer_Automation/src/test/java/config/config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void initialization() throws InterruptedException {
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.driver.chrome","C:/User/Acer/eclipse-workspace/timer_Automation/src/test/java/config/chromedriver.exe" );
		}
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get(prop.getProperty("url"));
		
		
	}
	

}
