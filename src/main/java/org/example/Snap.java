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
        int turn = 0;
        Player playerOne = Player.setPlayerOneAtGameStart();
        Player playerTwo = Player.setPlayerTwoAtGameStart();
        System.out.println(playerOne +" and " + playerTwo);
        createPile();
        System.out.println("The First card on the pile is: ");
        System.out.println(pileOfCards);

        while(!deckOfCards.isEmpty() && snap != 1){
            if(turn % 2 == 0){
                System.out.println(playerOne.getName() + " - Press 'Enter' to draw a card");
            }else{
                System.out.println(playerTwo.getName() + " - Press 'Enter' to draw a card");
            }
            userEnter.nextLine();
            createPile();
            System.out.println(pileOfCards);
            if(Objects.equals(pileOfCards.get(pileOfCards.size() - 2).getSymbol(), pileOfCards.getLast().getSymbol())){
                snap += 1;
            }
            turn += 1;
        }
        if(turn % 2 != 0){
            System.out.println("SNAP! \n" + playerOne.getName() + " Wins!");
        }else {
            System.out.println("SNAP! \n" + playerTwo.getName() + " Wins!");
        }

    }







    // deck of dealt cards needs creating
    // when last index == second to last index then SNAP
}
