package com.united.regression;

import com.beust.jcommander.JCommander;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.united.pages.Reservation_page;
import com.united.pages.Travel_Info_Page;
import com.united.tabs.booktab.Book_Tab;
import com.united.utils.Common;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.print.Book;

public class Flight_Regression_Test {
    @Then("verify that departing and return date fields should displayed")
    public void verifyThatDepartingAndReturnDateFieldsShouldDisplayed() {
        Book_Tab book_tab = new Book_Tab();
        boolean displayed = book_tab.getDepart_date_filed_display().isDisplayed();
        boolean displayed1 = book_tab.getReturn_date_filed_display().isDisplayed();
        Assert.assertTrue(displayed && displayed1);


    }

    @Then("verify that it has destination field")
    public void verifyThatItHasDestinationField() {
        Book_Tab book_tab = new Book_Tab();
        boolean displayed = book_tab.getDestination_field_displayed().isDisplayed();
        Assert.assertTrue(displayed);


    }


    @Given("click on travelers")
    public void clickOnTravelers() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_travelers_filed().click();
        Common.waitInSecond(5);

    }

    @And("click on adult plus icon ten times")
    public void clickOnAdultPlusIconTenTimes() throws InterruptedException {
        Book_Tab book_tab = new Book_Tab();

        for (int i = 0; i < 10; i++) {
            book_tab.getSelect_nine_adults().click();
            Thread.sleep(1000);
        }
    }

    @Then("verify that it display nine in adult input field")
    public void verifyThatItDisplayNineInAdultInputField() {
        Book_Tab book_tab = new Book_Tab();
        boolean displayed = book_tab.getAdults_nine_should_display().isDisplayed();
        Assert.assertTrue(displayed);


    }

    @Given("click on travelers link")
    public void clickOnTravelersLink() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_travelers_link().click();
        Common.waitInSecond(2);


    }


    @And("select one passenger from adult")
    public void selectOnePassengerFromAdult() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getAdd_one_adult().click();
        Common.waitInSecond(2);


    }

    @And("select one passenger from seniors")
    public void selectOnePassengerFromSeniors() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getAdd_one_senior().click();
        Common.waitInSecond(2);


    }

    @And("select one passenger from infants")
    public void selectOnePassengerFromInfants() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getAdd_one_infant().click();
        Common.waitInSecond(2);


    }

    @And("select one passenger from infants lap")
    public void selectOnePassengerFromInfantsLap() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getAdd_one_infant_on_lap().click();
        Common.waitInSecond(2);


    }

    @And("select one passenger from all children field")
    public void selectOnePassengerFromAllChildrenField() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getAdd_one_child_form_age_fifteen_to_seventeen().click();
        Common.waitInSecond(2);
        book_tab.getAdd_one_child_from_age_twelve_to_fourteen().click();
        Common.waitInSecond(2);
        book_tab.getAdd_one_child_from_age_five_to_eleven().click();
        Common.waitInSecond(2);
        book_tab.getAdd_one_child_from_age_two_to_four().click();
        Common.waitInSecond(2);


    }

    @Then("verify that all passengers are selected")
    public void verifyThatAllPassengersAreSelected() {
        Book_Tab book_tab = new Book_Tab();
        boolean displayed = book_tab.getTravelers_should_display_nine_travelers_when_selected().isDisplayed();
        Assert.assertTrue(displayed);

    }

    @Given("click on the the arrows in the middle of from and going to filed")
    public void clickOnTheTheArrowsInTheMiddleOfFromAndGoingToFiled() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_arrow_button().click();
        Common.waitInSecond(2);


    }

    @Then("verify that destinations switching from one field to other field")
    public void verifyThatDestinationsSwitchingFromOneFieldToOtherField() {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        String text = travel_info_page.getClick_on_depart().getText();
        Assert.assertTrue(text.isEmpty());


    }


    @Given("verify leaving from and going to have correct fields")
    public void verifyLeavingFromAndGoingToHaveCorrectFields() {
        Book_Tab book_tab = new Book_Tab();
        String placeholder = book_tab.getPlaceholder_form().getAttribute("placeholder");
        String placeholder1 = book_tab.getPlaceholder_to().getAttribute("placeholder");
        Assert.assertTrue(placeholder.contains("From*"));
        Assert.assertTrue(placeholder1.contains("To*"));

    }


    @Given("click on from field")
    public void clickOnFromField() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_from_field().click();
        Common.waitInSecond(2);


    }

    @And("click on cross button")
    public void clickOnCrossButton() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_x_button().click();
        Common.waitInSecond(2);

    }

    @Then("verify that from field is empty")
    public void verifyThatFromFieldIsEmpty() {
        Book_Tab book_tab = new Book_Tab();
        String value = book_tab.getClick_on_from_field().getAttribute("value");
        Assert.assertTrue(value.isEmpty());


    }

    @Given("Click on going to filed")
    public void clickOnGoingToFiled() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_going_to_field().click();
        Common.waitInSecond(2);


    }

    @And("find the airport location")
    public void findTheAirportLocation() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getFind_the_airport_by_filling_out_the_filed().sendKeys("MIA");
        Common.waitInSecond(2);

    }

    @And("click on that airport")
    public void clickOnThatAirport() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_airport().click();
        Common.waitInSecond(2);

    }

    @And("click on x button")
    public void clickOnXButton() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_X_button_to_clear_the_going_to_field().click();
        Common.waitInSecond(2);

    }

    @Then("verify that going to field is empty")
    public void verifyThatGoingToFieldIsEmpty() {
        Book_Tab book_tab = new Book_Tab();
        String value = book_tab.getClick_on_going_to_field().getAttribute("value");
        Assert.assertTrue(value.isEmpty());


    }

    @Given("click on flight list box arrow")
    public void clickOnFlightListBoxArrow() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_drop_down_arrow().click();
        Common.waitInSecond(2);
    }

    @And("select the economy class")
    public void selectTheEconomyClass() {
        Book_Tab book_tab = new Book_Tab();
        for (WebElement flights : book_tab.getList_of_flight_classes()) {
            if (flights.getAttribute("aria-label").equals("Economy")) {
                flights.click();
                break;


            }

        }
        Common.waitInSecond(1);
    }


    @And("select he premium economy")
    public void selectHePremiumEconomy() {
        Book_Tab book_tab = new Book_Tab();
        for (WebElement flights : book_tab.getList_of_flight_classes()) {
            if (flights.getAttribute("aria-label").equals("Premium economy")) {
                flights.click();
                break;

            }
        }
        Common.waitInSecond(1);
    }


    @And("select the business or first class")
    public void selectTheBusinessOrFirstClass() {
        Book_Tab book_tab = new Book_Tab();
        for (WebElement flights : book_tab.getList_of_flight_classes()) {
            if (flights.getAttribute("aria-label").equals("Business or First")) {
                flights.click();
                break;

            }
        }
        Common.waitInSecond(1);
    }

    @And("click on subtract button")
    public void clickOnSubtractButton() {
        Book_Tab book_tab = new Book_Tab();
        book_tab.getClick_on_subtract_button().click();
        book_tab.getClick_on_subtract_button().click();
        Common.waitInSecond(2);


    }

    @Then("verify that just one traveler is selected")
    public void verifyThatJustOneTravelerIsSelected() {
        Book_Tab book_tab = new Book_Tab();
        String text = book_tab.getGet_the_text().getText();
        Assert.assertTrue(text.contains("1"));


    }

    @And("click on travel with pet")
    public void clickOnTravelWithPet() {
        Book_Tab bookTab = new Book_Tab();
        bookTab.getClick_on_travel_with_a_pet().click();
        Common.waitInSecond(1);

    }

    @And("click on select number of pet")
    public void clickOnSelectNumberOfPet() throws InterruptedException {
        Reservation_page reservation_page = new Reservation_page();
        reservation_page.getClick_on_Select_number_of_pet().click();
        Thread.sleep(2000);


            }



    @Then("verify that user is able to select just one pet")
    public void verifyThatUserIsAbleToSelectJustOnePet() throws InterruptedException {
        Reservation_page reservation_page = new Reservation_page();
        Select select = new Select(reservation_page.getClick_on_Select_number_of_pet());
        select.selectByValue("1");
        Common.waitInSecond(4);

    }

    @Given("click on advance search link")
    public void clickOnAdvanceSearchLink() {
        Book_Tab bookTab = new Book_Tab();

        bookTab.getClick_on_advance_Search_button().click();
        Common.waitInSecond(3);
    }

    @Then("verify that advance search filed provide advance search fields")
    public void verifyThatAdvanceSearchFiledProvideAdvanceSearchFields() {
        Reservation_page reservation_page = new Reservation_page();
        boolean displayed = reservation_page.getAll_advance_search_field_displaying().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Given("click on flexible date")
    public void clickOnFlexibleDate() {
        Book_Tab bookTab = new Book_Tab();
        bookTab.getClick_on_flexible_date().click();
        Common.waitInSecond(2);

    }

    @Then("verify that date text field have month and days dropdown")
    public void verifyThatDateTextFieldHaveMonthAndDaysDropdown() {
        Book_Tab bookTab = new Book_Tab();
        boolean displayed = bookTab.getMonth_drop_down().isDisplayed();
        boolean displayed1 = bookTab.getDays_drop_down().isDisplayed();
        Assert.assertTrue(displayed && displayed1);


    }
}





