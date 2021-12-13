package com.united.regression;

import com.united.tabs.mytripTab.My_Trip_Tab;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.net.CookieHandler;

public class My_trip_Regressioon_Test {
    @Given("click on my trips tab on header")
    public void clickOnMyTripsTabOnHeader() {
        My_Trip_Tab myTripTab = new My_Trip_Tab();
        myTripTab.getCheck_in_tab_button().click();
        Common.waitInSecond(3);



    }
    @Then("verify that there is a find your travel credit link")
    public void verifyThatThereIsAFindYourTravelCreditLink() {
        My_Trip_Tab myTripTab = new My_Trip_Tab();
        boolean displayed = myTripTab.getFind_your_travel_link().isDisplayed();
        Assert.assertTrue(displayed);

    }


    @And("click on search button in my trip tab")
    public void clickOnSearchButtonInMyTripTab() {
        My_Trip_Tab myTripTab = new My_Trip_Tab();
        myTripTab.getSearch_button().click();
        Common.waitInSecond(2);


    }

    @Then("verify that it shows error message when click")
    public void verifyThatItShowsErrorMessageWhenClick() {
        My_Trip_Tab myTripTab = new My_Trip_Tab();
        boolean displayed = myTripTab.getAlert_message().isDisplayed();
        Assert.assertTrue(displayed);


    }

    @Then("verify that sign in link is displayed")
    public void verifyThatSignInLinkIsDisplayed() {
        My_Trip_Tab myTripTab = new My_Trip_Tab();
        boolean displayed = myTripTab.getSign_in_link().isDisplayed();
        Assert.assertTrue(displayed);


    }
}
