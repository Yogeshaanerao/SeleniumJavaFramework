package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myIframe {
	@Test
	public void test() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(4000);
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[@class='dt-mobile-menu-icon']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("IF2");
		String s  = driver.findElement(By.xpath("//ul/li/a[text()='Sortable']")).getText();
		System.out.println("sring is = "+s);
		
		
		driver.manage().window().maximize();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
	}
	

}
