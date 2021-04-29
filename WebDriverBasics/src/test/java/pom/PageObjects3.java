package pom;
 
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
 
public class PageObjects3 {
   
 
   
    //initialize objects in the page
    public PageObjects3(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(@class,'button button-big button-wide')]")
    public WebElement login;
    @FindBy (xpath = "//div[@id='lightbox-login']//input[@id='username']")
    public WebElement username;
    @FindBy (xpath = "//h2[contains(text(),'cy strza')]")
    public WebElement password;
    @FindBy (xpath = "//span[contains(text(),'Specyfikacja')]")
    public WebElement zaloguj;
    @FindBy(xpath = "//i[@class='fontello fontello-minimize-size icon-menu']")
    public WebElement wroc;
    @FindBy(xpath = "//li[@class='nav-item-1']//a[contains(text(),'i tablety')]")
    public WebElement szukaj;
    @FindBy(xpath = "//span[contains(text(),'Opis')]")
    public WebElement szukajclick;
    @FindBy(xpath = "//div[@class='w186th-1 ccXkzw sc-3umcdi-1 hAIOqo sc-1hinyvh-0 dDzpUO']//span[@class='Select-arrow']")
    public WebElement pierwszywynik;
    @FindBy(xpath = "//p[contains(text(),'Liczba postów:')]")
    public WebElement Statystyki;
   
    public void wroc() throws InterruptedException {
        wroc.click();
        Thread.sleep(1000);
        szukaj.click();
    }
    
    //search for desired word and display topic with it
    public void search(String Search) throws InterruptedException{
        password.click();
        szukajclick.click();
        zaloguj.click();
        Thread.sleep(1000);
    }
    //check and display statistics
    public void stats() throws InterruptedException{
        String Stats= Statystyki.getText();
        System.out.println(Stats); 
    }
}