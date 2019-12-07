package Blablacar20.testcases.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.DynamicParameter;

import Blablacar20.POMlib.common.HomePage;
import Blablacar20.POMlib.common.LoginPage;

public class TestingProfileFuncationality {
	
	@Test
	public void testProfileInformationElements(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.blablacar.in/");
		LoginPage login= new LoginPage();
		login.login(driver, "myuserName", "myPwd");
		
	}
	
	@Test(dataProvider="UserDP")
	public void testFillProfilepersonalInformation(String p1,String p2){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.blablacar.in/");
		
		LoginPage login= new LoginPage();
		login.login(driver, p1, p2);
		
		HomePage home = new HomePage();
		home.selectValueFromDropdown();
	}
	
	@DataProvider(name="UserDP")
	public void getDataForUser(){
		
	}
	
	
	

}
