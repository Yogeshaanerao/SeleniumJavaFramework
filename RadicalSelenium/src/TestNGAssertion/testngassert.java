package TestNGAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testngassert {
	
	@Test
	public void test(){
		
		Assert.assertEquals(13, 144,"Dropdown values not mathes");
		
	}

}
