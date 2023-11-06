package com.batch7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91960\\eclipse-workspace\\selenium_new\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("priyan35@gmail.com");
		Thread.sleep(3000);
		WebElement passw = driver.findElement(By.xpath("//input[@name='pass']"));
		
		passw.sendKeys("12345678");
		
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		log.click();
		
		
		
	}
	
}
