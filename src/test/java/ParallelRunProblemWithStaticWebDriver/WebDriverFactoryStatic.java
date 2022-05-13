package ParallelRunProblemWithStaticWebDriver;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactoryStatic {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private static ThreadLocal<WebDriverFactoryStatic> webDriverFactoryStaticThreadLocal = new ThreadLocal<>();
	public WebDriverFactoryStatic(){
		System.out.println("Initalize driver by SingleTon");
	}
	public static  void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		System.out.println("Driver at Thread"+Thread.currentThread().getId()+"With Driver ID "+driver.get().toString());
	}
	public static WebDriverFactoryStatic getInstance() {
		if(webDriverFactoryStaticThreadLocal.get()==null){
			webDriverFactoryStaticThreadLocal.set(new WebDriverFactoryStatic());
			setDriver();
		}
		return webDriverFactoryStaticThreadLocal.get();
	}

	public  WebDriver getDriver() {
		return  driver.get();
	}
	public static void removeDriver(){
		driver.get().close();
		webDriverFactoryStaticThreadLocal.remove();
		driver.remove();
	}
}
