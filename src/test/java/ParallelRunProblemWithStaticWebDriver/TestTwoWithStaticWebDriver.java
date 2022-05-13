package ParallelRunProblemWithStaticWebDriver;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTwoWithStaticWebDriver {
private WebDriver driver;
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		driver = WebDriverFactoryStatic.getInstance().getDriver();
		System.out.println("Browser setup by Thread "+Thread.currentThread().getId()+" and Driver reference is : "+WebDriverFactoryStatic.driver);
	}
	

	@Test
	public void FlipkartTest(Method m) throws InterruptedException
	{
		System.out.println(m.getName()+" of class TestOneWithStaticWebDriver Executed by Thread "+Thread.currentThread().getId()+" on driver reference "+WebDriverFactoryStatic.driver);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(15000);
		System.out.println("Title printed by Thread "+Thread.currentThread().getId()+driver.getTitle()+" on driver reference "+WebDriverFactoryStatic.driver);
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void MyntraTest(Method m) throws InterruptedException
	{
		System.out.println(m.getName()+" of class TestOneWithStaticWebDriver Executed by Thread "+Thread.currentThread().getId()+" on driver reference "+WebDriverFactoryStatic.driver);
		driver.get("https://www.myntra.com/");
		Thread.sleep(15000);
		System.out.println("Title printed by Thread "+Thread.currentThread().getId()+" - "+driver.getTitle()+" on driver reference "+WebDriverFactoryStatic.driver);
		driver.manage().deleteAllCookies();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Browser closed by Thread "+Thread.currentThread().getId() + " and Closing driver reference is :"+WebDriverFactoryStatic.driver);
		WebDriverFactoryStatic.removeDriver();
	}
}
