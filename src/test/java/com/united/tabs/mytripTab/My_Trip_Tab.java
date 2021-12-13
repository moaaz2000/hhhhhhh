package com.united.tabs.mytripTab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class My_Trip_Tab {
    @FindBy(css = "#tripsTab") WebElement my_trip_click;

    @FindBy(css = "#myTripsSubmitBtn") WebElement search_button;

    @FindBy(css = "#bookMyTrips") WebElement my_trip_all_correct_field_displayed;

    @FindBy(xpath = "//*[@id=\"bookMyTrips\"]/div[4]/a") WebElement find_your_travel_link;

    @FindBy(css = "#tripsTab > h2 > div > div > div > div:nth-child(1) > div > div") WebElement check_in_tab_button;

    @FindBy(xpath = "//*[@id=\"myTripsSubmitBtn\"]") WebElement search_button_click;

    @FindBy(xpath = "//*[@id=\"myTripsConfirmationNumber_aria\"]") WebElement alert_message;

    @FindBy(xpath = "//*[@id=\"bookMyTrips\"]/div[5]/span/a") WebElement sign_in_link;

    public WebElement getSign_in_link() {return sign_in_link;}

    public WebElement getAlert_message() {return alert_message;}

    public WebElement getSearch_button_click() {return search_button_click;}

    public WebElement getCheck_in_tab_button() {return check_in_tab_button;}

    public WebElement getFind_your_travel_link() {return find_your_travel_link;}

    public WebElement getMy_trip_all_correct_field_displayed() {return my_trip_all_correct_field_displayed;}

    public WebElement getSearch_button() {return search_button;}

    public WebElement getMy_trip_click() {
        return my_trip_click;
    }

    public My_Trip_Tab() {PageFactory.initElements(driver, this);}}

