package com.batch7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91960\\eclipse-workspace\\selenium_new\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		WebElement email = driver.findElement(By.className("a-form-label"));
		
		//System.out.println(email.getText());
		
		String text = email.getText();
		System.out.println(text);
		
	}
	



}
	
	
	