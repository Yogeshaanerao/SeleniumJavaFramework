package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookdropdown3 {
	
	@Test
	public void selectDDvalues() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement monthDropdown =driver.findElement(By.id("month"));
		
		Select monthDD= new Select(monthDropdown);
		
		List<WebElement> monthlist =monthDD.getOptions();
		
		int count = monthlist.size();
		System.out.println("toal month are "+count);
		
		for(WebElement name:monthlist)
		{
			String monthname=name.getText();
			System.out.println("monthName is "+monthname);
		}
		
		
		
	
	}

}
