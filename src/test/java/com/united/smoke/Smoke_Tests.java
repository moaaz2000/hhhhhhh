package com.united.smoke;

import com.united.pages.Flight_Result_Page;
import com.united.pages.Travel_Info_Page;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class
Smoke_Tests {
    @Given("verify all the tabs on the homepage")
    public void verifyAllTheTabsOnTheHomepage() {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        List<WebElement> travelList = travel_info_page.getVerifyThatPageIsLoading();
        int size = travelList.size();
        System.out.println(size);
        Assert.assertEquals(size, 4);


    }

    @Given("fill out all the destination fields")
    public void fill_out_all_the_destination_fields() throws InterruptedException {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getFill_out_all_the_destination_fields().click();
        travel_info_page.getState_name().click();
        travel_info_page.getClick_X_button().click();
        travel_info_page.getFill_out_from_field().sendKeys("IAD");
        travel_info_page.getClick_on_washinghton().click();
        travel_info_page.getClick_on_to_field().click();
        travel_info_page.getFill_out_to_field().sendKeys("MIA");
        travel_info_page.getClick_on_Miami().click();
        travel_info_page.getClick_on_dates_column().click();
        travel_info_page.getClick_on_dates_x_button().click();
        travel_info_page.getClick_on_depart().click();
        travel_info_page.getSelect_depart_date().click();
        travel_info_page.getClick_return_date().click();
        travel_info_page.getSelect_return_date().click();


    }

    @And("click on find flight button")
    public void click_on_find_flight_button() throws InterruptedException {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getClick_on_findFlights_button().click();
        Thread.sleep(12000);


    }

    @Then("verify that user is able to see all the available flights")
    public void verify_that_user_is_able_to_see_all_the_available_flights() {
        Flight_Result_Page flight_result_page = new Flight_Result_Page();

        boolean result_displayed = flight_result_page.getResult_flight().isDisplayed();
        Assert.assertTrue(result_displayed);


    }

    @Then("verify that flight has been checked out")
    public void verify_that_flight_has_been_checked_out() {
        Flight_Result_Page flight_result_page = new Flight_Result_Page();
        String text = flight_result_page.getFlight_information().getText();
        Assert.assertTrue(text.contains("Depart on Jan 15, 2022"));

    }

    @Given("click on one way radio button")
    public void click_on_one_way_radio_button() throws InterruptedException {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getClick_on_way_radio_button().click();
        Thread.sleep(2000);


    }

    @Then("fill out leaving and destination fields")
    public void fill_out_leaving_and_destination_fields() throws InterruptedException {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getState_name().click();
        travel_info_page.getClick_X_button().click();
        travel_info_page.getFill_out_from_field().sendKeys("IAD");
        travel_info_page.getClick_on_washinghton().click();
        travel_info_page.getClick_on_to_field().click();
        travel_info_page.getFill_out_to_field().sendKeys("MIA");
        travel_info_page.getClick_on_Miami().click();


    }

    @Then("select the date filed")
    public void select_the_date_filed() throws InterruptedException {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getClick_on_dates_column().click();
        travel_info_page.getClick_on_reverse_arrow_to_go_to_january().click();
        travel_info_page.getSelect_depart_dates().click();


    }

    @Given("click on round trip radio button")
    public void click_on_round_trip_radio_button() {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getClick_on_round_trip_radio_button().click();


    }

    @Then("fill out leaving and destination fields fields")
    public void fill_out_leaving_and_destination_fields_fields() {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getState_name().click();
        travel_info_page.getClick_X_button().click();
        travel_info_page.getFill_out_from_field().sendKeys("IAD");
        travel_info_page.getClick_on_washinghton().click();
        travel_info_page.getClick_on_to_field().click();
        travel_info_page.getFill_out_to_field().sendKeys("MIA");
        travel_info_page.getClick_on_Miami().click();

    }

    @Then("select the dates")
    public void select_the_dates() throws InterruptedException {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getClick_on_dates_column().click();
        travel_info_page.getClick_on_dates_x_button().click();
        travel_info_page.getClick_on_depart().click();
        travel_info_page.getClick_on_forward_arrow().click();
        travel_info_page.getSelect_departure_date().click();
        Thread.sleep(2000);
        travel_info_page.getPick_return_date().click();


    }

    @Then("click on Travelers link")
    public void click_on_travelers_link() throws InterruptedException {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getClick_on_travelers_link().click();


    }

    @Then("select the amount of travelers")
    public void select_the_amount_of_travelers() throws InterruptedException {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        travel_info_page.getAdd_one_more_adult().click();
        travel_info_page.getAdd_one_more_Infant().click();
        travel_info_page.getClick_travelers_x_button().click();
        travel_info_page.getClick_on_findFlights_button().click();
        Thread.sleep(10000);


    }

    @Then("verify round trip flight has been checked out")
    public void verify_round_trip_flight_has_been_checked_out() {
        Flight_Result_Page flight_result_page = new Flight_Result_Page();
        String text = flight_result_page.getFlight_information().getText();
        Assert.assertTrue(text.contains(" Feb 15, 2022"));

    }

}
