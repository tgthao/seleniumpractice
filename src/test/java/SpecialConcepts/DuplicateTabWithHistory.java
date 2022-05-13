package SpecialConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateTabWithHistory {
	
	@Test
	public void doActions() throws AWTException, InterruptedException {
		// Setup browser
		WebDriverManager.chromedriver().setup();
		// Adding .crx file
		ChromeOptions chromeOptions = new ChromeOptions();
		String fileURL = System.getProperty("user.dir");
		chromeOptions.addExtensions(new File(fileURL + "/src/test/resources/extensions/Duplicate Tab Shortcut.crx"));
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		// Loading some URLs
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.get("http://google.com/");
		driver.get("http://facebook.com/");
		
		// One Way 
		/*
		 * Actions action_chains = new Actions(driver);
		 * action_chains.keyDown(Keys.ALT).keyDown(Keys.SHIFT).sendKeys("d").build().
		 * perform(); action_chains.keyUp(Keys.ALT).keyUp(Keys.SHIFT).build().perform();
		 */
		
		// Another way - Press ALT + SHIFT + D
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_ALT);
		
		// Wait till another duplicate is opened 
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.numberOfWindowsToBe(2));
		
		// Let's Switch to new tab and navigate back and forward
		driver.switchTo().window(driver.getWindowHandles().stream().skip(1).findFirst().get());
		
		// Verifying history is retained
		driver.navigate().back();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleIs("Google"));
		System.out.println("Title is : "+ driver.getTitle());
		driver.navigate().back();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleIs("Login - My Store"));
		System.out.println("Title is : "+ driver.getTitle());
		
		// Loading a new URL
		driver.get("http://www.makeseleniumeasy.com");
		System.out.println("Title is : "+ driver.getTitle());
		
		driver.quit();
				
	}

}
