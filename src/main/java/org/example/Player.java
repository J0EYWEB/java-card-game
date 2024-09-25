package org.example;

import java.util.Scanner;

public class Player {
    String name;
    int id;
    static Scanner userName = new Scanner(System.in);

    public Player(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setPlayersAtGameStart(){
        System.out.println("Player One, enter your name: ");
        String playerOneName = userName.nextLine();
        Player playerOne = new Player(playerOneName, 1);
        System.out.println("Player Two, enter your name: ");
        String playerTwoName = userName.nextLine();
        Player playerTwo = new Player(playerTwoName, 2);
        System.out.println("Player One is " + playerOne.getName() + " and Player Two is " + playerTwo.getName());
    }

    @Override
    public String toString() {
        return "Player " + id +
                ": " + name;
    }
}
