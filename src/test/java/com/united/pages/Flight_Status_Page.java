package com.united.pages;

import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class Flight_Status_Page {

    public Flight_Status_Page() {
        PageFactory.initElements(driver, this);
    }

}


