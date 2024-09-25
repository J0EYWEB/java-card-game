package org.example;

public class Main {
    public static void main(String[] args) {

        Snap snapGame = new Snap("First game");

        snapGame.shuffleDeck();
        System.out.println(snapGame.getDeck());

        snapGame.snapPlay();

    }
}