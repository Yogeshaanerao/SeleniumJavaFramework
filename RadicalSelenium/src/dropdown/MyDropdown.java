package dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyDropdown {
	
	@Test
	public void TestDropdown(){
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select sel = new Select(element);
		
		sel.selectByVisibleText("Android");
		
		List<WebElement> options=sel.getOptions();
		System.out.println(options.size());
		
		System.out.println("=================");
		
		for (WebElement webElement : options) {
			
			System.out.println(webElement.getText());
			
		}
		
		
	}

}
