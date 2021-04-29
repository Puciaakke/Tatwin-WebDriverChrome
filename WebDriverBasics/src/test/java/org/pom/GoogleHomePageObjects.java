package org.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {
	
	
	public GoogleHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}

	
	
	@FindBy(name="q")
	public static WebElement txtSearch;
	
	@FindBy(name="btnG")
	public static WebElement btnSearch;
	
	@FindBy(partialLinkText="Łowcy Gier - Strona dla oszczędnych graczy")
	public WebElement lnkyt;
	
	public static void SearchGoogle(String searchText) {
		txtSearch.sendKeys(searchText);
		
		btnSearch.sendKeys(Keys.RETURN);
		
	}

	public void ClickLink()
	{
		lnkyt.click();
	}
}
