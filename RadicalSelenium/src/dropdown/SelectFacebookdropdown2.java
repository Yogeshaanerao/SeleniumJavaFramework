package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookdropdown2 {
	
	@Test
	public void selectDDvalues() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement monthDropdown =driver.findElement(By.id("month"));
		
		Select monthDD= new Select(monthDropdown);
		
		WebElement value1 =monthDD.getFirstSelectedOption();
		System.out.println("BeforeSelection"+value1.getText());
		
		monthDD.selectByIndex(3);
		
		WebElement value2 =monthDD.getFirstSelectedOption();
		System.out.println("AfterSelection"+value2.getText());
		
	
	}

}
