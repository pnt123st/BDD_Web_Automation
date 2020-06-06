package testhome;

import common.WebAPI;
import home.AboutPage;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    static HomePage homePage;
    static AboutPage aboutPage;

    //PageFactory get Init Elements method help us to get driver
    public static void getInitElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        aboutPage = PageFactory.initElements(driver, AboutPage.class);
    }
    //test call

    @Test
    public static void testSearcBox(){
        getInitElements();
        homePage.doSearch("iphone");
        homePage.validateSearchResult();
        //homePage.validateTryPrimeClickable();
    }
    @Test
    public static void testTryPrimeLinkClickable(){
        getInitElements();
        homePage.validateTryPrimeClickable();
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Amazon.com: Amazon Prime",title);
    }

    @Test
    public static void testHamburgerMenuClickable(){
        getInitElements();
        homePage.validateHamburberMenuClickable();
    }





}
