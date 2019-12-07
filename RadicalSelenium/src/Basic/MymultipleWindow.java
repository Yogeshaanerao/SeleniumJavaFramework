package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MymultipleWindow {
	
	@Test
	public void test() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-updated");
	Thread.sleep(4000);
	String s= driver.getWindowHandle();
	System.out.println(s);
	driver.findElement(By.xpath("//a[@class='fbbtnl']/span[text()='Login with Facebook']")).click();
	Thread.sleep(4000);

	Set<String> allwins = driver.getWindowHandles();
	String childwin = null;
	for(String win : allwins){
		if(!s.equals(win)){
			childwin=win;
		}
	}
	driver.switchTo().window(childwin);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Emailid");
	//driver.close();
	driver.switchTo().window(s);
	String title = driver.getTitle();
	System.out.println("Title"+title);
	driver.close();
	
	
	
	
	
	
	
}
}