package multipleWindow;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindows {
	
	@Test 
	public void Windowhandlig() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(4000);
		String parent =driver.getWindowHandle();
		System.out.println("parent window is= "+parent);
		
		Set<String>  allwin =  driver.getWindowHandles();
		
		for (String Child : allwin) {
			
			if(!parent.equals(Child)){
				
				driver.switchTo().window(Child);
				
				System.out.println(driver.getTitle());
				
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
		
		
	}

}
