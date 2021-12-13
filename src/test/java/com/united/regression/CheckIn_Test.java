package com.united.regression;

import com.united.tabs.checkintab.Check_In_Tab;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hooks.driver;

public class CheckIn_Test {
    @And("click on search field")
    public void clickOnSearchField() {
        Check_In_Tab check_in_tab = new Check_In_Tab();
        check_in_tab.getClick_search_button().click();
        Common.waitInSecond(2);

    }

    @Then("verify that it shows error message")
    public void verifyThatItShowsErrorMessage() {
        Check_In_Tab check_in_tab = new Check_In_Tab();
        boolean displayed = check_in_tab.getAlert_message().isDisplayed();
        Assert.assertTrue(displayed);

    }


    @And("click on check in detail link")
    public void clickOnCheckInDetailLink() {
        Check_In_Tab check_in_tab = new Check_In_Tab();
        check_in_tab.getCheck_in_link().click();
        Common.waitInSecond(4);



    }

    @Then("verify that it navigates user to correct page")
    public void verifyThatItNavigatesUserToCorrectPage() {
        Check_In_Tab check_in_tab = new Check_In_Tab();
        boolean displayed = check_in_tab.getNavigate_to_new_page().isDisplayed();
        Assert.assertTrue(displayed);

    }

    @And("click on check in with your mileage")
    public void clickOnCheckInWithYourMileage() {
        Check_In_Tab check_in_tab = new Check_In_Tab();
        check_in_tab.getMileage_link().click();
        Common.waitInSecond(5);

    }

    @Then("verify that user navigates to mileage page")
    public void verifyThatUserNavigatesToMileagePage() {
        Check_In_Tab check_in_tab = new Check_In_Tab();
        boolean displayed = check_in_tab.getConfermation_page().isDisplayed();
        Assert.assertTrue(displayed);


    }
}
