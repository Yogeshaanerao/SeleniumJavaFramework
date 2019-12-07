package TestNGAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertCemo {
	
	@Test
	public void test1(){
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test1 start");
		assertion.assertEquals(12, 13);
		System.out.println("Test1 Completed");
		assertion.assertAll();
	}
	
	@Test
	public void test2(){
		
		System.out.println("Test2 start");
		Assert.assertEquals(12, 13);
		System.out.println("Test2 Completed");
		

}
}
