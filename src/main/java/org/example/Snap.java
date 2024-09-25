package org.example;

import java.util.*;
import java.util.concurrent.*;

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
        boolean snap = false;
        int turn = 0;
        CardGame.shuffleDeck();
        Player playerOne = Player.setPlayerOneAtGameStart();
        Player playerTwo = Player.setPlayerTwoAtGameStart();
        System.out.println(playerOne +" and " + playerTwo);
        createPile();
        System.out.println("The First card on the pile is: ");
        System.out.println(pileOfCards);

        while(!deckOfCards.isEmpty() && !snap){
            int time = 1;
            if(turn % 2 == 0){
                System.out.println(playerOne.getName() + " - Press 'Enter' to draw a card");
            }else{
                System.out.println(playerTwo.getName() + " - Press 'Enter' to draw a card");
            }

            userEnter.nextLine();
            createPile();
            System.out.println(pileOfCards);

            if(Objects.equals(pileOfCards.get(pileOfCards.size() - 2).getSymbol(), pileOfCards.getLast().getSymbol())){
                System.out.println("You have two Seconds to type 'Snap'!");

                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<String> future = executor.submit(() -> userEnter.nextLine().toLowerCase(Locale.ROOT));

                try{
                    String snapSystem = future.get(2, TimeUnit.SECONDS);
                    if(Objects.equals(snapSystem, "snap")){
                        snap = true;
                        turn += 1;
                        System.out.println("SNAP \n" );
                    }
                } catch (TimeoutException e) {
                    snap = true;
                    System.out.println("Time's up!");

                } catch (Exception e){
                    System.err.println("An error occurred: " + e.getMessage());
                }finally {
                    executor.shutdownNow();
                }
            }
            turn += 1;
        }
        if(turn % 2 == 0){
            System.out.println(playerOne.getName() + " Wins!");
        }else {
            System.out.println(playerTwo.getName() + " Wins!");
        }

    }

}
