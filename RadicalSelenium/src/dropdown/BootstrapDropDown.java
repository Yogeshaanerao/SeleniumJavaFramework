package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropDown {
	
	@Test
	public void selectDDvalues() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
		Thread.sleep(3000);
		
		List<WebElement> Values =driver.findElements(By.xpath("//ul[@role='menu']//li/a"));
		
		for(WebElement ele:Values)
		{
			String name =ele.getAttribute("innerHTML");
			System.out.println("inner HTML "+name);
		}

}
}