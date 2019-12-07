package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class myDropdown2 {
	
	@Test
	public void multiselect() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
	WebElement element=	driver.findElement(By.xpath("//Select[@name='cars']"));
		Select Sel = new Select(element);
		
	Sel.selectByIndex(0);
	Sel.selectByValue("saab");
	Sel.selectByVisibleText("Audi");
	
	Thread.sleep(3000);
	Sel.deselectByIndex(0);
	
	List<WebElement> selected=Sel.getAllSelectedOptions();
	
	for (WebElement webElement : selected) {
		
		System.out.println("selected " +webElement.getText());
		
		
	}

	List<WebElement> options=Sel.getOptions();
	for (WebElement webElement : options) {
		System.out.println(webElement.getText());
		
	}
	
	
	
	
	}

}
