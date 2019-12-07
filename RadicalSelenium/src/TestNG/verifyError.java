package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyError {
	
	@Test
	public void error() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\RadicalSoftware\\WEB BROWSER\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();
		Thread.sleep(3000);
		
		String actualError =driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(actualError);
		String Error =driver.findElement(By.xpath("//div[@class='o6cuMc']")).getAttribute("innerHTML");
		System.out.println(Error);
		String Expectederror ="Enter an email or phone number";
		Assert.assertEquals(actualError, Expectederror);
		System.out.println("Test Complete");
		
	}

}
