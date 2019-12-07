package extentReport;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	static WebDriver driver;
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		ExtentHtmlReporter report = new ExtentHtmlReporter("extentreports.html");
		
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(report);
		
		ExtentTest test =extent.createTest("FirstTest", "Sampledescription");
		
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		test.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test.pass("Entered Rext in SearchBox");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@class='gNO89b']")).sendKeys(Keys.RETURN);
		test.pass("Pressed Enter key");
		
		
		driver.close();
		test.pass("Closed the browser");
		
		test.info("Test completed");
		
		extent.flush();
		
		
	}

}
