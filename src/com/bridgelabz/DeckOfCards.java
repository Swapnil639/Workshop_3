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
}
