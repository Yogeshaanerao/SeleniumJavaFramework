package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mySelectionList {
	
	@Test
	public void myselectionlist(){
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		
		driver.findElement(By.xpath("//div/ul/li[text()='Brazil']")).click();
		driver.findElement(By.xpath("//div/ul/li/button[@title='To Right']/span[1]")).click();
		
		driver.findElement(By.xpath("//div/ul/li[text()='China']")).click();
		driver.findElement(By.xpath("//div/ul/li/button[@title='To Right']/span[1]")).click();
		
		boolean result = true;
		try{
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_RadListBoxDestination']/div/ul[@class='rlbList']/li[text()='China']"));
		}catch (Exception e){
			result = false;
		}
		Assert.assertTrue(result);
		
	}

}
