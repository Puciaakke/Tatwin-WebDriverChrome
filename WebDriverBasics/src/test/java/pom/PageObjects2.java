package pom;
 
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
 
public class PageObjects2 {
   
 
   
    //initialize objects in the page
    public PageObjects2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//i[@class='fontello fontello-minimize-size icon-user']")
    public WebElement login;
    @FindBy (xpath = "//input[@placeholder='Login lub e-mail']")
    public WebElement username;
    @FindBy (xpath = "//input[@placeholder='Hasło']")
    public WebElement password;
    @FindBy (xpath = "//button[contains(@class,'button button-big button-wide')]")
    public WebElement zaloguj;
    @FindBy(xpath = "//div[@class='alert alert-dismissible alert-warning']")
    public WebElement info;
    @FindBy(xpath = "//i[@class='fontello fontello-minimize-size icon-phone-big']")
    public WebElement pomoc;
    @FindBy(xpath = "//input[@placeholder='Czego szukasz?']")
    public WebElement darmo;
    @FindBy(xpath = "//img[@class='img-logo']")
    public WebElement powrot;
   
    //enter login data
    public void login(String LoginData) throws InterruptedException {
        login.click();
        Thread.sleep(2000);
        username.click();
        username.sendKeys(LoginData);
       
 
       
    }
   
    //enter password data and try to login and display the result
    public void password(String Password) throws InterruptedException
    {
        password.sendKeys(Password);
        zaloguj.click();
        Thread.sleep(2000);
        String alertMessage= info.getText();
        System.out.println(alertMessage);
    }
    //go to the forum website
    public void pomocclick() throws InterruptedException {
    	pomoc.click();
        Thread.sleep(2000);
        powrot.click();
    }
    //go to the darmowe subsite
    public void darmoweclick() throws InterruptedException {
        darmo.click();
        Thread.sleep(2000);
    }
    //go back to the main site
    public void powrot() throws InterruptedException {
        powrot.click();
        Thread.sleep(2000);
    }
}