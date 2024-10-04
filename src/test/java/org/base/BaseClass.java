	package org.base;

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	// inheritance 
	// parent class
	// it contains all the common methods
	// used for reusing.
	public class BaseClass {

		public static WebDriver d;
		
		public static void LaunchBrowser() {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
			d.manage().window().maximize();
		}
		public static void LaunchBrowser2() {
			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver();
			d.manage().window().maximize();
		}

		public static void launchURl(String url) {
		d.get(url);
		}
		
		public static void passText(WebElement e , String str) {
			//search.sendKeys("Watches");
			e.sendKeys(str);
		}
		
		public static void ClickButton(WebElement e) {
			//btn.click();
			e.click();
		}
		
		public static void CloseBrowser() throws InterruptedException {
			Thread.sleep(500);
			d.quit();
		}
		
		public static void Title() {
			String title = d.getTitle();
			System.out.println(title);
		}
		
		public static void url() {
			String url = d.getCurrentUrl();
			System.out.println(url);
		}
		public static void windowhandle() {
		String parenthandle = d.getWindowHandle();
		System.out.println(parenthandle);
		}
		public static void keyaction() throws AWTException
		{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
}
		
		
		
	

