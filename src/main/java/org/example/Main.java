package org.example;

public class Main {
    public static void main(String[] args) {

        CardGame deck = new CardGame("Starter Deck");


        deck.sortDeckInNumberOrder();

        System.out.println("SORTED BY NUMBER \n" + deck.getDeck());

        deck.sortDeckIntoSuits();
        System.out.println("SORTED BY SUIT \n" + deck.getDeck());
    }
}