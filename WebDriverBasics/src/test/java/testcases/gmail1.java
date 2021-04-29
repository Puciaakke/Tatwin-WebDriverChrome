package testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class gmail1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Chromedriver-v77\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ejfwo32892hf92");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String alertMessage= driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(alertMessage);
		
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}
}