package org.example;

public class Main {
    public static void main(String[] args) {

        CardGame deck = new CardGame("Starter Deck");


        System.out.println(deck.getDeck());
        System.out.println(deck.dealCard());

    }
}