package library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityScreenshot {
	
	
	public static void CaptureScreenshot(WebDriver driver,String screenshotname)
	{
		TakesScreenshot a= (TakesScreenshot)driver;

		File source = a.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(source,new File("./Screenshots/"+screenshotname +".png"));
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("SCREENSHOT TAKEN");
	}

}
