package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {

    static Card[] deck = new Card[52];


    static List<Player> playersList = new ArrayList<>();


    public void initializeCards() {
        int cardIndex = 0;
        for (int i = 0; i < Card.suits.length; i++) {
            for (int j = 0; j < Card.ranks.length; j++) {
                Card card = new Card(Card.suits[i], Card.ranks[j]);
                deck[cardIndex] = card;
                cardIndex++;
            }
        }
    }

    public void addPlayers() {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers;
        do {
            System.out.println("Enter number of Players(2 to 4)");
            numberOfPlayers = scanner.nextInt();
        } while (numberOfPlayers < 2 || numberOfPlayers > 4);
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter Player name");
            String playerName = scanner.next();
            Player player = new Player();
            player.setPlayerName(playerName);
            playersList.add(player);
        }
    }

    public void changeSequence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current Sequence");
        System.out.println(playersList);
        System.out.println("Do you want to chnage the sequence(Y/N)");

        if (scanner.next().equalsIgnoreCase("y")) {
            for (int i = 0; i < playersList.size(); i++) {
                Player player = playersList.get(i);
                Player playerRef = null;
                do {
                    System.out.println("Enter player - " + (i + 1) + " name");
                    String playerName = scanner.next();
                    for (int j = 0; j < playersList.size(); j++) {
                        playerRef = playersList.get(j);
                        if (playerRef.getPlayerName().equals(playerName)) {
                            playersList.set(i,playerRef);
                            playersList.set(j,player);
                        }
                    }
                } while (playerRef == null);
            }
        }
        System.out.println("After changing Sequence ");
        System.out.println(playersList);
    }

}
