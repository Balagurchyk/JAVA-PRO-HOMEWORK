package com.proftelran.org.homeworkwithcards;

import java.util.Random;

public class Deck {

    private final Card[] cards;
    private int nextCardIndex = 0;

    public Deck() {
        cards = new Card[52];
        int index = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[index++] = new Card(suit, rank);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card dealCard() {
        if (nextCardIndex < cards.length) {
            Card dealtCard = cards[nextCardIndex++];
            return dealtCard;
        } else {
            nextCardIndex = 0;
            return null;
        }
    }
}