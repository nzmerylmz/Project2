package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _04_PurchaseFunctionality {

    DialogContent dc = new DialogContent();
    @Given("User chooses an item")
    public void userChoosesAnItem(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User chooses size and color and click on add button")
    public void userChoosesSizeAndColorAndClickOnAddButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User goes to shopping cart and proceed to checkout")
    public void userGoesToShoppingCartAndProceedToCheckout(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User prefers the shipping option and clicks on next")
    public void userPrefersTheShippingOptionAndClicksOnNext(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @When("User places the order")
    public void userPlacesTheOrder(DataTable elements) {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt='Loading...']")));
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            //System.out.println("list element = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @Then("User should see successfull purchase message")
    public void userShouldSeeSuccessfullPurchaseMessage() {
        dc.findAndContainText("successfullPurchaseMessage","purchase");
    }
}
