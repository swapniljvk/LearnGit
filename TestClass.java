package Day_20_IRetryAnalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test (retryAnalyzer= Day_20_IRetryAnalyser.RetryAnalyser.class)
		
		public void m1() {
			System.out.println("i am in m1 method");
            Assert.assertTrue(true);
}
	@Test (retryAnalyzer= Day_20_IRetryAnalyser.RetryAnalyser.class)
	
	public void m2() {
		System.out.println("i am in m2 method");
        Assert.assertTrue(false);
	}
	
}
	

