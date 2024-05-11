package com.example.wind.ui;

import com.codeborne.selenide.CollectionCondition;
import org.example.wind.Thing;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class WeatherTest extends BaseTest {

    @Test
    public void checkWeather() {
        open("https://www.google.com/");
        $x("//button[@id='L2AGLb']/div").click();
        $(By.name("q"))
                .setValue("Test")
                .pressEnter();

    }

    @Test
    public void checkWeather1() {
        open("https://www.google.com/");
        $x("//button[@id='L2AGLb']/div").click();
        $(By.name("q"))
                .setValue("Test")
                .pressEnter();
        $$x("//div/a").shouldHave(CollectionCondition.size(5));


    }

    @Test
    public void checkStreamApi() {
        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Board", 4, "hsdaf"));
        things.add(new Thing("Board1", 44, "hsdaf"));
        things.add(new Thing("Board4", 42, "hsdaf"));

    }
}
