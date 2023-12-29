package com.proftelran.org.homeworkwithcards;

import java.util.Scanner;

public class Deal {

//    Домашняя работа на рефакторинг, ниже будет представлен код программы для карточной игры :
//    Краткое описание :
//    Программа Deal.java, которая должна имитировать раздачу карт для игры в покер.
//    Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n игроков (по 5 карт каждому)
//    из рассортированной колоды. Разделяет пять карт, выданных каждому игроку, пустой строкой.
//    Задача : отрефакторить данный код , а именно , разнести логику в отдельные классы, enums, методы.
//    Примеры - строковые массивы для suits и rank , можно заменить на массивы enums, в которых значения будут
//    соответствующими енамами и работать с ними.
//    Карту - можно сделать объектом card содержащую два поля suit и rank , которые будут enum.
//    Строковый массив  deck тогда станет массивом объектов card.
//    Каждого игрока тоже нужно сделать объектом, который будет в себе хранить массив выданных ему карт ( 5 штук)
//    Вывод и раздачу карт каждому игроку, вместо простого вывода в последнем блоке , под комментом
//    // the shuffled deck is displayed
//    Нужно заменить на присвоение конкретных карт из колоды, каждому игроку.
//    После вывести всех игроков и их карты.
//
//    Листинг программы :
//
//    public class Deal {
//
//        public static void main(String[] args) {
//            final int cardsForPlayer = 5;
//            int players;
//
//            final Scanner sc = new Scanner(System.in);
//            final Random random = new Random();
//
//            final String[] suits = {"clubs", "diamonds", "hearts", "spades"};
//            final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
//
//            final int numberOfCards = suits.length * rank.length; // number of cards
//
//            while (true) {
//                System.out.println("Enter the number of players: ");
//
//                if (sc.hasNextInt()) {
//                    players = sc.nextInt();
//                    if (cardsForPlayer * players <= numberOfCards) {
//                        break;
//                    } else {
//                        if (players == 0) {
//                            System.out.println("The game has been terminated.");
//                            break;
//                        } else if (players < 0) {
//                            System.out.println("The number of players cannot be less than 0");
//                        } else {
//                            System.out.println("Too many players!");
//                        }
//                    }
//                } else {
//                    System.out.println("You have not entered a number, or your number is too large!");
//                }
//            }
//
//            // deck initialization
//            String[] deck = new String[numberOfCards];
//            for (int i = 0; i < rank.length; i++) {
//                for (int j = 0; j < suits.length; j++) {
//                    deck[suits.length * i + j] = rank[i] + " " + suits[j];
//                }
//            }
//
//            // deck shuffling
//            for (int i = 0; i < numberOfCards; i++) {
//                int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
//                String temp = deck[card];
//                deck[card] = deck[i];
//                deck[i] = temp;
//            }
//
//            // the shuffled deck is displayed
//            for (int i = 0; i < players * cardsForPlayer; i++) {
//                System.out.println(deck[i]);
//
//                if (i % cardsForPlayer == cardsForPlayer - 1)
//                    System.out.println();
//            }
//        }
//    }
    
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
