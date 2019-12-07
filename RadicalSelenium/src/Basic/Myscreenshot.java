package Basic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myscreenshot {
	
	@Test
	public void myselectionlist(){
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String myTimeStamp =new simpleDate;
		
		TakesScreenshot a = (TakesScreenshot)driver;
		File srcFile =a.getScreenshotAs(OutputType.FILE);
		
		FileUtils.
		
		
	}

}
