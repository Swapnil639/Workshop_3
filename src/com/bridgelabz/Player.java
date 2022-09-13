package com.bridgelabz;

import java.util.Arrays;

public class Player {

    private String playerName;
    private Card[] playerCards = new Card[9];

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Card[] getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(Card[] playerCards) {
        this.playerCards = playerCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerCards=" + Arrays.toString(playerCards) +
                '}';
    }
}