package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropDown2 {
	
	@Test
	public void selectDDvalues() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		
		driver.findElement(By.xpath("//button[@class='btn btn-warning dropdown-toggle']")).click();
		Thread.sleep(3000);
		
		List<WebElement> Values =driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		System.out.println(Values.size());
		
		for(WebElement ele:Values)
		{
			//String name =ele.getAttribute("innerHTML");
			//System.out.println("inner HTML "+name);
			System.out.println(ele.getText());
			
		}

}
}