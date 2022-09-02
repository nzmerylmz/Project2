package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _01_CreateAccountSteps {

    DialogContent dc = new DialogContent();

//    @When("Enter username and password and click login button")
//    public void enter_username_and_password_and_click_login_button() {
//        dc.findAndSend("username","richfield.edu");
//        dc.findAndSend("password","Richfield2020!");
//        dc.findAndClick("loginButton");
//        dc.findAndClick("acceptCookiesButton");
//    }

    @Then("User should create an account successfully")
    public void user_should_login_successfully() {
        dc.findAndContainText("registrationMessage","Thank you");
    }

    @Given("Navigate to website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("User clicks on create account button")
    public void userClicksOnCreateAccountButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("Enter registration info")
    public void enterRegistrationInfo(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));

        }
    }

    @And("User click on create button")
    public void userClickOnCreateButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }
}
