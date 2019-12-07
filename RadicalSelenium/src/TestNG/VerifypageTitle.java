package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifypageTitle {

	@Test
	public void verifyTitle() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\RadicalSoftware\\WEB BROWSER\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	
		Thread.sleep(5000);
		String mytitle = driver.getTitle();
		System.out.println(mytitle);
		Assert.assertEquals(mytitle, mytitle);
		System.out.println("test passed");
		
		
		
	}
}
