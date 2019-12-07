package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B18MySelectionList {
	
	
	@Test
	public void testList(){
		System.out.println("running script");
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		
		String contryList[] = {"Brazil", "China"};
		
		for (int i = 0; i < contryList.length; i++) {
			String conxpath = getContryXpath(contryList[i]);
			driver.findElement(By.xpath(conxpath)).click();
			driver.findElement(By.xpath("//div/ul/li/button[@title='To Right']/span[1]")).click();
		}
		
		boolean result = true;
		try{
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_RadListBoxDestination']/div/ul/li[text()='China']"));
		}catch(Exception e){
			result = false;
		}
		
		Assert.assertTrue(result);
	}
	
	private String getContryXpath(String myContryName){
		return "//div/ul/li[text()='"+myContryName+"']";
	}
	
	

}
