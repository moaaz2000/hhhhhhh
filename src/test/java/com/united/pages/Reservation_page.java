package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class Reservation_page {
    @FindBy(css = "select[name='bookFlightModel.advancedSearch.petCabin']")
    WebElement click_on_Select_number_of_pet;

    @FindBy(xpath = "//*[@id=\"petCabinType1172\"]/option[2]")
    WebElement click_on_one_pet;

    public WebElement getClick_on_one_pet() {
        return click_on_one_pet;
    }

    @FindBy(css ="#petCabinType1172 > option:nth-child(2)")
    WebElement text_of_pet;

    @FindBy(css = "#main-content > div")
    WebElement all_advance_search_field_displaying;

    @FindBy(xpath = "//*[@id=\"ct-container\"]/div/div[2]")
    WebElement user_is_on_reservation_page;

    public WebElement getUser_is_on_reservation_page() {
        return user_is_on_reservation_page;
    }

    public WebElement getAll_advance_search_field_displaying() {
        return all_advance_search_field_displaying;
    }

    public WebElement getText_of_pet() {
        return text_of_pet;
    }

    public WebElement getClick_on_Select_number_of_pet() {
        return click_on_Select_number_of_pet;
    }

    public Reservation_page() {
        PageFactory.initElements(driver, this);

    }

}
