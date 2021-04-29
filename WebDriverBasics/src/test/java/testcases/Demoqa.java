package testcases;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver-v77\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com");
		driver.findElement(By.xpath("//a[contains(text(),'Keyboard Events Sample Form')]")).click();
		driver.findElement(By.id("userName")).sendKeys("Wojciech");
		driver.findElement(By.id("currentAddress")).sendKeys("Koszalin");
		driver.findElement(By.id("permanentAddress")).sendKeys("Kobylnica");
		driver.findElement(By.id("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

}