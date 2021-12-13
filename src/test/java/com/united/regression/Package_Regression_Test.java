package com.united.regression;

import com.united.tabs.packagetab.Package_Tab;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hooks.driver;

public class Package_Regression_Test {
    @Given("click on package tab")
    public void click_on_package_tab() {
        Package_Tab package_tab = new Package_Tab();
        package_tab.getPackage_tab().click();
        Common.waitInSecond(6);

    }

    @And("fill out all the fields")
    public void fill_out_all_the_fields() {
        Package_Tab package_tab = new Package_Tab();
        package_tab.getFrom_filed().click();
        Common.waitInSecond(3);
        package_tab.getFrom_filed().sendKeys("Washington");
        Common.waitInSecond(3);
        package_tab.getSelect_from_airport().click();
        Common.waitInSecond(3);
        package_tab.getTo_field().click();
        package_tab.getTo_field().sendKeys("Miami,FL");
        Common.waitInSecond(3);
        package_tab.getDeparture_date().click();
        Common.waitInSecond(3);
        package_tab.getSelect_date().click();
        Common.waitInSecond(3);
        package_tab.getReturn_date().click();
        Common.waitInSecond(3);
        package_tab.getSelect_return_date().click();
        Common.waitInSecond(3);
        package_tab.getFind_trip().click();
        Common.waitInSecond(15);


    }
    @And("click on rooms dropdown")
    public void clickOnRoomsDropdown() {
        Package_Tab package_tab = new Package_Tab();
        package_tab.getRoom_drop_down().click();
        Common.waitInSecond(2);


    }


    @Then("verify that user is able to see search results")
    public void verify_that_user_is_able_to_see_search_results() {
        Package_Tab package_tab = new Package_Tab();
        int size = package_tab.getList_of_rooms().size();
        Assert.assertEquals(size,4);


    }

    @Then("verify that it has just four rooms")
    public void verifyThatItHasJustFourRooms() {



        
    }

    @And("click on the two rooms")
    public void clickOnTheTwoRooms() {
        Package_Tab package_tab = new Package_Tab();
        package_tab.getList_of_rooms().get(1).click();




    }

    @Then("verify that room containers says room")
    public void verifyThatRoomContainersSaysRoom() {
        Package_Tab package_tab = new Package_Tab();

        String text = package_tab.getRoom_drop_down().getText();
        Assert.assertTrue(text.contains("rooms"));
    }

    @And("click on flight and car dropdown")
    public void clickOnFlightAndCarDropdown() {
        Package_Tab package_tab = new Package_Tab();
        package_tab.getFlight_and_car().click();
        Common.waitInSecond(1);


    }

    @Then("verify that rooms field should disappear")
    public void verifyThatRoomsFieldShouldDisappear() {
        Package_Tab package_tab = new Package_Tab();
        boolean displayed = package_tab.getRoom_drop_down().isDisplayed();
        Assert.assertFalse(displayed);


    }

    @Given("click on cruise link")
    public void clickOnCruiseLink() {
        Package_Tab package_tab = new Package_Tab();
        package_tab.getCruise().click();
        Common.waitInSecond(1);


    }

    @Then("verify that user should navigate to united cruises page")
    public void verifyThatUserShouldNavigateToUnitedCruisesPage() {
        Package_Tab package_tab = new Package_Tab();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        boolean displayed = package_tab.getUnited_cruise_page().isDisplayed();
        Assert.assertTrue(displayed);


    }
}


