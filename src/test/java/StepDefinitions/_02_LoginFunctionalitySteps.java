package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _02_LoginFunctionalitySteps {

    DialogContent dc = new DialogContent();
    @And("User click on sign in button")
    public void userClickOnSignInButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @When("User enter valid login credentials")
    public void userEnterValidLoginCredentials(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndContainText("successfulLoginMessage","Welcome");
    }
}
