package org.example;

import java.util.ArrayList;

public class CardGame {
    private static final ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;
    private final String[] suits = {"♠","♥", "♦", "♣"};
    private final String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private final int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public CardGame() {
        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j < symbols.length; j++){
                deckOfCards.add(new Card(suits[i],symbols[j], values[j]));
            }
        }
    }

    public ArrayList<Card> getDeckOfCards(){
        return deckOfCards;
    }
}
