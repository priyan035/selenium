package com.batch7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {
	
	public static void main(String[] args) {
		
		 
		   System.setProperty("webdriver,chrome.driver", "C:\\Users\\91960\\eclipse-workspace\\selenium_new\\driver\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		
		   driver.get("https://adactinhotelapp.com/");
		   
		   WebElement findElement = driver.findElement(By.id("location"));
		
		   Select s=new Select(findElement);
		   
		   List<WebElement> options = s.getOptions();
		   
		   int size = options.size();
		   
		   for (int i = 0; i <size; i++) {
			   
			   System.out.println(options);
			
		}
		   
		   System.out.println(size);
		
		
		
		
		
		
		
		
	}

}
