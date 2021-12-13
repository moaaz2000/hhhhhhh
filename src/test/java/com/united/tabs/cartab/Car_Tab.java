package com.united.tabs.cartab;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Car_Tab {
    @FindBy(xpath = "//*[@id=\"bookCarTab\"]") WebElement car_tab;

    @FindBy(css = "#bookCarForm") WebElement all_input_fields;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[1]/div[2]/label") WebElement return_car_to_same_location_check_box;

    @FindBy(id = "bookCarDropoffInput") WebElement drop_of_location;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[2]/div[3]/label") WebElement click_on_primary_checkbox;

    @FindBy(xpath = "//*[@id=\"bookCarPickupInput\"]")
    WebElement pickup_location;

    @FindBy(xpath = "//*[@id=\"bookCarPickupInput-menu-item-0\"]/button/div/div[1]")
    WebElement click_on_search_location;

    @FindBy(xpath = "//*[@id=\"bookCarPickupDate\"]")
    WebElement pickUp;

    @FindBy(xpath="//*[@id=\"bookCarForm\"]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[4]")
    WebElement pickUp_date;

    @FindBy(xpath = "//*[@id=\"bookCarDropoffDate\"]")
    WebElement drop_off_date;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[5]/td[4]")
    WebElement select_drop_off_date;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[5]/label")
    WebElement book_with_miles;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[6]/div[1]/button")
    WebElement find_cars;

    @FindBy(xpath = "//*[@id=\"bookCarDropoffInput\"]")
    WebElement drop_off_location;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[2]/div[3]/label")
    WebElement twenty_five_or_older_check_box;

    @FindBy(xpath = "//*[@id=\"driversAge\"]")
    WebElement age_field;

    @FindBy(xpath = "//*[@id=\"driversAge\"]")
    WebElement input_age_field;

    public WebElement getInput_age_field() {
        return input_age_field;
    }

    public WebElement getAge_field() {
        return age_field;
    }

    public WebElement getTwenty_five_or_older_check_box() {
        return twenty_five_or_older_check_box;
    }

    public WebElement getDrop_off_location() {
        return drop_off_location;
    }

    public WebElement getFind_cars() {
        return find_cars;
    }

    public WebElement getBook_with_miles() {
        return book_with_miles;
    }


    public WebElement getSelect_drop_off_date() {
        return select_drop_off_date;
    }

    public WebElement getDrop_off_date() {
        return drop_off_date;
    }

    public WebElement getPickUp_date() {
        return pickUp_date;
    }

    public WebElement getPickUp() {
        return pickUp;
    }

    public WebElement getClick_on_search_location() {
        return click_on_search_location;
    }

    public WebElement getPickup_location() {
        return pickup_location;
    }

    public WebElement getClick_on_primary_checkbox() {return click_on_primary_checkbox;}

    public WebElement getDrop_of_location() {return drop_of_location;}

    public WebElement getReturn_car_to_same_location_check_box() {return return_car_to_same_location_check_box;}

    public WebElement getAll_input_fields() {return all_input_fields;}

    public WebElement getCar_tab() {return car_tab;}

    public Car_Tab() {PageFactory.initElements(driver, this);}}
