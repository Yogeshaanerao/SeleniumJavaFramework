package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Myfirstseleniumscriptfirefox {
	
	@Test
	public void myFirstScriptFF() throws InterruptedException{
		System.out.println("yogesh");
		
		System.setProperty("webdriver.gecko.driver", "D:\\RadicalSoftware\\WEB BROWSER\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		
		driver.findElement(By.xpath("//div/ul/li/a[@title='Get help with Selenium']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[@id='menu_projects']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[@id='menu_download']/a")).click();
		Thread.sleep(2000);
		
		boolean result =true;
		String msg = "  ";
		try{
			driver.findElement(By.xpath("//div/ul/li/a[@id='menu_documentation1_']/a"));
		}catch(Exception e){
			msg = msg + "documentation1 tab missing";
			System.out.println("documentation1 tab is missing");
			result = false;
		
		}
		try{
		driver.findElement(By.xpath("//div/ul/li/a[@id='menu_documentation1_']/a"));
		}catch(Exception e){
			msg = msg + "about1 tab missing";
			System.out.println("about1 tab is missing");
			result = false;
		}
		driver.findElement(By.id("q")).sendKeys("Selenium");
		
		Assert.assertTrue(result, msg);
	}

		
	}

