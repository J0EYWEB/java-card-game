package org.example;

public class Card {
    private final String suit;
    private final String symbol;
    private final int value;

    public Card(String suit, String symbol, int value){
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (symbol.length() > 1){
        return "\n ┌─────────┐" +
                "\n │" + symbol + "       │" +
                "\n │         │" +
                "\n │    " + suit + "    │" +
                "\n │         │" +
                "\n │       " + symbol + "│" +
                "\n └─────────┘ \n";
        } else {
            return "\n ┌─────────┐" +
                    "\n │" + symbol + "        │" +
                    "\n │         │" +
                    "\n │    " + suit + "    │" +
                    "\n │         │" +
                    "\n │        " + symbol + "│" +
                    "\n └─────────┘ \n";
        }

    }
}
