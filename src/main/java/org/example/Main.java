package org.example;

public class Main {
    public static void main(String[] args) {

        CardGame deck = new CardGame("Starter Deck");


    deck.getDeck();
    System.out.println(deck.sortDeckInNumberOrder());

    }
}