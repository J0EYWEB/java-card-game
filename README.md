# Java Card Game

A simple card game built with Java. This project demonstrates the implementation of core object-oriented principles, game mechanics, and logic for a card game.

## Features
- Deck creation and shuffling
- Player hands and game rounds
- Basic card game logic

## Prerequisites
- Java 11+
- Maven (for dependency management)

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/J0EYWEB/java-card-game.git
2. Navigate to the project directory:
   ```bash
   cd java-card-game
3. Build the project using Maven:
   ```bash
   mvn clean install
4. Run the game:
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.Main"

## How to play
- select which card game you want to play (only snap currently)
- Enter the names of each player
- Players take turns pressing enter to draw a card
- When a card matches the previous one, the play must type 'snap' within 2 seconds.
- If the player does not type 'snap' within 2 seconds, the opponent wins automatically.
- if 'snap' is not typed correctly or the enter key is accidently hit before any characters are typed, the game continues.
- 
