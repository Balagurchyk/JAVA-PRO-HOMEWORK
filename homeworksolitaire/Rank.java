package com.proftelran.org.homeworksolitaire;

public enum Rank {
    TWO("2"),
    THREE("3"),

    FOUR("4"),

    FIVE("5"),

    SIX("6"),

    SEVEN("7"),

    EIGHT("8"),

    NINE("9"),

    TEN("10"),

    JACK("Jack"),

    QUEEN("Queen"),

    KING("King"),

    ACE("Ace");

    private final String label;

    Rank(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
