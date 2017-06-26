package com.example.michaelrobertson.blackjack;

import java.util.ArrayList;

/**
 * Created by michaelrobertson on 23/06/2017.
 */

public class Player implements Playable {

    ArrayList<Card> playerHand;

    public Player() {
        this.playerHand = new ArrayList<>();
    }

    public int handCount() {
        return playerHand.size();
    }


    public void drawCard(Card card) {
        playerHand.add(card);
    }


    public int getTotal() {
        int total = 0;
        for (Card card : playerHand) {
            total += card.getValue();
        }
        return total;
    }


    public void showHand() {
        return null;
    }

}
