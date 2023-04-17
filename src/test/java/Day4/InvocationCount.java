package Day4;

import org.testng.annotations.Test;

public class InvocationCount {
    
	@Test(invocationCount = 5)
	void test()
	{
		System.out.println("Testing....");
	}
	


}
