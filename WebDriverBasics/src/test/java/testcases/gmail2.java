package testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Chromedriver-v77\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ejfwo32892hf92");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement error;
		error= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[@class='o6cuMc']")));
		String alertMessage= driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(alertMessage);
		
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}
}