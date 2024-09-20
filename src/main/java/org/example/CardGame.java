package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    public Card dealCard(){
       Card firstCard = deckOfCards.removeFirst();
       System.out.println("Your dealt card is: ");
       return firstCard;
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
