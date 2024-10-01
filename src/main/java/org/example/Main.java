package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String option = "";

        while(!Objects.equals(option, "2")) {



            while (!Objects.equals(option, "1") && !Objects.equals(option, "2")) {
                System.out.println("    ___   ________   ___      ___  ________          ________   ________   ________   ________          ________   ________   _____ ______    _______    ________      \n" +
                        "   |\\  \\ |\\   __  \\ |\\  \\    /  /||\\   __  \\        |\\   ____\\ |\\   __  \\ |\\   __  \\ |\\   ___ \\        |\\   ____\\ |\\   __  \\ |\\   _ \\  _   \\ |\\  ___ \\  |\\   ____\\     \n" +
                        "   \\ \\  \\\\ \\  \\|\\  \\\\ \\  \\  /  / /\\ \\  \\|\\  \\       \\ \\  \\___| \\ \\  \\|\\  \\\\ \\  \\|\\  \\\\ \\  \\_|\\ \\       \\ \\  \\___| \\ \\  \\|\\  \\\\ \\  \\\\\\__\\ \\  \\\\ \\   __/| \\ \\  \\___|_    \n" +
                        " __ \\ \\  \\\\ \\   __  \\\\ \\  \\/  / /  \\ \\   __  \\       \\ \\  \\     \\ \\   __  \\\\ \\   _  _\\\\ \\  \\ \\\\ \\       \\ \\  \\  ___\\ \\   __  \\\\ \\  \\\\|__| \\  \\\\ \\  \\_|/__\\ \\_____  \\   \n" +
                        "|\\  \\\\_\\  \\\\ \\  \\ \\  \\\\ \\    / /    \\ \\  \\ \\  \\       \\ \\  \\____ \\ \\  \\ \\  \\\\ \\  \\\\  \\|\\ \\  \\_\\\\ \\       \\ \\  \\|\\  \\\\ \\  \\ \\  \\\\ \\  \\    \\ \\  \\\\ \\  \\_|\\ \\\\|____|\\  \\  \n" +
                        "\\ \\________\\\\ \\__\\ \\__\\\\ \\__/ /      \\ \\__\\ \\__\\       \\ \\_______\\\\ \\__\\ \\__\\\\ \\__\\\\ _\\ \\ \\_______\\       \\ \\_______\\\\ \\__\\ \\__\\\\ \\__\\    \\ \\__\\\\ \\_______\\ ____\\_\\  \\ \n" +
                        " \\|________| \\|__|\\|__| \\|__|/        \\|__|\\|__|        \\|_______| \\|__|\\|__| \\|__|\\|__| \\|_______|        \\|_______| \\|__|\\|__| \\|__|     \\|__| \\|_______||\\_________\\\n" +
                        "                                                                                                                                                           \\|_________|\n" +
                        "                                                                                                                                                                       \n" +
                        "                                                                                                                                                                       ");
                System.out.println("Pick a card game to play: \n 1. Snap \n 2. Exit");
                option = user.nextLine();
            }
            if (Objects.equals(option, "1")) {
                System.out.println(" _____  _   _   ___  ______ \n" +
                        "/  ___|| \\ | | / _ \\ | ___ \\\n" +
                        "\\ `--. |  \\| |/ /_\\ \\| |_/ /\n" +
                        " `--. \\| . ` ||  _  ||  __/ \n" +
                        "/\\__/ /| |\\  || | | || |    \n" +
                        "\\____/ \\_| \\_/\\_| |_/\\_|");

                Snap snapGame = new Snap("First game");
                CardGame.shuffleDeck();
                snapGame.snapPlay();

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