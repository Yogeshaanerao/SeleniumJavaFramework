package Waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Fluentwait{

	@Test
	public void explicitewait(){
		

		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		WebDriverWait obj = new WebDriverWait(driver, 8);
		WebElement element= obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@title='Search']")));
		
		element.click();
	}
}
