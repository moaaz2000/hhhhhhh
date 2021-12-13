package com.united.regression;

import com.united.tabs.hoteltab.Hotel_Tab;
import com.united.utils.Common;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Hotel_Regression_Test {
    @Given("click on hotel tab")
    public void clickOnHotelTab() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getClick_on_hotel_tab().click();
        Common.waitInSecond(2);
    }

    @Then("verify that all links are displaying")
    public void verifyThatAllLinksAreDisplaying() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        boolean displayed = hotel_tab.getVerify_all_links_displayed().isDisplayed();
        Assert.assertTrue(displayed);


    }

    @Then("verify that one traveler and one room is selected")
    public void verifyThatOneTravelerAndOneRoomIsSelected() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        boolean displayed = hotel_tab.getVerify_that_one_room_is_selected_by_default().isDisplayed();
        boolean displayed1 = hotel_tab.getVerify_that_one_traveler_is_selected_by_default().isDisplayed();
        Assert.assertTrue(displayed && displayed1);


    }

    @Given("click on travelers button")
    public void clickOnTravelersButton() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getClick_on_travelers_link().click();
        Common.waitInSecond(2);


    }


    @And("click on adult plus button eight times")
    public void clickOnAdultPlusButtonEightTimes() {
        Hotel_Tab hotel_tab = new Hotel_Tab();

        for (int i = 0; i < 10; i++) {
            hotel_tab.getClick_on_adult_plus_button_eight_times().click();
            Common.waitInSecond(1);
        }
    }


    @Then("click on children plus button eight times")
    public void clickOnChildrenPlusButtonEightTimes() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        for (int i = 0; i < 10; i++) {
            hotel_tab.getClick_on_children_plus_button_eight_times().click();
            Common.waitInSecond(1);
        }

    }

    @Then("Verify that traveler input field should display sixteen travelers")
    public void verifyThatTravelerInputFieldShouldDisplaySixteenTravelers() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        String value = hotel_tab.getTravelers_input_field().getAttribute("value");
        Assert.assertTrue(value.contains("16"));


    }

    @And("click on number of rooms link")
    public void clickOnNumberOfRoomsLink() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getClick_on_numbers_of_rooms().click();
        Common.waitInSecond(2);


    }

    @Then("select room eight")
    public void selectRoomEight() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        int size = hotel_tab.getList_of_rooms().size();
        Assert.assertEquals(size, 8);

    }

    @And("select more than one room")
    public void selectMoreThanOneRoom() throws InterruptedException {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getList_of_rooms().get(1).click();
        Thread.sleep(3000);
        String text = hotel_tab.getClick_on_numbers_of_rooms().getText();
        System.out.println(text);


    }


    @Then("verify that number of traveler filed should disappear")
    public void verifyThatNumberOfTravelerFiledShouldDisappear() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        boolean displayed = hotel_tab.getTravelers_input_field().isDisplayed();
        Assert.assertFalse(displayed);

    }

    @And("click on going to text field")
    public void clickOnGoingToTextField() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getGoing_to_button().click();
        Common.waitInSecond(1);


    }

    @And("fill out the going to text field")
    public void fillOutTheGoingToTextField() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getGoing_to_button().sendKeys("Wash");
        hotel_tab.getSelect_the_place().click();
        Common.waitInSecond(2);
    }

    @Then("click on check in date field")
    public void clickOnCheckInDateField() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getCheck_in_button().click();
        Common.waitInSecond(1);


    }

    @And("fill out he check in date field")
    public void fillOutTHeCheckInDateField() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getSelect_the_check_in_date().click();
        Common.waitInSecond(1);


    }

    @Then("click on checkout date field")
    public void clickOnCheckoutDateField() {
        Hotel_Tab hotel_tab = new Hotel_Tab();
        hotel_tab.getCheck_out_date_click().click();
        Common.waitInSecond(1);

    }


        @And("fill out the check out date field")
        public void fillOutTheCheckOutDateField () {
            Hotel_Tab hotel_tab = new Hotel_Tab();
            hotel_tab.getSelect_the_check_out_date().click();
            Common.waitInSecond(1);


        }

        @Then("click on book with miles")
        public void clickOnBookWithMiles () {
            Hotel_Tab hotel_tab = new Hotel_Tab();
            hotel_tab.getClick_book_with_miles().click();
            Common.waitInSecond(2);


        }

        @And("click on find hotels button")
        public void clickOnFindHotelsButton () {
            Hotel_Tab hotel_tab = new Hotel_Tab();
            hotel_tab.getFind_hotel().click();
            Common.waitInSecond(10);


        }

        @Then("verify that user is able to see the result")
        public void verifyThatUserIsAbleToSeeTheResult () {
            Hotel_Tab hotel_tab = new Hotel_Tab();
            boolean displayed = hotel_tab.getNarrow_result().isDisplayed();
            Assert.assertTrue(displayed);

        }
    }
