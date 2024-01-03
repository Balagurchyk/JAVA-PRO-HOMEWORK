package com.proftelran.org.homeworksolitaire;

//        Создать колоду карт и наполнить ее картами.(Можно карты взять из ранней домашней с картами)
//        Написать приложение которое будет при запуске перемешивать колоду карт.
//        И раскладывать ее в стопку - если в стопке две карты одной масти ложатся друг на друга, то их убираем из стопки.
//        В конце написать результат и вывести карты в стопке.
//        Пасьянс сошелся если осталось по 1 карте каждой масти (число карт каждой масти нечетное).

import java.util.*;

public class Solitaire {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Stack<Card> stack = new Stack<>();

        while (deck.size() > 4) {
            Card card = deck.dealCard();

            if (!stack.isEmpty() && stack.peek().getSuit().equals(card.getSuit())) {
                stack.pop();
            } else {
                stack.push(card);
            }
        }

        System.out.println("Результат пасьянса: ");
        for (Card remainingCard : stack) {
            System.out.println(remainingCard);
        }
        if (isSolitaireCompleted(stack)) {
            System.out.println("Пасьянс сошёлся!");
        } else {
            System.out.println("Пасьянс не сошёлся!");
        }
    }

    private static boolean isSolitaireCompleted(Stack<Card> stack) {
        HashMap<Suit, Integer> suitCounts = new HashMap<>();

        for (Card card : stack) {
            Suit suit = card.getSuit();
            suitCounts.put(suit, suitCounts.getOrDefault(suit, 0) + 1);
        }

        for (int count : suitCounts.values()) {
            if (count != 1) {
                return false;
            }
        }
        return true;
    }
}
