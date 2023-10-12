package com.proftelran.org.homeworktwo;

public class HomeworkTwo {

    public static void main(String[] args) {
        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("Nokia 3310");
        buttonPhone.setOwnNumber(1257496);

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("iPhone 15");
        smartPhone.setOwnNumber(7254823);

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setPhoneName("Motorola DynaTAC 8000X");
        radioPhone.setOwnNumber(3541286);

        radioPhone.call(buttonPhone.getOwnNumber());
        buttonPhone.receiveCall(radioPhone.getOwnNumber());
        buttonPhone.call(smartPhone.getOwnNumber());
        smartPhone.receiveCall(buttonPhone.getOwnNumber());
        smartPhone.call(radioPhone.getOwnNumber());
        radioPhone.receiveCall(smartPhone.getOwnNumber());
    }
}
