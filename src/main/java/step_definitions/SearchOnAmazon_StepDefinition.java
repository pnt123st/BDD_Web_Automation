package step_definitions;

import common.WebAPI;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import home.AboutPage;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SearchOnAmazon_StepDefinition extends WebAPI {

    static HomePage homePage;
    static AboutPage aboutPage;

    public static void getInitElements(){
        homePage = PageFactory.initElements(driver,HomePage.class);
        aboutPage = PageFactory.initElements(driver, AboutPage.class);
    }


    @Given("I am at Amazon Home Page")
    public void i_am_at_Amazon_Home_Page() throws IOException {
        launchBrowser();

    }

    @And("I enter IPhone in search input field")
    public void i_enter_IPhone_in_search_input_field() {
        getInitElements();
        homePage.searchBox.sendKeys("iphone");
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
        getInitElements();
        homePage.searchButton.click();
    }

    @Then("I should see IPhone")
    public void i_should_see_IPhone() {
        getInitElements();
        homePage.validateSearchResult();
    }
}
