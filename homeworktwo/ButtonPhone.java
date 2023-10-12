package com.proftelran.org.homeworktwo;

public class ButtonPhone extends Phone {

    private int ownNumber;
    private int number;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(int number) {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber);
        super.call(number);
    }

    @Override
    public void receiveCall(int number) {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber);
        super.receiveCall(number);
    }
}
