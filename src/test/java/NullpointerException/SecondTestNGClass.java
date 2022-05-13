package NullpointerException;

import org.testng.annotations.Test;

public class SecondTestNGClass extends Setup {
	
	@Test
	public void firstMethodOfSecondTestNGClass()
	{
		System.out.println("Executing firstMethodOfSecondTestNGClass...");
		System.out.println("Value of someVariable is : "+ someVariable);
	}
	
	@Test
	public void secondMethodOfSecondTestNGClass()
	{
		System.out.println("Executing secondMethodOfSecondTestNGClass...");
		System.out.println("Value of someVariable is : "+ someVariable);
	}
}
