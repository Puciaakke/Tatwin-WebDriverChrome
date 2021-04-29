package pom;
 
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class Testpom {
  /*@Test
  public void TestMethod1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Chromedriver-v77\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=800,600");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("http://google.com");
        //Objects for the page
        PageObjects1 page = new PageObjects1(driver);
        PageObjects2 pag2 = new PageObjects2(driver);
       
        //search for the specified text
        page.SearchGoogle("x-kom");
        //click the link
        page.ClickSite();
        //wait for the site to load
        Thread.sleep(2000);
        //click login and write "admin" into the fields
        pag2.login("admin1");
        pag2.password("-1admin");
        driver.close();
  }
  @Test
  public void TestMethod2() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Chromedriver-v77\\chromedriver.exe");
      ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=800,600");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("http://google.com");
        //Objects for the page
        PageObjects1 page = new PageObjects1(driver);
        PageObjects2 pag2 = new PageObjects2(driver);
       
        //search for the specified text
        page.SearchGoogle("x-kom");
        //click the link
        page.ClickSite();
        //wait for the site to load
        Thread.sleep(2000);
        //go to the forum
        pag2.pomocclick();
        driver.close();
  }
  @Test
  public void TestMethod3() throws InterruptedException{
      System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Chromedriver-v77\\chromedriver.exe");
      ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=800,600");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("http://google.com");
        //Objects for the page
        PageObjects1 page = new PageObjects1(driver);
        PageObjects2 pag2 = new PageObjects2(driver);
        PageObjects3 pag3 = new PageObjects3(driver);
       
        //search for the specified text
        page.SearchGoogle("x-kom");
        //click the link
        page.ClickSite();
        //wait for the site to load
        Thread.sleep(2000);
        //enter defined words into login fields and try to login
        pag3.wroc();
        driver.close();
  }*/
  @Test
  public void TestMethod4() throws InterruptedException{
  System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Chromedriver-v90\\chromedriver.exe");
  ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--window-size=1920,1080");
    WebDriver driver = new ChromeDriver(chromeOptions);
    driver.navigate().to("http://google.com");
    //Objects for the page
    PageObjects1 page = new PageObjects1(driver);
    PageObjects2 pag2 = new PageObjects2(driver);
    PageObjects3 pag3 = new PageObjects3(driver);
    driver.findElement(By.id("zV9nZe")).click();
    //search for the specified text
    page.SearchGoogle("x-kom");
    //click the link
    page.ClickSite();
    //wait for the site to load
    Thread.sleep(2000);
    //search for specified text and display topic of the first result
    pag3.search("laptopy");
    driver.close();
  }}/*
  @Test
  public void TestMethod5() throws InterruptedException{
      System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Chromedriver-v77\\chromedriver.exe");
      ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=800,600");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("http://google.com");
        //Objects for the page
        PageObjects1 page = new PageObjects1(driver);
        PageObjects2 pag2 = new PageObjects2(driver);
        PageObjects3 pag3 = new PageObjects3(driver);
       
        //search for the specified text
        page.SearchGoogle("x-kom");
        //click the link
        page.ClickSite();
        //wait for the site to load
        Thread.sleep(2000);
        //enter the darmowe subpage
        pag2.darmoweclick();
        //go back to the main site
        pag2.powrot();
        //go to the forum
        pag2.pomocclick();
        //display statistics of the forum
        pag3.stats();
        driver.close();
  }
}
*/