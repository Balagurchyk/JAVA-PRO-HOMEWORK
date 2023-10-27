package com.proftelran.org.homeworkthree;


       //Как привязать интерфейс, чтобы в строчках 41 и 43 подтягивался курс?
       //Сейчас у меня он 1 к 2, но завтра ж может быть 1 к 3 или 1 к 4.
public abstract class ATM {
    private int amountInAtm;
    private String currency;


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmountInAtm() {
        return amountInAtm;
    }

    public void setAmountInAtm(int amountInAtm) {
        this.amountInAtm = amountInAtm;
    }

    public String getCurrency() {
        return currency;
    }

    public ATM(int amountInAtm, String currency) {
        this.amountInAtm = amountInAtm;
        this.currency = currency;
    }

    public boolean pinCheck(CreditCard creditCard, int pin) {
        if (pin == creditCard.getPin()) {
            return true;
        } else {
            return false;
        }
    }

    public void withdrawalCash(CreditCard creditCard, int amount) {
        if (amount <= amountInAtm && amount <= creditCard.getBalanceCard() * 2) {
            System.out.println("Идёт выдача наличных в размере " + amount + " USD.");
            int newBalanceCard = creditCard.getBalanceCard() - amount / 2;
            creditCard.setBalanceCard(newBalanceCard);
            amountInAtm -= amount;
            System.out.println("Ваш баланс карты: " + newBalanceCard + " " + Currency.EUR);
            System.out.println("В банкомате осталось: " + amountInAtm + " " + Currency.USD);
        } else if (amount > creditCard.getBalanceCard()) {
            System.out.println("У Вас недостаточно денег на карте!");
        } else if (amount > amountInAtm) {
            System.out.println("В банкомате недостаточно денег!");
        }
    }

    public void depositCash(CreditCard creditCard, int amount) {
        int newBalanceCard = creditCard.getBalanceCard() + amount;
        creditCard.setBalanceCard(newBalanceCard);
        amountInAtm += amount;
    }
}
