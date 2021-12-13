package com.united.tabs.flightstatustab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Flight_Status {
    @FindBy(xpath = "//*[@id=\"statusTab\"]")
    WebElement flight_status;

    @FindBy(xpath = "//*[@id=\"flightStatusDestinationInput\"]")
    WebElement to_field;

    @FindBy(xpath = "//*[@id=\"flightStatusDestinationInput-menu-item-0\"]/button")
    WebElement select_airport;

    @FindBy(xpath = "//*[@id=\"flightStatusModel\"]/div/button")
    WebElement search_button;

    @FindBy(css = "div[class=\"app-components-flifo-ResultsTable-resultsTable__data--cGMzx\"] >div")
    private List<WebElement> results_list;

    @FindBy(xpath = "//*[@id=\"flightStatusModel.flightNumber\"]")
    WebElement flight_number;

    @FindBy(xpath = "//*[@id=\"flightStatusModel.flightNumber_aria\"]")
    WebElement valid_flight_number;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/main/section/div/div/div[2]/div[2]/div/div/p")
    WebElement the_number_you_entered_is_not_a_valid_flight_number;

    public WebElement getThe_number_you_entered_is_not_a_valid_flight_number() {
        return the_number_you_entered_is_not_a_valid_flight_number;
    }

    public WebElement getValid_flight_number() {
        return valid_flight_number;
    }

    public WebElement getFlight_number() {
        return flight_number;
    }

    public WebElement getSearch_button() {
        return search_button;
    }

    public WebElement getSelect_airport() {
        return select_airport;
    }

    public WebElement getTo_field() {
        return to_field;
    }

    public WebElement getFlight_status() {
        return flight_status;
    }

    public List<WebElement> getResults_list() {
        return results_list;
    }

    public  Flight_Status() {
        PageFactory.initElements(driver, this);

    }
}
