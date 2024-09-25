package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    protected final ArrayList<Card> deckOfCards = new ArrayList<>();
    protected final String name;
    protected final String[] suits = {"♠","♥", "♦", "♣"};
    protected final String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    protected final int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

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

    public Card dealCard(){
        return deckOfCards.removeFirst();
    }

    public void sortDeckInNumberOrder(){
        deckOfCards.sort((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()));
    }

    public void sortDeckIntoSuits(){
        deckOfCards.sort((o1, o2) -> CharSequence.compare(o1.getSuit(), o2.getSuit()));
    }

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }
}
