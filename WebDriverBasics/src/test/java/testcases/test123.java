 
package testcases;
 
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.io.*;

 
 
public class test123 {
  @Test
  public void TestMethod1() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Chromedriver-v78\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://expedia.com");
        //loty
        driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
        Thread.sleep(2000);
        //loty
        driver.findElement(By.xpath("//label[@id='flight-type-one-way-label-hp-flight']")).click();
        //skad
        driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']")).sendKeys("Warszawa");
        Thread.sleep(2000);
        //dokad
        driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).sendKeys("Gdańsk");
        //1 lot
        driver.findElement(By.xpath("//input[@id='flight-departing-single-hp-flight']")).click();
        Thread.sleep(2000);
        //data
        driver.findElement(By.xpath("//div[@class='datepicker-cal']//div[2]//table[1]//tbody[1]//tr[4]//td[7]//button[1]")).click();
        //ilosc osob
        driver.findElement(By.xpath("//div[@id='traveler-selector-hp-flight']//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[@class='traveler-selector-sinlge-room-data traveler-selector-room-data']//div[@class='children-wrapper']//div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']//button[@class='uitk-step-input-button uitk-step-input-plus']//*[@class='uitk-icon-svg uitk-step-input-icon']")).click();
        //Thread.sleep(2000);
        //dorosli
        driver.findElement(By.xpath("//body[@class='wrap cf aoa-enabled']/meso-native-marquee/section[@id='WizardHero']/div[@id='hero-banner']/div[@class='hero-banner-gradient native-marquee']/div[@class='cols-row hero-banner-inner']/section[@id='wizardSection']/div[@class='hero-banner-box siteId-1 cf hideClassicDcol']/div[@id='wizard-tabs']/div[@class='tabs-container col']/section[@id='section-flight-tab-hp']/form[@id='gcw-flights-form-hp-flight']/fieldset[@class='room-data']/div[@class='cols-nested']/div[@class='ab25184-traveler-wrapper-flight available-for-flights gcw-clear-both']/div[@id='traveler-selector-hp-flight']/div[@class='menu-bar gcw-travel-selector-wrapper']/ul[@class='menu-bar-inner']/li[@class='open']/div[@class='menu sticky gcw-menu']/div[@class='menu-main']/div[@class='traveler-selector-sinlge-room-data traveler-selector-room-data']/div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']/div[@class='uitk-col all-col-shrink']/button[@class='uitk-step-input-button uitk-step-input-plus']/span[@class='uitk-icon']/*[1]")).click();
        //szukaj
        driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")).click();
       
  }
 
}