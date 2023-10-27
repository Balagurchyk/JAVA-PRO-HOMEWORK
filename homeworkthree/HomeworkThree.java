package com.proftelran.org.homeworkthree;

import java.util.Scanner;

public class HomeworkThree {


          // Как сделать счётчик (пытался на строчках 33-35), чтобы карта блокировалась после трёх неверных попыток ввода?

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrivatBank privatBankOne = new PrivatBank(8000, Currency.USD);
        PrivatBank privatBankTwo = new PrivatBank(7000, Currency.USD);
        OschadBank oschadBank = new OschadBank(6000, Currency.USD);
        MonoBank monoBank = new MonoBank(15000, Currency.USD);

        CreditCard creditCard = new CreditCard(414947531, 1111, 10000, Currency.EUR);

        ATM[] atms = {privatBankOne, privatBankTwo, oschadBank, monoBank};
        for (int i = 0; i < atms.length; i++) {
            if (atms[i] instanceof Converter) {
                System.out.println("Введите пин: ");
                int pin = scanner.nextInt();
                if (monoBank.pinCheck(creditCard, pin)) {
                    System.out.println("Пин принят! Введите сумму, которую желаете снять в " + Currency.USD + " :");
                    int amount = scanner.nextInt();
                    monoBank.withdrawalCash(creditCard, monoBank.convert(amount / 2));
                } else {
                    i--;
                    System.out.println("Пин введён неверно! Попробуйте ещё раз: ");
//                    for (i = 1; i <= 3; i++) {
//                        if (pin != creditCard.getPin()) {
//                            System.out.println("Карта заблокирована!");
//                        }
//                    }
                }
            }
        }
    }
}
