package dataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin {
	WebDriver driver;
	
	@Test(dataProvider="wordpressData")
	public  void login(String username, String Password)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	}
	
	@DataProvider(name="wordpressData")
	
	public Object[][] passdata ()
	{
		
		Object[][] data = new Object[3][2];
		data[0][0] = "admin1";
		data[0][1] = "demo1";
				
		data[1][0] = "admin";
		data[1][1] = "demo123";
		
		data[2][0] = "admin2";
		data[2][1] = "demo1234";
		return data;
		
	}
	
	
	
	
	
	
	
	

}
