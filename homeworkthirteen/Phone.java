package com.proftelran.org.homeworkthirteen;

public class Phone {
    String number;
    PhoneType type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    public Phone(String number, PhoneType type) {
        this.number = number;
        this.type = type;
    }
}
