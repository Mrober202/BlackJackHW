package com.example.michaelrobertson.blackjack;

import java.util.ArrayList;
import java.util.Collections;

import deck.CardNumber;
import deck.CardSuit;

/**
 * Created by michaelrobertson on 23/06/2017.
 */

public class Dealer {

    private ArrayList<Card> deck;

    public Dealer() {
        this.deck = new ArrayList<Card>();
        populateDeck();
    }

//    method to put 52 cards into deck and shuffle them.
    public void  populateDeck() {
        for (CardSuit type : CardSuit.values()) {
            for (CardNumber number : CardNumber.values()) {
                deck.add(new Card(type, number));
                Collections.shuffle(deck);
            }
        }
    }

//    method to get the number of cards in deck.
    public int getDeckSize() {
        return deck.size();
    }

//    method to take the first card in the deck.
    public Card dealCard() {
        return deck.remove(0);
    }
}
