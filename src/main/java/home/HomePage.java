package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {

/**
 * Page Object Design Pattern(POM)
 Syntax:

 @FindBy(how = How.CLASS_NAME, using = "classname")
 */

HomePage homePage;

@FindBy(how = How.CSS, using = webElementSearchBox)
public WebElement searchBox;

@FindBy(how = How.CSS, using = webElementSearchButton)
public WebElement searchButton;

@FindBy(how = How.XPATH, using = webElementSearchResult)
public WebElement searchResult;

@FindBy(how = How.XPATH, using = webElementTryPrime)
public WebElement tryPrime;

@FindBy(how = How.CSS, using = webElementHamburgerMenu)
public WebElement hamburgerMenu;

@FindBy(how = How.CSS , using = webElementAmazonMusic)
public WebElement amazonMusic;

@FindBy(how = How.XPATH, using = webElementAccountAndLists)
public WebElement accountAndLists;



//========================================================

//return type method
public WebElement enterTextInSearchField(){
    return searchBox;
}

public WebElement clickOnsearchButton(){
    return searchButton;
}


//Action method
public void doSearch(String keyword){
    searchBox.sendKeys(keyword);
    searchButton.click();
}

public void validateSearchResult(){
    String text = searchResult.getText();
    Assert.assertEquals(text,"\"iphone\"");
}

public void validateTryPrimeClickable(){
    tryPrime.click();
}

public void validateHamburberMenuClickable(){
    hamburgerMenu.click();
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals("Amazon.com: Online Shopping for " +
            "Electronics, Apparel, Computers, Books, DVDs & more",title);
}

public void selectValueFromAccountAndLists(){
    Select select = new Select(accountAndLists);
    select.selectByVisibleText("");
}





}
