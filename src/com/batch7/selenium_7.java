package com.batch7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_7 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91960\\eclipse-workspace\\selenium_new\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	     Thread.sleep(5000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		String pageSource = driver.getPageSource();
		
	//	System.out.println(pageSource);
		
		//driver.manage().window().minimize();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(4000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
	}

}
