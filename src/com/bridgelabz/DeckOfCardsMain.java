package com.bridgelabz;

public class DeckOfCardsMain {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.initializeCards();
        deckOfCards.addPlayers();
        deckOfCards.changeSequence();
    }
}
