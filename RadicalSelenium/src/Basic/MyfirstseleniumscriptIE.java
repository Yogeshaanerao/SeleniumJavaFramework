package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MyfirstseleniumscriptIE {
	
	@Test
	public void myFirstScriptFF1(){
		System.out.println("yogesh");
		
		System.setProperty("webdriver.ie.driver","D:\\RadicalSoftware\\WEB BROWSER\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com");
	}

}
