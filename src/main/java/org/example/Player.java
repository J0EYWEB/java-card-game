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

    public static Player setPlayerOneAtGameStart(){
        System.out.println("Player One, enter your name: ");
        String playerOneName = userName.nextLine();
        return new Player(playerOneName, 1);
    }

    public static Player setPlayerTwoAtGameStart(){
        System.out.println("Player Two, enter your name: ");
        String playerTwoName = userName.nextLine();
        return new Player(playerTwoName, 2);
    }


    @Override
    public String toString() {
        return "Player " + id +
                ": " + name;
    }
}
