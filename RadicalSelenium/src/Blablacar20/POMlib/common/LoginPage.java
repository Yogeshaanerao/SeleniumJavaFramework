package Blablacar20.POMlib.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
	
	String userNameLoc = "//xpathofusername";
	String userPWDLoc = "//xpathofuserPWD";
	String OkBtnLoc = "//xpathofok";
	
	
	public void enterUserName(WebDriver driver, String uName){
		driver.findElement(By.xpath(userNameLoc)).sendKeys(uName);
	}
	
	public boolean  isUserNameTxtPresent(WebDriver driver){
		return driver.findElement(By.xpath(userNameLoc)).isDisplayed();
	}
	
	public boolean  isUserNameTxtEditable(WebDriver driver){
		return driver.findElement(By.xpath(userNameLoc)).isEnabled();
	}
	
	public void enterUserPWD(WebDriver driver,String uPwd){
		driver.findElement(By.xpath(userPWDLoc)).sendKeys(uPwd);
	}
	
	public boolean  isUserPWDTxtPresent(WebDriver driver){
		return driver.findElement(By.xpath(userPWDLoc)).isDisplayed();
	}
	
	public boolean  isUserPWDTxtEditable(WebDriver driver){
		return driver.findElement(By.xpath(userPWDLoc)).isEnabled();
	}
	
	
	public void clickOkBtn(WebDriver driver){
		driver.findElement(By.xpath(OkBtnLoc)).click();
	}
	
	
	
	public void login(WebDriver driver, String uName, String Upwd){
		enterUserName(driver, uName);
		enterUserPWD(driver, Upwd);
		
		clickOkBtn(driver);
		
	}
	
	

}
