package Waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpliciteWait {

	@Test
	public void explicitewait(){
		

		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement element =driver.findElement(By.xpath("//p[Text()='Webdriver']"));
		
		boolean status = element.isDisplayed();
		
		if(status){
			System.out.println("element is displayed");
		
		}
		else
		{
			System.out.println("element is not displayed");
		}
		
	}
}
