package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myassignment {
	
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div/ul/li/a[@title='Get help with Selenium']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[@id='menu_projects']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[@id='menu_download']/a")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();

}
}
