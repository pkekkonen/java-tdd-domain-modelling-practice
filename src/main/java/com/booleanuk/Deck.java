package com.booleanuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    public ArrayList<Card> cards;
    public Random randomiser;


    public Deck() {
        randomiser = new Random();
        create();
        shuffle();
    }

    public Deck(Random randomiser) {
        this.randomiser = randomiser;
        create();
        shuffle();
    }


    private void create() {
        cards = new ArrayList<>();
        for(int value = 2; value <= 14; value++) {
            cards.add(new Card(Suit.HEARTS, value));
            cards.add(new Card(Suit.CLUBS, value));
            cards.add(new Card(Suit.DIAMONDS, value));
            cards.add(new Card(Suit.SPADES, value));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards, randomiser);
    }

    public ArrayList<Card> createHand(int noOfCards) {
        return new ArrayList<Card>(cards.subList(0, noOfCards));
    }

    public ArrayList<ArrayList<Card>> deal(int noOfHands, int noOfCards) {
        return new ArrayList<ArrayList<Card>>();
    }
}
