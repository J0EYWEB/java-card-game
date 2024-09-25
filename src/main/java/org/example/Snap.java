package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Snap extends CardGame{
    private final ArrayList<Card> pileOfCards = new ArrayList<Card>();
    private final Scanner userEnter = new Scanner(System.in);


    public Snap(String name) {
        super(name);
    }


    public void createPile(){
        pileOfCards.add(dealCard());
    }

    public void snapPlay() {
        int snap = 0;
       Player.setPlayersAtGameStart();

        while(!deckOfCards.isEmpty() && snap != 1){
            System.out.println("Press Enter to draw a card");
            userEnter.nextLine();
            createPile();
            System.out.println(pileOfCards);
            if(pileOfCards.size() > 1){
                if(Objects.equals(pileOfCards.get(pileOfCards.size() - 2).getSymbol(), pileOfCards.getLast().getSymbol())){
                    snap += 1;
                }
            }
        }
        System.out.println("SNAP!");
    }







    // deck of dealt cards needs creating
    // when last index == second to last index then SNAP
}
