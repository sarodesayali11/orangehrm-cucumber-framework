package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.DriverFactory;

public class LoginSteps {

    LoginPage loginPage;

    @Given("User launches browser")
    public void user_launches_browser() {

        DriverFactory.initDriver();
    }

    @When("User opens OrangeHRM application")
    public void user_opens_application() {

        DriverFactory.getDriver()
                .get("https://opensource-demo.orangehrmlive.com/");
    }

    @And("User enters username and password")
    public void user_enters_credentials() {

        loginPage = new LoginPage(DriverFactory.getDriver());

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
    }

    @And("User clicks login button")
    public void user_clicks_login() {

        loginPage.clickLogin();
    }

    @Then("User should navigate to dashboard page")
    public void user_navigate_dashboard() {

        String actualTitle =
                DriverFactory.getDriver().getTitle();

        Assert.assertEquals(actualTitle,
                "OrangeHRM");
    }
}