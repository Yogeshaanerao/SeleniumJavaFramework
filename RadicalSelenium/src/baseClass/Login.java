package baseClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Base
{
    @Test
	public void logintoapplication(){
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	
}
