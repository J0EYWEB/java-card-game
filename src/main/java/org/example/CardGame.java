package org.example;

import java.util.ArrayList;

public class CardGame {
    private final ArrayList<Card> deckOfCards = new ArrayList<>();
    private final String name;
    private final String[] suits = {"♠","♥", "♦", "♣"};
    private final String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private final int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public CardGame(String name) {
        this.name = name;
        for (String suit : suits) {
            for (int j = 0; j < symbols.length; j++) {
                deckOfCards.add(new Card(suit, symbols[j], values[j]));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        System.out.println(name);
        return deckOfCards;
    }
}
