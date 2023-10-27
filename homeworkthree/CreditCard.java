package com.proftelran.org.homeworkthree;

public class CreditCard {

   public CreditCard (double number, int pin, int balanceCard, Currency currency) {
      this.number = number;
      this.pin = pin;
      this.balanceCard = balanceCard;
      this.currency = currency;
   }

   private double number;
   private int pin;
   private int balanceCard;
   private Currency currency;

   public double getNumber() {
      return number;
   }

   public void setNumber(double number) {
      this.number = number;
   }

   public int getPin() {
      return pin;
   }

   public void setPin(int pin) {
      this.pin = pin;
   }

   public int getBalanceCard() {
      return balanceCard;
   }

   public void setBalanceCard(int balanceCard) {
      this.balanceCard = balanceCard;
   }

   public Currency getCurrency() {
      return currency;
   }

   public void setCurrency(Currency currency) {
      this.currency = currency;
   }


}
