package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brokenlink {
	
@Test
	public void linktest() throws InterruptedException, IOException{
	
	System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("http://www.newtours.demoaut.com/");
	Thread.sleep(3000);
	List <WebElement> Link =driver.findElements(By.tagName("a"));
	
	System.out.println(Link.size());
	
      for(int i=0;i<Link.size();i++){
    	 WebElement ele = Link.get(i);
    	String url= ele.getAttribute("href");
    	
    	URL link = new URL(url);
    	
    	
   	 HttpURLConnection httpcon =(HttpURLConnection) link.openConnection();
    	httpcon.setConnectTimeout(2000);
    	
    	httpcon.connect();
    	
    	if(httpcon.getResponseCode()>=400){
    		System.out.println(url+" is broken");
    	}
    	else{
    		System.out.println(url+" is valid");
    		
    	}
    	
    	
    	
    	
    	
    	  
    	  
      }
		
	}


}
	

