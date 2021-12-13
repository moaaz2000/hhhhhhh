package com.united.sanity;

import com.united.Sections.Footer_Section;
import com.united.Sections.Header_Section;
import com.united.pages.Travel_Info_Page;
import com.united.tabs.booktab.Book_Tab;
import com.united.tabs.checkintab.Check_In_Tab;
import com.united.tabs.flighttab.Flight_Tab;
import com.united.tabs.mytripTab.My_Trip_Tab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Sanity_Tests {
    @Given("click on language selector button on header")
    public void clickOnLanguageSelectorButtonOnHeader() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getClick_on_language_selector_button().click();
        Thread.sleep(1000);
    }

    @And("click on select language dropdown arrow")
    public void clickOnSelectLanguageDropdownArrow() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getClick_on_select_language_drop_down_arrow().click();
        Thread.sleep(1000);
    }

    @And("select the language")
    public void selectTheLanguage() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        for (WebElement language : header_section.getListOfLanguages()) {
            if (language.getAttribute("aria-label").equals("Deutsch")) {
                language.click();
                break;
            }
        }
        Thread.sleep(1000);
    }


    @And("click on change button")
    public void clickOnChangeButton() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getClick_on_change_button().click();
        Thread.sleep(3000);


    }

    @Then("verify that language is changed")
    public void verifyThatLanguageIsChanged() {
        Header_Section header_section = new Header_Section();
        String text = header_section.getClick_on_language_selector_button().getText();
        Assert.assertTrue(text.contains("Deutsch"));
    }

    @Given("click on book tab")
    public void clickOnBookTab() throws InterruptedException {
        Book_Tab bookTab = new Book_Tab();
        bookTab.getClick_on_book_tab();
        Thread.sleep(2000);


    }

    @Then("verify that book tab has all the correct fields")
    public void verifyThatBookTabHasAllTheCorrectFields() {
        Book_Tab bookTab = new Book_Tab();
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        boolean displayed = bookTab.getBook_tab_has_all_the_correct_fields().isDisplayed();
        boolean displayed1 = travel_info_page.getClick_on_findFlights_button().isDisplayed();
        Assert.assertTrue(displayed && displayed1);
    }

    @And("click on flight status")
    public void clickOnFlightStatus() throws InterruptedException {
        Flight_Tab flightTab = new Flight_Tab();
        flightTab.getFlight_status_click().click();
        Thread.sleep(2000);


    }

    @Then("verify that flight status has all the correct fields")
    public void verifyThatFlightStatusHasAllTheCorrectFields() {
        Flight_Tab flightTab = new Flight_Tab();
        boolean displayed = flightTab.getSearch_button().isDisplayed();
        boolean displayed1 = flightTab.getFlight_tab_has_all_the_correct_fields().isDisplayed();
        Assert.assertTrue(displayed && displayed1);


    }

    @And("click on check in tab")
    public void clickOnCheckInTab() throws InterruptedException {
        Check_In_Tab checkInTab = new Check_In_Tab();
        checkInTab.getCheck_in_click().click();
        Thread.sleep(2000);
    }

    @Then("verify that check in has all the correct fields")
    public void verifyThatCheckInHasAllTheCorrectFields() {
        Check_In_Tab checkInTab = new Check_In_Tab();
        boolean displayed = checkInTab.getSubmit_button_displayed().isDisplayed();
        boolean displayed1 = checkInTab.getAll_check_in_fields_displayed().isDisplayed();
        Assert.assertTrue(displayed && displayed1);

    }

    @And("click on my trips tab")
    public void clickOnMyTripsTab() throws InterruptedException {
        My_Trip_Tab myTripTab = new My_Trip_Tab();
        myTripTab.getMy_trip_click().click();
        Thread.sleep(2000);
    }

    @Then("verify that my trips has all the correct fields")
    public void verifyThatMyTripsHasAllTheCorrectFields() {
        My_Trip_Tab myTripTab = new My_Trip_Tab();
        boolean displayed = myTripTab.getSearch_button().isDisplayed();
        boolean displayed1 = myTripTab.getMy_trip_all_correct_field_displayed().isDisplayed();
        Assert.assertTrue(displayed && displayed1);


    }


    @Given("verify that header info is displayed with links")
    public void verifyThatHeaderInfoIsDisplayedWithLinks() {
        Header_Section header_section = new Header_Section();
        List<WebElement> travel_update_links = header_section.getTravel_update_links();
        for (WebElement links : travel_update_links) {
            boolean displayed = links.isDisplayed();
            Assert.assertTrue(displayed);
        }

    }

    @Given("click on the header Book tab")
    public void clickOnTheHeaderBookTab() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getClick_on_book_tab_on_header().click();
        Thread.sleep(2000);


    }

    @And("verify Book tab links are displayed on the panel")
    public void verifyBookTabLinksAreDisplayedOnThePanel() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getAll_book_tab_link_displayed().isDisplayed();
        Assert.assertTrue(displayed);

    }


    @Then("click on header My Trips tab")
    public void clickOnHeaderMyTripsTab() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getMy_trip_tab_click().click();
        Thread.sleep(2000);


    }

    @And("verify My Trips tab links are displayed on the panel")
    public void verifyMyTripsTabLinksAreDisplayedOnThePanel() {
        Header_Section header_section = new Header_Section();
        boolean my_trip_tab_links_displayed = header_section.getAll_my_trip_tags_links_displayed().isDisplayed();
        Assert.assertTrue(my_trip_tab_links_displayed);


    }

    @Then("click on header Travel tab")
    public void clickOnHeaderTravelTab() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getTravel_info_tab_click().click();
        Thread.sleep(2000);



    }

    @And("verify Travel tab links are displayed on the panel")
    public void verifyTravelTabLinksAreDisplayedOnThePanel() {
        Header_Section header_section = new Header_Section();
        boolean travel_tab_links_displayed = header_section.getAll_travel_tab_links_displayed().isDisplayed();
        Assert.assertTrue(travel_tab_links_displayed);

    }

    @Then("click on the header MileAgePlus tab")
    public void clickOnTheHeaderMileAgePlusTab() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getMillage_plus_click().click();
        Thread.sleep(2000);


    }

    @And("verify MileAgePlus tab related are displayed on the panel")
    public void verifyMileAgePlusTabRelatedAreDisplayedOnThePanel() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getMillage_plus_tab_links_displayed().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Then("click on the header Deals tab")
    public void clickOnTheHeaderDealsTab() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getDeals_tab_click().click();
        Thread.sleep(2000);

    }

    @And("verify Deals tab links are displayed on the panel")
    public void verifyDealsTabLinksAreDisplayedOnThePanel() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getDeals_links_displayed().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Then("click on the header Help tab")
    public void clickOnTheHeaderHelpTab() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getHelp_tab_click().click();
        Thread.sleep(2000);




    }

    @And("verify Help tab links are displayed on the panel")
    public void verifyHelpTabLinksAreDisplayedOnThePanel() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getHelp_tab_links_displayed().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Given("verify user is on home page")
    public void verifyUserIsOnHomePage() {
        Travel_Info_Page travel_info_page = new Travel_Info_Page();
        boolean displayed = travel_info_page.getFind_flight_button_displayed().isDisplayed();
        Assert.assertTrue(displayed);


    }

    @Then("verify all footer section links are not broken")
    public void verifyAllFooterSectionLinksAreNotBroken() {
        Footer_Section footer_section = new Footer_Section();
        boolean displayed = footer_section.getAll_footer_section_links_displayed().isDisplayed();
        Assert.assertTrue(displayed);
    }
}

