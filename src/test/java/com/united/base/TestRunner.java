package com.united.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features = {"src/test/resources/features"},
            glue = {"com/united"},
            tags = "@testing",
            plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
    )
    public class TestRunner extends AbstractTestNGCucumberTests {
    }


