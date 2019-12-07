package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B20MyTable {
	
	
	@Test
	public void testTableValues() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds/liquid");
		Thread.sleep(5000);
		
		B20TableLib tLib = new B20TableLib();
		String v1 = tLib.getCellValue(driver, "Company", "Returns(%)", "SBI Funds Management Pvt. Ltd.");
		String typeValue = tLib.getCellValue(driver, "Company", "Type", "SBI Funds Management Pvt. Ltd.");
		System.out.println(typeValue);
		//String planValue = tLib.getCellValue(driver, "Company", "Plan", "Reliance Nippon Life Asset Management Ltd.");
		
		
		Assert.assertEquals("8.53", v1);
			
		
		
			
		
		
		

}
}