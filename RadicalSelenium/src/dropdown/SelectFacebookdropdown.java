package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookdropdown {
	
	@Test
	public void selectDDvalues() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement monthDropdown =driver.findElement(By.id("month"));
		
		Select monthDD= new Select(monthDropdown);
		monthDD.selectByIndex(3);
		
		Thread.sleep(3000);
		
		monthDD.selectByValue("10");
		
		Thread.sleep(3000);
		
		monthDD.selectByVisibleText("Aug");
	
	}

}
