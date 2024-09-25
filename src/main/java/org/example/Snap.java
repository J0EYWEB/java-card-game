package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame{
    private ArrayList<Card> pileOfCards = new ArrayList<Card>();
    private Scanner userEnter = new Scanner(System.in);




    public Snap(String name) {
        super(name);
    }


    public ArrayList<Card> createPile(){
        pileOfCards.add(dealCard());
        return pileOfCards;
    }

    public void snapPlay() {

        while(!deckOfCards.isEmpty()){
            System.out.println("Press Enter to draw a card");
            userEnter.nextLine();
            createPile();
            System.out.println(pileOfCards);
        }
    }







    // deck of dealt cards needs creating
    // when last index == second to last index then SNAP
}
