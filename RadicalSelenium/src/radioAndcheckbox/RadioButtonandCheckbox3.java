package radioAndcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonandCheckbox3 {
	
	@Test
	public void radiocheckBox(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
		
		
		for(int i=0;i<radio.size();i++){
			WebElement X=radio.get(i);
		String value = X.getAttribute("Value");
		if(value.equalsIgnoreCase("RUBY"))
		{
			X.click();
		}
		
	System.out.println(value);
		
		
		
		}
		
	}
}


