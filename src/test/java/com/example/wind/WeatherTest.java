package com.example.wind;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class WeatherTest extends BaseTest{

    @Test
    public void checkWeather() {
        open("https://www.google.com/");
        $x("//button[@id='L2AGLb']/div").click();
        $(By.name("q"))
                .setValue("Test")
                .pressEnter();
//        $$x("//div/a").shouldHave(CollectionCondition.size(5));
        int a = 0;

    }
}
