package com.proftelran.org.homeworkthree;

public class PrivatBank extends ATM {
    public PrivatBank(int amountInAtm, Currency currency) {
        super(amountInAtm, String.valueOf(currency));
    }
}
