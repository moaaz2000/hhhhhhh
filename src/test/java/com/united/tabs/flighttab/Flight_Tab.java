package com.united.tabs.flighttab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class Flight_Tab {
    @FindBy(css = "#statusTab > h2 > span")
    WebElement flight_status_click;

    @FindBy(css = "#flightStatusModel > div > button > span")
    WebElement search_button;

    @FindBy(css ="#flightStatusModel > div")
    WebElement flight_tab_has_all_the_correct_fields;

    public WebElement getFlight_tab_has_all_the_correct_fields() {
        return flight_tab_has_all_the_correct_fields;
    }

    public WebElement getSearch_button() {
        return search_button;
    }

    public WebElement getFlight_status_click() {
        return flight_status_click;
    }
    public Flight_Tab() {
        PageFactory.initElements(driver, this);}
}
