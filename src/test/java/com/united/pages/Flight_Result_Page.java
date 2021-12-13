package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class Flight_Result_Page {
    @FindBy(xpath = "//*[@id=\"flightResults-content\"]/div[2]/div[1]/div/div[1]/div[2]/div")
    WebElement result_flight;

    @FindBy(xpath = "//*[@id=\"flightResults-content\"]/div[1]/div/div/div/div[1]/div[2]")
    WebElement flight_information;

    public WebElement getFlight_information() {
        return flight_information;
    }

    public WebElement getResult_flight() {
        return result_flight;
    }
    public Flight_Result_Page() {
        PageFactory.initElements(driver, this);
    }

}



