package com.united.regression;

import com.united.pages.Car_Result_Page;
import com.united.pages.Reservation_page;
import com.united.tabs.cartab.Car_Tab;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static com.united.base.Hooks.driver;

public class Car_Regression_Test {
    @Given("click on car tab")
    public void click_on_car_tab() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getCar_tab().click();
        Common.waitInSecond(3);

    }
    @Then("verify all the required fields are available")
    public void verify_all_the_required_fields_are_available() {
        Car_Tab car_tab = new Car_Tab();
        boolean displayed = car_tab.getAll_input_fields().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @And("click on return car to same location")
    public void clickOnReturnCarToSameLocation() {
        Car_Tab car_tab = new Car_Tab();

        car_tab.getReturn_car_to_same_location_check_box().click();
        Common.waitInSecond(4);

        car_tab.getReturn_car_to_same_location_check_box().click();
        Common.waitInSecond(4);



    }

    @Then("verify that drop off location is disappear")
    public void verifyThatDropOffLocationIsDisappear() {
        Car_Tab car_tab = new Car_Tab();
        String text = car_tab.getDrop_of_location().getText();
        Assert.assertTrue(text.isEmpty());


    }

    @And("click on primary field check box")
    public void clickOnPrimaryFieldCheckBox() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getClick_on_primary_checkbox().click();
        Common.waitInSecond(2);
        car_tab.getClick_on_primary_checkbox().click();
        Common.waitInSecond(2);
    }

    @Then("verify that age field is disappear")
    public void verifyThatAgeFieldIsDisappear() {

    }

    @And("click on pickup location")
    public void clickOnPickupLocation() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getPickup_location().click();
        Common.waitInSecond(2);


    }

    @Then("fill out the pickup location")
    public void fillOutThePickupLocation() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getPickup_location().sendKeys("miami");
        Common.waitInSecond(2);
        car_tab.getClick_on_search_location().click();
        Common.waitInSecond(2);


    }



    @Then("click on pickup dates field")
    public void clickOnPickupDatesField() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getPickUp().click();

    }

    @And("select the date")
    public void selectTheDate() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getPickUp_date().click();
        Common.waitInSecond(2);

    }

    @Then("click on drop off date")
    public void clickOnDropOffDate() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getDrop_off_date().click();
        Common.waitInSecond(2);

    }

    @And("select drop off date")
    public void selectDropOffDate() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getSelect_drop_off_date().click();
        Common.waitInSecond(2);

    }

    @Then("click on book with miles check box")
    public void clickOnBookWithMilesCheckBox() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getBook_with_miles().click();
        Common.waitInSecond(2);


    }

    @And("click on find car button")
    public void clickOnFindCarButton() {
        Car_Tab car_tab = new Car_Tab();
        String url1 = driver.getCurrentUrl();
        car_tab.getFind_cars().click();
        Common.waitInSecond(15);
        String url2 = driver.getCurrentUrl();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        Assert.assertTrue(url1.equals(url2));



    }







    @Then("verify that checked with miles is returning the result with miles only")
    public void verifyThatCheckedWithMilesIsReturningTheResultWithMilesOnly() {
        Car_Result_Page car_result_page = new Car_Result_Page();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        String text = car_result_page.getMileage_plus().getText();
        Assert.assertTrue(text.contains("Sign in to your MileagePlus account to use miles for your rental."));


    }

    @Then("click on twenty five or older option")
    public void clickOnTwentyFiveOrOlderOption() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getTwenty_five_or_older_check_box().click();
        Common.waitInSecond(2);

    }

    @And("click on age field")
    public void clickOnAgeField() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getAge_field().click();
        Common.waitInSecond(2);
    }

    @Then("fill out the age field")
    public void fillOutTheAgeField() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getAge_field().sendKeys("18");
        Common.waitInSecond(3);


    }

    @Then("verify that age lesser than twenty one should display “Some car rental suppliers do not rent to young drivers. If you are travelling with an older person, it may help to make them your main driver")
    public void verifyThatAgeLesserThanTwentyOneShouldDisplaySomeCarRentalSuppliersDoNotRentToYoungDriversIfYouAreTravellingWithAnOlderPersonItMayHelpToMakeThemYourMainDriver() {
        Car_Result_Page car_result_page = new Car_Result_Page();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        String text = car_result_page.getCar_result().getText();
        Assert.assertTrue(text.contains("do not rent to young drivers"));


    }

    @And("Write twenty one in age field")
    public void writeTwentyOneInAgeField() {
        Car_Tab car_tab= new Car_Tab();
        car_tab.getInput_age_field().sendKeys("21");
        Common.waitInSecond(2);
    }

    @Then("verify that rental car with an age of twenty one should not return any search result")
    public void verifyThatRentalCarWithAnAgeOfTwentyOneShouldNotReturnAnySearchResult() {



    }

    @And("add date in the date field")
    public void addDateInTheDateField() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getInput_age_field().sendKeys("25");
        Common.waitInSecond(2);
    }

    @And("And click on find car button")
    public void andClickOnFindCarButton() {
        Car_Tab car_tab = new Car_Tab();
        car_tab.getFind_cars().click();
        Common.waitInSecond(3);


    }

    @Then("rental car with an age bigger than twenty one should return search result")
    public void rentalCarWithAnAgeBiggerThanTwentyOneShouldReturnSearchResult() {
        Car_Result_Page car_result_page = new Car_Result_Page();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        String text = car_result_page.getAge_twenty_five_result().getText();
        Assert.assertTrue(text.contains("SEARCH RESULTS"));


    }
}



