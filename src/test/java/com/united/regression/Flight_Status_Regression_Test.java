package com.united.regression;

import com.united.tabs.flightstatustab.Flight_Status;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Flight_Status_Regression_Test {
    @Given("click On flight status tab")
    public void click_on_flight_status_tab() {
        Flight_Status flight_status = new Flight_Status();
        flight_status.getFlight_status().click();
        Common.waitInSecond(2);

    }
    @And("fill out from and to fields")
    public void fill_out_from_and_to_fields() {
        Flight_Status flight_status = new Flight_Status();
        flight_status.getTo_field().click();
        Common.waitInSecond(1);
        flight_status.getTo_field().sendKeys("NEW");
        flight_status.getSelect_airport().click();
        Common.waitInSecond(2);
        flight_status.getSearch_button().click();
        Common.waitInSecond(2);


    }
    @Then("Verify that user is on flight schedules page")
    public void verify_that_user_is_on_flight_schedules_page() {
        Flight_Status flight_status = new Flight_Status();
        int size = flight_status.getResults_list().size();
        Assert.assertTrue(size>0);

    }


    @And("click on flight number field")
    public void clickOnFlightNumberField() {
        Flight_Status flight_status = new Flight_Status();
        flight_status.getFlight_number().click();
        Common.waitInSecond(2);

    }

    @And("fill out the field with alphabets")
    public void fillOutTheFieldWithAlphabets() {
        Flight_Status flight_status = new Flight_Status();
        flight_status.getFlight_number().sendKeys("abc");
        flight_status.getSearch_button().click();
        Common.waitInSecond(1);




    }

    @Then("verify that flight number field should accept just numbers")
    public void verifyThatFlightNumberFieldShouldAcceptJustNumbers() {
        Flight_Status flight_status = new Flight_Status();
        boolean displayed = flight_status.getValid_flight_number().isDisplayed();
        Assert.assertTrue(displayed);


    }

    @And("fill out the field with invalid flight number")
    public void fillOutTheFieldWithInvalidFlightNumber() {
        Flight_Status flight_status = new Flight_Status();
        flight_status.getFlight_number().sendKeys("0000");
        Common.waitInSecond(2);


    }
    @And("click on search button")
    public void clickOnSearchButton() {
        Flight_Status flight_status = new Flight_Status();
        flight_status.getSearch_button().click();
        Common.waitInSecond(1);

    }


    @Then("verify that the number you entered is not a valid flight number.")
    public void verifyThatTheNumberYouEnteredIsNotAValidFlightNumber() {
        Flight_Status flight_status = new Flight_Status();
        boolean displayed = flight_status.getThe_number_you_entered_is_not_a_valid_flight_number().isDisplayed();
        Assert.assertTrue(displayed);


    }
}


