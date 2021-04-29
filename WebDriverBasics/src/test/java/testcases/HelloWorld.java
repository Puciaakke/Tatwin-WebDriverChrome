package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver-v77\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://wikipedia.pl/");
		driver.findElement(By.name("search")).sendKeys("");
		driver.findElement(By.id("searchButton")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}

}
