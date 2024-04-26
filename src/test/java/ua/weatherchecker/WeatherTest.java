package ua.weatherchecker;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class WeatherTest {

    @Test
    public void checkWeather() {
        open("https://www.google.com/");
//        $(By.name("q"))
//                .setValue("Test")
//                .pressEnter();
//        $$x("//div/a").shouldHave(CollectionCondition.size(5));
        int a = 0;

    }
}
