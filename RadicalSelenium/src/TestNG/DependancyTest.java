package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyTest {
	@Test
	public void Start(){
		
		Assert.assertEquals(12, 13);
		System.out.println("Start App");
	}

	@Test(dependsOnMethods="Start")
	public void login(){
		System.out.println("Login App");
	}

	@Test(dependsOnMethods="login")
	public void Logout(){
		System.out.println("Logout App");
	}

}
