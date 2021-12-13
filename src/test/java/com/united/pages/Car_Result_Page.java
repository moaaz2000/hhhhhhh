package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class Car_Result_Page {

    @FindBy(xpath = "//*[@id=\"ct-availability-list-no-result\"]/div/div[2]/div[1]/p")
    WebElement car_result;

    @FindBy(xpath = "//*[@id=\"ct-container\"]/div/div[2]/div[2]/ct-redeem-info-bar/div[1]/div/div[2]/div[2]")
    WebElement mileage_plus;

    @FindBy(xpath = "//*[@id=\"ct-container\"]/div/div[1]/ul/li[1]")
    WebElement age_twenty_five_result;

    public WebElement getAge_twenty_five_result() {
        return age_twenty_five_result;
    }

    public WebElement getMileage_plus() {
        return mileage_plus;
    }

    public WebElement getCar_result() {
        return car_result;
    }

    public Car_Result_Page() {
        PageFactory.initElements(driver, this);
    }

}
