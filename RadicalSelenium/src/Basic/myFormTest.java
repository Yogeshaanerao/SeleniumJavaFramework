package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class myFormTest {
	
	@Test
	public void myFirstScriptFF() throws InterruptedException{
	
		System.setProperty("webdriver.gecko.driver", "D:\\RadicalSoftware\\WEB BROWSER\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//div/input[@placeholder=First Name]"));
	}

}


//----------------------------------------


