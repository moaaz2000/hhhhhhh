package com.united.tabs.packagetab;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Package_Tab {

@FindBy(css = "#bookPackageTab")
    WebElement package_tab;

@FindBy(css = "input[id=vacationOriginInput]")
WebElement from_filed;

@FindBy(css = "#bookPackageTab")
WebElement select_from_airport;

@FindBy(css = "#vacationDestinationInput")
WebElement to_field;

@FindBy(css = "#vacationDestinationInput-menu-item-0 > button > div > span")
WebElement select_to_airport;

@FindBy(xpath = "//*[@id=\"DepartDate\"]")
WebElement departure_date;

@FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[5]")
WebElement select_date;

@FindBy(xpath = "//*[@id=\"ReturnDate\"]")
WebElement return_date;

@FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[2]/td[5]")
WebElement select_return_date;

@FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[3]/button/span")
WebElement find_trip;

@FindBy(xpath = "//*[@id=\"listingContent\"]/div/div/div")
WebElement search_result;

@FindBy(xpath = "//*[@id=\"selectedRooms\"]")
WebElement room_drop_down;

@FindBy(css = "ul[aria-labelledby=\"roomDescriptor\"]>li")
    List<WebElement> list_of_rooms;

@FindBy(xpath = "//*[@id=\"radiofield-item-id-packageType-2\"]")
WebElement flight_and_car;

@FindBy(xpath = "//*[@id=\"bookCruiseTab\"]/span")
WebElement cruise;

@FindBy(xpath = "//*[@id=\"travelAdvisoryLink\"]")
WebElement united_cruise_page;

    public WebElement getUnited_cruise_page() {
        return united_cruise_page;
    }

    public WebElement getCruise() {
        return cruise;
    }

    public WebElement getFlight_and_car() {
        return flight_and_car;
    }

    public List<WebElement> getList_of_rooms() {
        return list_of_rooms;
    }

    public WebElement getRoom_drop_down() {
        return room_drop_down;
    }

    public WebElement getSearch_result() {
        return search_result;
    }

    public WebElement getFind_trip() {
        return find_trip;
    }

    public WebElement getSelect_return_date() {
        return select_return_date;
    }

    public WebElement getReturn_date() {
        return return_date;
    }

    public WebElement getSelect_date() {
        return select_date;
    }

    public WebElement getDeparture_date() {
        return departure_date;
    }

    public WebElement getSelect_to_airport() {
        return select_to_airport;
    }

    public WebElement getTo_field() {
        return to_field;
    }

    public WebElement getSelect_from_airport() {
        return select_from_airport;
    }

    public WebElement getFrom_filed() {
        return from_filed;
    }

    public WebElement getPackage_tab() {
        return package_tab;
    }

    public Package_Tab() {
        PageFactory.initElements(driver, this);}
}
