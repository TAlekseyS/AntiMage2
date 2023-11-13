package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PressKupit {
    private SelenideElement buttonBuy = $(byText("Купить"));
}
