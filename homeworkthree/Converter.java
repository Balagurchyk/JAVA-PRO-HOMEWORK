package com.proftelran.org.homeworkthree;

public interface Converter {

    default int convert(int amount) {
        int usd = amount * 2;
        return usd;
    }
}
