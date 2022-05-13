package ParallelRunProblemWithStaticWebDriver;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOneWithStaticWebDriver{
	private WebDriver driver;


	@BeforeClass
	public void setUp()
	{
		driver = WebDriverFactoryStatic.getInstance().getDriver();
		System.out.println("Browser setup by Thread "+Thread.currentThread().getId()+" and Driver reference is : "+driver);
	}

	@Test
	public void GoogleTest(Method m) throws InterruptedException
	{
		System.out.println(m.getName()+" of class TestOneWithStaticWebDriver Executed by Thread "+Thread.currentThread().getId()+" on driver reference "+WebDriverFactoryStatic.driver);
		driver.get("https://www.google.com/");
		Thread.sleep(15000);
		System.out.println("Title printed by Thread "+Thread.currentThread().getId()+" - "+driver.getTitle()+" on driver reference "+WebDriverFactoryStatic.driver);
		driver.manage().deleteAllCookies();
	}
	@Test
	public void FacebookTest(Method m) throws InterruptedException
	{
		System.out.println(m.getName()+" of class TestOneWithStaticWebDriver Executed by Thread "+Thread.currentThread().getId()+" on driver reference "+WebDriverFactoryStatic.driver);
		driver.get("https://www.facebook.com/");
		Thread.sleep(15000);
		System.out.println("Title printed by Thread "+Thread.currentThread().getId()+" - "+ driver.getTitle()+" on driver reference "+WebDriverFactoryStatic.driver);
		driver.manage().deleteAllCookies();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		WebDriverFactoryStatic.removeDriver();
	}
}
