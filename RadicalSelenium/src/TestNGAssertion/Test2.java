package TestNGAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void asserttrue(){
		String str = "Yogesh Aanerao";
		Assert.assertTrue(str.contains("Yogesh"));
				
	}

	@Test
		public void asserttrue2(){
			String str = "Yogesh Aanerao";
			Assert.assertTrue(str.contains("yogesh"));
					
		}
}

