package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Capturescreenshot {
	@Test
	public void screenshot() throws IOException{
	System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box'][@id='email']")).sendKeys("Yogesh");
	
	TakesScreenshot a= (TakesScreenshot)driver;

	File source = a.getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(source,new File("./Screenshots/facebook.png"));
	System.out.println("SCREENSHOT TAKEN");
	
	
}
}