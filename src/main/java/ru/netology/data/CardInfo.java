package ru.netology.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CardInfo {
    private String cardNumber;
    private String month;
    private String year;
    private String owner;
    private String cardCVC;
}
/*
    public CardInfo(String cardNumber, int month, int year, String owner, String cardCVC) {
        this.cardNumber = cardNumber;
        this.month = month;
        this.year = year;
        this.owner = owner;
        this.cardCVC = cardCVC;
    }

    // Геттеры и сеттеры для полей

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCardCVC() {
        return cardCVC;
    }

    public void setCardCVC(String cardCVC) {
        this.cardCVC = cardCVC;
    }

    //ВВод данных

}

 */

