package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String option = "";

        while(!Objects.equals(option, "2")) {

            while (!Objects.equals(option, "1") && !Objects.equals(option, "2")) {
                MenuHeadings.mainMenuHeading();

                System.out.println("Pick a card game to play: \n 1. Snap \n 2. Exit");
                option = user.nextLine();
            }
            if (Objects.equals(option, "1")) {
                String gameMode = "";

                MenuHeadings.snapMenuHeading();
                Snap snapGame = new Snap("Snap");

                while(!Objects.equals(gameMode, "1") && !Objects.equals(gameMode, "2")){

                    System.out.println("Pick your mode: \n 1. One player \n 2. Two Player");
                    gameMode = user.nextLine();
                }
                if(Objects.equals(gameMode, "1")){
                    snapGame.snapPlayOnePlayer();
                }else{
                    snapGame.snapPlay();
                }

                String playAgain = "";
                do {
                    System.out.println("Do you want to play again? \n 1. Yes \n 2. No \n 3. Exit");
                    playAgain = user.nextLine();
                } while (!Objects.equals(playAgain, "1") && !Objects.equals(playAgain, "2") && !Objects.equals(playAgain, "3"));

                option = switch (playAgain) {
                    case "1" -> "1";
                    case "2" -> "";
                    case "3" -> "2";
                    default -> option;
                };


            } else if(Objects.equals(option, "2")) {
                System.out.println("Exiting...");
            }

        }
        user.close();


    }
}