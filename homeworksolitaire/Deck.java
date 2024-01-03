package com.proftelran.org.homeworksolitaire;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = createShuffledDeck();
    }

    private List<Card> createShuffledDeck() {
        List<Card> deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    public Card dealCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public int size() {
        return cards.size();
    }
}