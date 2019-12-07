package TestNG;

import org.testng.annotations.Test;

public class firstscript {
	
	@Test(priority=1,description="This will login")
	public void login()
	{
		System.out.println("login application");
	}
	
	@Test(priority=2,description="This will select item")
	public void selectitem()
	{
		System.out.println("item selected");
	}
	@Test(priority=3,description="This will checkout")
	public void checkout()
	{
		System.out.println("checkout completed ");
	}
}
