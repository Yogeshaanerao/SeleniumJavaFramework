package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setupapplication(){
		Reporter.log("Start browser", true);
		
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	
	@AfterMethod
	public void closeapplication(){
		driver.quit();
		Reporter.log("Close browser", true);
	}

}
