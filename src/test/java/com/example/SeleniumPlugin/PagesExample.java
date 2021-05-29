package com.example.SeleniumPlugin;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PagesExample {

    @Test
    void FirstTry() {
        open("https://todomvc.com/examples/backbone/");
        SelenideElement searchBox = $("input.new-todo");
        searchBox.sendKeys("Hasan");
        searchBox.pressEnter();

        SelenideElement label = $("body > section > section > ul > li > div > label");
        label.should(visible);
    }


}
