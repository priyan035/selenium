package com.batch7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Passp {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91960\\eclipse-workspace\\selenium_new\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement office = driver.findElement(By.xpath("//select[@name='dcdrLocation']"));
		Select tt = new Select(office);
		tt.selectByIndex(4);
	}
	

}
