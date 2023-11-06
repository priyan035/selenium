package com.batch7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
   public static void main(String[] args) {
	   
	   
	   System.setProperty("webdriver,chrome.driver", "C:\\Users\\91960\\eclipse-workspace\\selenium_new\\driver\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMI5ovBxf_s_wIVEpNmAh2s9gyVEAAYASAAEgK_NfD_BwE");
	   
	   
	   WebElement kids = driver.findElement(By.xpath("//a[@class='desktop-main']"));
	   
	   kids.click();
	   
	  // WebElement allan = driver.findElement(By.xpath("//img[@class='image-image undefined image-hand']"));
	   
	//  allan.click();
	   
	   
	
}

}
