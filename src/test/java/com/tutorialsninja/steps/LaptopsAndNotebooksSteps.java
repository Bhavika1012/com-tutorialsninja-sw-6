package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksSteps {
    @And("^I mouse Hover On Laptops And Notebooks Link And Click$")
    public void iMouseHoverOnLaptopsAndNotebooksLinkAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @Then("^I Verify all products sorted in Price \\(High > Low\\) order$")
    public void iVerifyAllProductsSortedInPriceHighLowOrder() {
        List<Double> originalProductsPrice = new LaptopsAndNotebooksPage().getProductsPriceList();
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        // Select sort by Price (High > Low)
        new LaptopsAndNotebooksPage().selectSortByOption("Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        ArrayList<Double> afterSortByPrice = new LaptopsAndNotebooksPage().getProductsPriceList();
        Assert.assertEquals(originalProductsPrice, afterSortByPrice, "Product not sorted by price High to Low");
    }

    @And("^I select Sort By Option \"([^\"]*)\" on Show AllLaptops & Notebooks page$")
    public void iSelectSortByOptionOnShowAllLaptopsNotebooksPage(String value) {
        new LaptopsAndNotebooksPage().selectSortByOption("Price (High > Low)");
    }

    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String product) {
        new LaptopsAndNotebooksPage().selectProductByName("MacBook");
    }


    @Then("^I Verify \"([^\"]*)\" as a product name on product page$")
    public void iVerifyAsAProductNameOnProductPage(String expectedMessage) {
        String actualMessage = new ProductPage().getProductText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("^I click On Add To Cart Button on  product page$")
    public void iClickOnAddToCartButtonOnProductPage() {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("^I Verify \"([^\"]*)\" message on product page$")
    public void iVerifyMessageOnProductPage(String expectedMessage) {
        String actualMessage = new ProductPage().getProductAddedSuccessMessage();
        String[] actualMsg = actualMessage.split("!");
        Assert.assertEquals(expectedMessage, actualMsg[0]);
    }

    @And("^I click On ShoppingCart Link Into Message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @Then("^I Verify \"([^\"]*)\" message on shopping cart page$")
    public void iVerifyMessageOnShoppingCartPage(String expectedMessage) {
        String actualMessage = new ShoppingCartPage().getShoppingCartText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("^I Verify product name \"([^\"]*)\" on shopping cart page$")
    public void iVerifyProductNameOnShoppingCartPage(String expectedMessage) {
        String actualMessage = new ShoppingCartPage().getProductName();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


    @And("^I change quantity to \"([^\"]*)\"$")
    public void iChangeQuantityTo(String qty) {
        new ShoppingCartPage().changeQuantity(qty);
    }

    @And("^I click On quantity Update Button$")
    public void iClickOnQuantityUpdateButton() {
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }

    @Then("^I Verify  success \"([^\"]*)\" message on shopping cart page$")
    public void iVerifySuccessMessageOnShoppingCartPage(String expectedMessage) {
        String actualMessage = new ShoppingCartPage().getSuccessModifiedMessage();
        String[] actualMsg = actualMessage.split("!");
        Assert.assertEquals(expectedMessage, actualMsg[0]);
    }

    @Then("^I Verify total price is \"([^\"]*)\" on shopping cart page$")
    public void iVerifyTotalPriceIsOnShoppingCartPage(String expectedMessage) {
        String actualMessage = new ShoppingCartPage().getTotal();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
