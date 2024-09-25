package org.example;

public class Main {
    public static void main(String[] args) {

//        CardGame deck = new CardGame("Starter Deck");
        Snap snapGame = new Snap("First game");

        snapGame.shuffleDeck();
        System.out.println(snapGame.getDeck());

        snapGame.snapPlay();

//        deck.shuffleDeck();
//        System.out.println(deck.getDeck());
    }
}