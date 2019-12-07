package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testhighlight {

	@Test
	public void test2() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		Thread.sleep(4000);
		
		WebElement uname =driver.findElement(By.xpath("//input[@type='email']"));
		highlight.Display(driver, uname);
		uname.sendKeys("yogesh");
		
		WebElement pass =driver.findElement(By.xpath("//input[@type='password'][@id='pass']"));
		highlight.Display(driver, pass);
		pass.sendKeys("anerao");
		
	
	}
}
