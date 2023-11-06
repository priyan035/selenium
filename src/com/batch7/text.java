package com.batch7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91960\\eclipse-workspace\\selenium_new\\driver\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			//text-----
			   //1.linked text
			   //2.partiallink text
			
			
	driver.findElement(By.linkText("Mobiles")).click();
	
	
	
	
}}
