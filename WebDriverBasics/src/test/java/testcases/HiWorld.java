package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver-v77\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.pl/");
		driver.findElement(By.name("q")).sendKeys("Hello webdriver |!|");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();;
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}

}
