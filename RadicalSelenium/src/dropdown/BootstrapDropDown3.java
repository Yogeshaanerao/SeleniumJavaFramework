package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropDown3 {
	
	@Test
	public void SelectAll() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		
		driver.findElement(By.xpath("//button[@type='button'][@class='multiselect dropdown-toggle btn btn-default']")).click();
		Thread.sleep(3000);
		
		List<WebElement> Values =driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li/a"));
		System.out.println(Values.size());
		
		for(WebElement ele:Values)
		{
			
			System.out.println(ele.getText());
			ele.click();
		}

}
}