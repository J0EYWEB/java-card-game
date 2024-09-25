package org.example;

import java.util.Scanner;

public class Player {
    String name;
    int id;
    Scanner userName = new Scanner(System.in);

    public Player(String name){
        this.name = name;
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

    @Override
    public String toString() {
        return "Player " + id +
                ": '" + name;
    }
}
