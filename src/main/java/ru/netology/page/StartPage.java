package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class StartPage {
    private SelenideElement paymentButton = $(byText("Купить"));
    //private SelenideElement creditButton = $(byText("Купить в кредит"));

    private static final SelenideElement creditButton = $x("//span[text()='Купить в кредит']//ancestor::button");//АпроМашка

    public PaymentPage checkPaymentButton() {
        paymentButton.click();
        return new PaymentPage();

    }

    public CreditPage checkCreditButton() {
        creditButton.click();
        return new CreditPage();
    }
}