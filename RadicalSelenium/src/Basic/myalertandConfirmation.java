package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myalertandConfirmation {
	@Test
	public void test() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	Thread.sleep(4000);
	
	//Alert 
	
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Thread.sleep(1000);
	Alert alertobj= driver.switchTo().alert();
	String alrtMsg = alertobj.getText();
	System.out.println("message ="+ alrtMsg);
	Assert.assertEquals(alrtMsg, "I am an alert box!");
	alertobj.accept();
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
	Thread.sleep(4000);
	Alert alertobj1= driver.switchTo().alert();
	String alrtMsg1 = alertobj1.getText();
	System.out.println(alrtMsg1);
	System.out.println("message ="+ alrtMsg1);
	Assert.assertEquals(alrtMsg1, "Press a Button !");
	alertobj1.dismiss();
	

}
}
