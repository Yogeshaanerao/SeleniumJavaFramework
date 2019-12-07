package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyForm1test {
	
	@Test
	public void testForm() throws InterruptedException{
		
//		System.out.println("running script");
//		System.setProperty("webdriver.gecko.driver", 
//				"D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys("Jyoti");
		driver.findElement(By.xpath("//div/textarea[@ng-model='Adress']")).sendKeys("Pune");
		driver.findElement(By.xpath("//div/label/input[@value='Male']")).click();
		
		boolean actionOnChkbx = true;
		
		selectCheckbox("Movies", actionOnChkbx,  driver);
		selectCheckbox("Hockey", actionOnChkbx,  driver);
		
		
//		//Case 1 : selecting dropdown
//		driver.findElement(By.xpath("//div/select[@id='Skills']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div/select[@id='Skills']/option[text()='SQL']")).click();
		
//		//Case 2 
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div/select[@id='Skills']/option[text()='Android']")).click();
		
//		//case 3
//		WebElement ele = driver.findElement(By.xpath("//div/select[@id='Skills']"));
//		Select sel = new Select(ele);
//		sel.selectByVisibleText("Android");
		
		
	}
	
	
	public void selectCheckbox(String chkValue, boolean actionOnChkbx, WebDriver driver){
		boolean currentState = driver.findElement(By.xpath("//div/input[@value='"+chkValue+"']")).isSelected();
		if(actionOnChkbx){
			if(currentState){
				System.out.println("Already checked");
			}else{
				driver.findElement(By.xpath("//div/input[@value='"+chkValue+"']")).click();
			}
		}else{
			if(currentState){
				driver.findElement(By.xpath("//div/input[@value='"+chkValue+"']")).click();
			}else{
				System.out.println("Already unchecked");
			}
			
		}
	}
	
	
	
	
	
	

}

