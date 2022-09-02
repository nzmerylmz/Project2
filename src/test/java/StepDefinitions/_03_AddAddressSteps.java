package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _03_AddAddressSteps {
    DialogContent dc = new DialogContent();
    @And("User goes to my account page")
    public void userGoesToMyAccountPage(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User clicks on address book and add new address")
    public void userClicksOnAddressBook(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @When("User enter valid address info")
    public void userEnterValidAddressInfo(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @Then("User should add an address successfully")
    public void userShouldAddAnAddressSuccessfully() {
        dc.findAndContainText("saveAddressSuccessMessage","saved");
    }

    @And("User chooses state")
    public void userChoosesState(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User enters zipCode")
    public void userEntersZipCode(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @When("User clicks on save button")
    public void userClicksOnSaveButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }
}
