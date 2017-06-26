package com.example.michaelrobertson.blackjack;

import deck.CardNumber;
import deck.CardSuit;

/**
 * Created by michaelrobertson on 23/06/2017.
 */

public class Card {

//    PROPERTIES (Instance Variable)
    CardSuit cardSuit;
    CardNumber cardNumber;

//    CONSTRUCTOR
    public Card(CardSuit cardSuit, CardNumber cardNumber){
        this.cardSuit = cardSuit;
        this.cardNumber = cardNumber;

    }

//    method to get the cardSuit.
    public CardSuit getCardSuit() {
        return cardSuit;
    }

//    method to get the card number(face)
    public CardNumber getCardNumber() {
        return cardNumber;
    }

//    method to get the value of the card drawn.
    public int getValue() {
        return cardNumber.getNumber();
    }
}
