package Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myattachment {
	
	@Test
	public void test() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.freefileconvert.com/");
		Thread.sleep(4000);
    driver.findElement(By.xpath("//div[@class='form-group']//input[@id='first_file'][@name='input_files[]']")).click();
   // .sendKeys("D:\\RadicalSoftware\\Links_b10.txt");
    StringSelection ss=new StringSelection("C:\\Users\\Yogesh\\Desktop\\Links_b10.txt");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    Robot robot = new Robot();
    Thread.sleep(4000);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_V);
    
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    
    
    
}
}