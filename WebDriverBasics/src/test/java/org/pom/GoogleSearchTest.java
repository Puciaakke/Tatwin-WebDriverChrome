package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;



public class GoogleSearchTest {
	
	

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\Chromedriver-v77\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.google.pl");
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		
		GoogleHomePageObjects.SearchGoogle("Lowcy gier");
		
		page.ClickLink();
	}

}
