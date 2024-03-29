package keyworddriven;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import datadriven.ReadExcelSheet;

/**
 * Keyword driven framework
 * @author Anil
 *
 */

public class KeywordDrivenScript1 {
	
	String excelPath="D:\\IBM\\workspace\\RadicalSelenium1\\src\\keyworddriven\\loginDemo.xlsx";
	
	@Test
	public void loginFacebook() throws InvalidFormatException, IOException{
		System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		DataProcess proce;
		String[][] data =  getData();
		int len =data.length;
		for (int i = 0; i < data.length; i++) {
			String key =   data[i][0];
			String locType= data[i][1];
			String locValue = data[i][2];
			String param = data[i][3];
			//proce = new DataProcess(key, locType, locValue, param);
			proce = new DataProcess();
			proce.performAction(driver, key, locType, locValue,param);
		}
	}

	/*
	 * @Akale
	 */
	public String[][] getData() throws InvalidFormatException, IOException{
		
		ReadExcelSheet excelObj = new ReadExcelSheet(excelPath);
		int rowCount = excelObj.getRowCount(0);
		String[][] data = new String[rowCount+1][4];
		for(int i=0;i<=rowCount;i++ ){
			data[i][0]=excelObj.getCellData(0,i, 0);
			data[i][1]=excelObj.getCellData(0,i, 1);
			data[i][2]=excelObj.getCellData(0,i, 2);
			data[i][3]=excelObj.getCellData(0,i, 3);
		}
			
		return data;
		
	}

}
