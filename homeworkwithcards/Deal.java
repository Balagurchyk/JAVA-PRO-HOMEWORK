package com.proftelran.org.homeworkwithcards;

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        final int cardsForPlayer = 5;
        int players;
        final Scanner sc = new Scanner(System.in);
        final int numberOfCards = Suit.values().length * Rank.values().length;

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();

                if (players <= 0) {
                    System.out.println("The number of players cannot be less than 1");
                } else if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    System.out.println("Too many players! There are not enough cards in the deck.");
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
                sc.next();
            }
        }

        Deck deck = new Deck();
        deck.shuffle();

        Player[] playersArray = new Player[players];
        for (int i = 0; i < players; i++) {
            playersArray[i] = new Player("Player" + (i + 1));
            for (int j = 0; j < cardsForPlayer; j++) {
                Card dealtCard = deck.dealCard();
                if (dealtCard != null) {
                    playersArray[i].receiveCard(dealtCard, j);
                } else {
                    System.out.println("Not enough cards in the deck!");
                    break;
                }
            }
        }
        for (Player player : playersArray) {
            player.displayPlayerCard();
        }
    }
}
