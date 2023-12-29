package com.proftelran.org.homeworkwithcards;

public class Player {

    private final String name;
    private final Card[] playerCard;

    public Player(String name) {
        this.name = name;
        this.playerCard = new Card[5];
    }

    public void receiveCard(Card card, int index) {
        playerCard[index] = card;
    }

    public void displayPlayerCard() {
        System.out.println(name + "'s cards:");
        for (Card card : playerCard) {
            System.out.println(card);
        }
        System.out.println();
    }
}
