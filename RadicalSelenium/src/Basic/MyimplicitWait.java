package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyimplicitWait {


	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); // to add implicit wait it will applicable for all script(Webdriver)
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("ABC");
		System.out.println("Script Running");
		
		
		
	}
	
	
}
