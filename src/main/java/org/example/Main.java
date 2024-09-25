package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String option = "";

        while(!Objects.equals(option, "1") && !Objects.equals(option, "2")){
            System.out.println("Pick a card game to play: \n 1. Snap \n 2. Exit");
            option = user.nextLine();
        }
        if(Objects.equals(option, "1")){
            Snap snapGame = new Snap("First game");
            CardGame.shuffleDeck();
            snapGame.snapPlay();
        }else {
            System.out.println("Exiting...");
        }



    }
}