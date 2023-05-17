package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DesktopSteps {
    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String value) throws InterruptedException {
        new HomePage().selectCurrency("£Pound Sterling");
    }

    @And("^I mouse Hover On Desktops Link And Click$")
    public void iMouseHoverOnDesktopsLinkAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("^I select menu option \"([^\"]*)\"$")
    public void iSelectMenuOption(String option) throws InterruptedException {
        new HomePage().selectMenu(option);
    }

    @And("^I select Sort By Option \"([^\"]*)\"$")
    public void iSelectSortByOption(String arg0)  throws InterruptedException {

    }

    @Then("^I Verify all products sorted in Z-A order$")
    public void iVerifyAllProductsSortedInZAOrder() {
    }

    @And("^I select Product By Name \"([^\"]*)\"$")
    public void iSelectProductByName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I Verify the \"([^\"]*)\" product message$")
    public void iVerifyTheProductMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iSelectDate(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter quantity \"([^\"]*)\"$")
    public void iEnterQuantity(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click On Add To CartButton$")
    public void iClickOnAddToCartButton() {
    }

    @Then("^I Verify \"([^\"]*)\" message$")
    public void iVerifyMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click On Shopping Cart Link Into Message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
    }

    @Then("^I Verify \"([^\"]*)\" message on cart page$")
    public void iVerifyMessageOnCartPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I match product name \"([^\"]*)\"$")
    public void iMatchProductName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I verify delivery date  \"([^\"]*)\"$")
    public void iVerifyDeliveryDate(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I get the model name as \"([^\"]*)\"$")
    public void iGetTheModelNameAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I Verify the total price is \"([^\"]*)\"$")
    public void iVerifyTheTotalPriceIs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
