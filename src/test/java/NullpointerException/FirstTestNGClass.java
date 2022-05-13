package NullpointerException;

import org.testng.annotations.Test;

public class FirstTestNGClass extends Setup {
	
	@Test
	public void firstMethodOfFirstTestNGClass()
	{
		System.out.println("Executing firstMethodOfFirstTestNGClass...");
		System.out.println("Value of someVariable is : "+ someVariable);
	}
	
	@Test
	public void secondMethodOfFirstTestNGClass()
	{
		System.out.println("Executing secondMethodOfFirstTestNGClass...");
		System.out.println("Value of someVariable is : "+ someVariable);
	}
}
