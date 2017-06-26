package iappsqainterview;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class StringProblemTest {
	

	@Test(dataProvider = "getData")
	public static void testStringProblem(String str,char ch,String expectedVal) {
		String actualResult = StringProblem.removeCharFromString(str,ch);
		Assert.assertEquals(actualResult, expectedVal);
	}
	
	@Test(dataProvider = "getData")
	public static void testStringProblem1(String str,char ch,String expectedVal) {
		String actualResult = StringProblem.removeCharFromString1(str,ch);
		Assert.assertEquals(actualResult, expectedVal);
	}
	
	@DataProvider(name = "getData")
	public static Object[][] getData() {
		
		return new Object[][] {
			{"Anitha",'a',"Anith"},
			{"Murthy",'x',"Murthy"},
			{"nnnnnnn",'n',""},
			{null,'x',null},
			{"xabcdx",'x',"abcd"},
		};
		
		
	}
}


