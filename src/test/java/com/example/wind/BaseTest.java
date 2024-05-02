package com.example.wind;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    @BeforeEach
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();

        Configuration.browser = "chrome";
        Configuration.headless = true;

        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

//    @AfterAll
//    public static void tearDown() {
//        WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();
//        webDriver.close();
//    }



}
