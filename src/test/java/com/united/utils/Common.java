package com.united.utils;

import org.openqa.selenium.WebElement;


public class Common {
    public static void waitInSecond(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        }
        catch (Exception I){
        }
    }


}
