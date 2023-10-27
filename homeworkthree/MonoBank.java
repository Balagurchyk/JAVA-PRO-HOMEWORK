package com.proftelran.org.homeworkthree;

public class MonoBank extends ATM implements Converter {
    public MonoBank(int amountInAtm, Currency currency) {
        super(amountInAtm, String.valueOf(currency));
    }
}
