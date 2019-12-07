package Basic;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyDragAndDrop {
	
		@Test
		public void test() throws InterruptedException{

			System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver", "D:\\RadicalSoftware\\WEB BROWSER\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
			Thread.sleep(4000);
			WebElement draggable = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
			WebElement droppable = driver.findElement(By.xpath("//div[@class ='ui-widget-header ui-droppable']"));
			
			Actions act1 =new Actions(driver);
			act1.dragAndDrop(draggable, droppable).build().perform();
			
			
			
			
	}

}
