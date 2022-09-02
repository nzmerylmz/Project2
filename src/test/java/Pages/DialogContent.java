package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    private WebElement createAccount;

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "email_address")
    private WebElement email_address;

    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "password-confirmation")
    private WebElement passwordConfirmation;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement createAccountButton;

    @FindBy(xpath = "//*[text()='Thank you for registering with Fake Online Clothing Store.']")
    private WebElement registrationMessage;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(xpath = "(//input[@id='pass'])[1]")
    private WebElement passwordInput;

    @FindBy(xpath = "(//button[@id='send2'])[1]")
    private WebElement signInButton;

    @FindBy(xpath = "(//span[contains(text(),'Welcome')])[1]")
    private WebElement successfulLoginMessage;

    @FindBy(xpath = "(//*[contains(text(),'Sign In ')])[1]")
    private WebElement homepageSignIn;

    @FindBy(xpath = "(//ul[@class='header links']//li)[2]")
    private WebElement homepageHeader;

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    private WebElement myAccount;

    @FindBy(xpath = "//a[text()='Address Book']")
    private WebElement addressBook;

    @FindBy(id = "telephone")
    private WebElement telephone;

    @FindBy(id = "street_1")
    private WebElement street;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "region_id")
    private WebElement region;

    @FindBy(xpath = "//option[@value='57']")
    private WebElement stateChoice;

    @FindBy(id = "zip")
    private WebElement zipCode;

    @FindBy(xpath = "//button[@data-action='save-address']")
    private WebElement saveAddressButton;

    @FindBy(css = "[class='message-success success message']")
    private WebElement saveAddressSuccessMessage;

    @FindBy(xpath = "//span[text()='Add New Address']")
    private WebElement addNewAddressButton;

    @FindBy(xpath = "//img[@class='product-image-photo']")
    private WebElement itemImage;

    @FindBy(xpath = "//div[@id='option-label-size-143-item-166']")
    private WebElement sizeOption;

    @FindBy(xpath = "//div[@option-label='Orange']")
    private WebElement colorOption;

    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[text()='shopping cart']")
    private WebElement shoppingCart;

    @FindBy(xpath = "(//button[@title='Proceed to Checkout'])[2]")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    private WebElement shippingOption;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement nextButton;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    private WebElement placeOrderButton;

    @FindBy(xpath = "//span[text()='Thank you for your purchase!']")
    private WebElement successfullPurchaseMessage;

    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement){
            case "firstName" : myElement=firstName; break;
            case "lastname" : myElement=lastname; break;
            case "email_address" : myElement=email_address; break;
            case "password" : myElement=password; break;
            case "passwordConfirmation" : myElement=passwordConfirmation; break;
            case "emailInput" : myElement=emailInput; break;
            case "passwordInput" : myElement=passwordInput; break;
            case "telephone" : myElement=telephone; break;
            case "street" : myElement=street; break;
            case "city" : myElement=city; break;
            case "region" : myElement=region; break;
            case "zipCode" : myElement=zipCode; break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick (String strElement){
        switch (strElement){
            case "createAccountButton" : myElement=createAccountButton; break;
            case "createAccount" : myElement=createAccount; break;
            case "signInButton" : myElement=signInButton; break;
            case "homepageSignIn" : myElement=homepageSignIn; break;
            case "homepageHeader" : myElement=homepageHeader; break;
            case "myAccount" : myElement=myAccount; break;
            case "addressBook" : myElement=addressBook; break;
            case "stateChoice" : myElement=stateChoice; break;
            case "saveAddressButton" : myElement=saveAddressButton; break;
            case "addNewAddressButton" : myElement=addNewAddressButton; break;
            case "itemImage" : myElement=itemImage; break;
            case "sizeOption" : myElement=sizeOption; break;
            case "colorOption" : myElement=colorOption; break;
            case "addToCartButton" : myElement=addToCartButton; break;
            case "shoppingCart" : myElement=shoppingCart; break;
            case "proceedToCheckoutButton" : myElement=proceedToCheckoutButton; break;
            case "shippingOption" : myElement=shippingOption; break;
            case "nextButton" : myElement=nextButton; break;
            case "placeOrderButton" : myElement=placeOrderButton; break;

        }
        clickFunction(myElement);
    }
    public void findAndContainText (String strElement, String value){
        switch (strElement){
            case "registrationMessage" : myElement=registrationMessage; break;
            case "successfulLoginMessage" : myElement=successfulLoginMessage; break;
            case "saveAddressSuccessMessage" : myElement=saveAddressSuccessMessage; break;
            case "successfullPurchaseMessage" : myElement=successfullPurchaseMessage; break;
        }
        verifyContainsText(myElement,value);
    }
//    public void searchAndDelete(String searchText){
//        findAndSend("searchInput",searchText);
//        findAndClick("searchButton");
//        //WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
//        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span[class='mat-button-wrapper'] mat-spinner")));
//        waitForElementToBeRefreshedAndClickable(GWD.getDriver(),By.xpath("//ms-search-button//button"));
//        findAndClick("deleteButton");
//        findAndClick("deleteDialogButton");
//    }


}
