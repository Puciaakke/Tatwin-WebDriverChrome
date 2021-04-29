package pom;
 
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
 
public class PageObjects1 {
   
    //initialize objects in the page
    public PageObjects1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
   
    @FindBy(name = "q")
    public WebElement txtSearch;
    @FindBy(name = "btnK")
    public WebElement btnSearch;
    @FindBy(partialLinkText = "x-kom.pl - Sklep komputerowy")
    public WebElement lowcyClick;
   
    public void SearchGoogle(String searchText) {
        //search for text
        txtSearch.sendKeys(searchText);
        //click the search button - obejscie bo google ostatnio nie odpowiada na button
        //btnSearch.click();
        txtSearch.sendKeys(Keys.RETURN);
    }
//click the selected website
    public void ClickSite() {
        lowcyClick.click();
    }
}
 